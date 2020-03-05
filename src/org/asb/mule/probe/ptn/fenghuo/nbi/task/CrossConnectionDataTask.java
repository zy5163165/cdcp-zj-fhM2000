package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.alcatelsbell.nms.util.ObjectUtil;
import org.asb.mule.probe.framework.entity.CrossConnect;
import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;


import com.alcatelsbell.nms.valueobject.BObject;
import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

public class CrossConnectionDataTask extends CommonDataTask {

	public CrossConnectionDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
		// TODO Auto-generated constructor stub

	}

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		try {
			List<CrossConnect> ipccList = service.retrieveAllCrossConnects(this.getTask().getObjectName());

//			int count = 0;
//			while (ipccList == null || ipccList.isEmpty()) {
//				Thread.sleep(1000l);
//				ipccList = service.retrieveAllCrossConnects(this.getTask().getObjectName());
//
//				if (count++ == 5) break;
//			}
			String logs = getTask().getObjectName()+" ccsize = "+(ipccList == null ? null: ipccList.size());
//			List<CrossConnect> extCCS = ((FenghuoService) service).retrieveAllExtCrossConnects(this.getTask().getObjectName());
//
//			if (extCCS != null) {
//				ipccList.addAll(extCCS);
//			}

			removeDuplicateDN(ipccList);
			String neKey = getTask().getObjectName().substring(getTask().getObjectName().lastIndexOf(":")+1).replaceAll(";","-");
			if (ipccList != null && !ipccList.isEmpty()) {
				ObjectUtil.saveObject(service.getEmsName()+"/CC-"+neKey,ipccList);
			} else {
				ipccList = (List)ObjectUtil.readObject(service.getEmsName()+"/CC-"+neKey);
				if (ipccList == null) ipccList = new ArrayList<CrossConnect>();
			}
			logs += " rmsize="+(ipccList == null ? null : ipccList.size());
			if (ipccList == null || ipccList.size() == 0)
				nbilog.info(logs);
			for (CrossConnect ipcc : ipccList) {
				getSqliteConn().insertBObject(ipcc);
			}

			try {
				if (service instanceof FenghuoService){
                    List<IPCrossconnection> ipcs = ((FenghuoService) service).retrieveAllFDFrsInMe(this.getTask().getObjectName());
                    if (ipcs != null) {
                        for (IPCrossconnection ipc : ipcs) {
                            getSqliteConn().insertBObject(ipc);
                        }
                    }
                }
			} catch (Exception e) {
				nbilog.error(e, e);
			}

			return new Vector(ipccList);
		} catch (Exception e) {
			nbilog.error(e,e);
		}
		return null;

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

	@Override
	public void insertDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDate(Vector<BObject> dataList) {
		// TODO Auto-generated method stub

	}

}
