package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.IPCrossconnection;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.valueobject.BObject;

public class FlowDomainFragmentDataTask extends CommonDataTask {

	public FlowDomainFragmentDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		Vector<BObject> fdrsVector = new Vector<BObject>();
		try {
			List<FlowDomainFragment> fdrsList = service.retrieveAllFdrs();
			nbilog.info("FlowDomainFragment : " + fdrsList.size());
			if (fdrsList != null && fdrsList.size() > 0) {
				for (FlowDomainFragment fdrs : fdrsList) {
					if ((!fdrs.getRate().equals("309")) && (!fdrs.getRate().equals("1500"))) {
						List<IPCrossconnection> ccList = this.service.retrieveAllCrossconnections(fdrs.getDn());
						for (IPCrossconnection ipc : ccList) {
							getSqliteConn().insertBObject(ipc);
						}
					}
					
					getSqliteConn().insertBObject(fdrs);
					fdrsVector.add(fdrs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fdrsVector;
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
