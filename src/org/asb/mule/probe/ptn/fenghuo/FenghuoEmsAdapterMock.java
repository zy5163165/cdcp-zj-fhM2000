package org.asb.mule.probe.ptn.fenghuo;

import com.alcatelsbell.cdcp.nodefx.*;
import com.alcatelsbell.nms.util.SysProperty;
import com.alcatelsbell.nms.util.log.LogUtil;
import com.alcatelsbell.nms.util.protocol.FtpFunc;
import com.alcatelsbell.nms.util.protocol.SFtpFunc;
import com.alcatelsbell.nms.valueobject.sys.Ems;
import com.jcraft.jsch.ChannelSftp;
import org.asb.mule.probe.framework.entity.DeviceInfo;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

/**
 * Author: Ronnie.Chen
 * Date: 13-9-11
 * Time: 下午5:03
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class FenghuoEmsAdapterMock implements EmsAdapter {


    @Override
    public void newEms(Ems ems) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(ems);
    }

    @Override
    public List<DeviceInfo> listDevices(Ems ems) throws NodeException {
        return null;
    }

    @Override
    public void removeEms(Ems ems) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(ems);
    }

    @Override
    public void updateEms(Ems ems) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(ems);
    }

    @Override
    public boolean testEms(Ems ems) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(ems);
        return false;
    }

    @Override
    public LifecycleState getState(Ems ems) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(ems);
        return null;
    }

    @Override
    public void executeJob(EmsJob emsJob) throws NodeException {
        CorbaEms corbaEms = new CorbaEms(emsJob.getEms());
        runNow(corbaEms,emsJob.getSerial());
    }

    @Override
    public String getType() {
        return CDCPConstants.EMS_TYPE_FENGHUOOTNM2000_PTN;
    }

    private void runNow(CorbaEms corbaEms,String serial) {
        String host = SysProperty.getString("ftpHost");
        String user = SysProperty.getString("ftpUser");
        String password = SysProperty.getString("ftpPassword");
        String ftpRootPath = SysProperty.getString("ftpRootPath","/");
        SFtpFunc ftp = new SFtpFunc();

        Vector strings = new Vector();
        try {
            ChannelSftp connect = ftp.connect(host, 22, user, password);
            //   connect.cd("cdcp/PTN");
            strings = ftp.listFiles("cdcp/PTN", connect);
        } catch (Exception e) {
            LogUtil.error(e, e);
        }
        for (int i = 0; i < strings.size(); i++) {
            ChannelSftp.LsEntry file = ( ChannelSftp.LsEntry)strings.get(i);
            String filename = file.getFilename();
            if (filename.contains(corbaEms.getEmsName())) {
                try {
                    Thread.sleep(30000l);
                    FtpInfo ftpInfo = new FtpInfo(user,password,host,22,"cdcp/PTN",filename);
                    ftpInfo.setType("SFTP");

                    MessageUtil.sendSBIFinishMessage(ftpInfo,serial);
                    System.out.println(ftpInfo);
                    return;
                } catch (Exception e) {
                    LogUtil.error(this,e,e);
                }
            }
        }

        try {
            Thread.sleep(10000l);
            MessageUtil.sendSBIFailedMessage("北向接口同步失败",serial);
        } catch (Exception e) {
            LogUtil.error(getClass(), e, e);
        }
    }
}
