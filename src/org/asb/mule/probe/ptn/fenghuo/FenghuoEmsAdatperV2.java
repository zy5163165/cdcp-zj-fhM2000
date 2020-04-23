package org.asb.mule.probe.ptn.fenghuo;

import java.util.Map;

import org.asb.mule.probe.framework.service.CorbaSbiService;
import org.asb.mule.probe.framework.service.NbiService;
import org.asb.mule.probe.ptn.fenghuo.nbi.job.DayMigrationJob;
import org.asb.mule.probe.ptn.fenghuo.nbi.job.DayMigrationJob4SDH;
import org.asb.mule.probe.ptn.fenghuo.nbi.job.DayMigrationJob4newOTN;
import org.asb.mule.probe.ptn.fenghuo.nbi.job.DeviceJob;
import org.asb.mule.probe.ptn.fenghuo.sbi.service.CorbaService;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

import com.alcatelsbell.cdcp.nodefx.CorbaEmsAdapterTemplate;
import com.alcatelsbell.nms.valueobject.sys.Ems;

/**
 * Author: Ronnie.Chen
 * Date: 14-8-31
 * Time: 下午2:57
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class FenghuoEmsAdatperV2   extends CorbaEmsAdapterTemplate {


    @Override
    public Object doTestEms(NbiService nbiService) {
        return ((FenghuoService)nbiService).getCorbaService().isConnectState();
    }

    @Override
    public Object doSyncEms(NbiService nbiService, Ems ems, String _serial) {
        FenghuoService AluService = (FenghuoService)nbiService;
        if (ems.getTag1() == null) ems.setTag1("PTN");
        boolean logical = true;
        if (ems.getUserObject() != null && ems.getUserObject() instanceof Map) {
            String l = (String) ((Map) ems.getUserObject()).get("logical");
            if (l != null && l.equalsIgnoreCase("false"))
                logical = false;
        }
        if (ems.getTag1().equals("SDH") || ems.getTag1().equals("OTN") || ems.getTag1().equals("DWDM")) {


//            if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
//                logical = true;

            DayMigrationJob4SDH job = new DayMigrationJob4SDH();
            job.logical = logical;
            job.setService(AluService);
            job.setSerial(_serial);
            job.execute();
        }
        // omc新接口SDH/OTN
        else if (ems.getTag1().equals("NewSDH") || ems.getTag1().equals("NewOTN")
        		 || ems.getTag1().equals("NewPTN")|| ems.getTag1().equals("NewSPN")) {

        	DayMigrationJob4newOTN job = new DayMigrationJob4newOTN();
        	job.logical = logical;
        	job.setService(AluService);
        	job.setSerial(_serial);
        	job.execute();
        }
        else {
            DayMigrationJob job = new DayMigrationJob();
            job.logical = logical;
            job.setService(AluService);
            job.setSerial(_serial);
            job.execute();
        }

        return null;
    }

    @Override
    public Object doSyncDevice(NbiService nbiService, String _serial, String devicedn) {

        DeviceJob job = new DeviceJob(devicedn);
        job.setService(nbiService);
        job.setSerial(_serial);

        try {
            Ems ems = getEmsTable().get(devicedn.substring(devicedn.indexOf(":") + 1, devicedn.indexOf("@")));
            logger.info("ems  = "+ems.getDn()+" protocaltype = "+ems.getProtocalType());
            if (ems != null) {
                job.setEms(ems);
            }
        } catch (Exception e) {
            logger.error(e,e);
        }


        job.execute();
        return null;
    }

    @Override
    public CorbaSbiService createCorbaSbiService() {
        return new CorbaService();
    }

    @Override
    public NbiService createNbiService(CorbaSbiService corbaSbiService) {
        FenghuoService AluService = new FenghuoService();
        AluService.setCorbaService((CorbaService)corbaSbiService);
        return AluService;
    }

    @Override
    public String getType() {
        return "FH";
    }

    public static void main(String[] args) {
        String devicedn = "EMS:JH-OTNM2000-1-PTN@ManagedElement:134220491;108292";

        devicedn = devicedn.substring(devicedn.indexOf(":") + 1, devicedn.indexOf("@"));
        System.out.println("devicedn =" + devicedn);

    }
}

