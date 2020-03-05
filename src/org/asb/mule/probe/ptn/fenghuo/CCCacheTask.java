package org.asb.mule.probe.ptn.fenghuo;

import com.alcatelsbell.nms.util.ObjectUtil;
import com.alcatelsbell.nms.valueobject.BObject;
import com.alcatelsbell.nms.valueobject.sys.Ems;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.EquipmentHolder;
import org.asb.mule.probe.framework.entity.ManagedElement;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Ronnie.Chen
 * Date: 2015/2/10
 * Time: 15:44
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class CCCacheTask implements Runnable {
    private Logger logger = null;
    private FenghuoService fenghuoService = null;
    private String emsDn = null;

    public CCCacheTask(Logger logger, FenghuoService fenghuoService, String emsDn) {
        this.logger = logger;
        this.fenghuoService = fenghuoService;
        this.emsDn = emsDn;
        ObjectUtil.newFolder("../cache/"+emsDn);

    }

    @Override
    public void run() {
        while (true) {
            try {
                doCC();
            } catch (Exception e){
                logger.error(e,e);
            }
            try {
                Thread.sleep(30 * 60 * 1000l);
            } catch (InterruptedException e) {

            }
        }
    }

    public void doCC() {
        logger.info("CCCacheTask start");
        List<String> neDns = (List)ObjectUtil.readObject(emsDn+"/NoCCNes");
        if (neDns == null) {
            List<ManagedElement> nes = fenghuoService.retrieveAllManagedElements();
            if (nes != null && nes.size() > 0) {
                neDns = new ArrayList<String>();
                for (ManagedElement ne : nes) {
                    neDns.add(ne.getDn());
                }

            }

        }
        if (neDns == null) return;
        List<String> successDns = new ArrayList<String>();
        for (String neDn : neDns) {
            // TODO Auto-generated method stub
            try {
                List<CrossConnect> ipccList = fenghuoService.retrieveAllCrossConnects(neDn);
                String logs = neDn + " ccsize = " + (ipccList == null ? null : ipccList.size());
                removeDuplicateDN(ipccList);


                List<EquipmentHolder> ehs = fenghuoService.retrieveAllEquipmentHolders(neDn);

                String neKey =neDn.substring(neDn.lastIndexOf(":") + 1).replaceAll(";", "-");
                if (ipccList != null && !ipccList.isEmpty()) {
                    ObjectUtil.saveObject(emsDn + "/CC-" + neKey, ipccList);
                    successDns.add(neDn);
                } else {
                    logger.info("cc is empty : ne = "+neDn);
                }

                if ( ehs != null && !ehs.isEmpty()) {
                    ObjectUtil.saveObject(emsDn + "/EH-" + neKey, ehs);
                } else {
                    logger.info("equipmenthoder is empty : dn = "+neDn);
                }

                logs += " rmsize=" + (ipccList == null ? null : ipccList.size());
            } catch (Exception e) {
                logger.error(e,e);
            }
        }

        neDns.removeAll(successDns);
        ObjectUtil.saveObject(emsDn + "/NoCCNes", neDns);
        logger.info("no cc size = "+neDns.size());

    }

    protected void removeDuplicateDN(List bos) {
        if (bos == null) bos = new ArrayList();
        int count = 0;
        HashMap map = new HashMap();
        String name = null;
        for (int i = 0; i < bos.size(); i++) {
            BObject bObject = (BObject) bos.get(i);
            name = bObject.getClass().getName();
            if (map.get(bObject.getDn()) != null)
                count++;
            map.put(bObject.getDn(), bObject);
        }
        bos.clear();
        bos.addAll(map.values());
//        if (count > 0)
//        getLogger().error("DuplicateDN "+name+" count = " + count);
    }
}
