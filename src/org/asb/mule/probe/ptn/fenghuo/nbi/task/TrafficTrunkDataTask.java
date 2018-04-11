package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.IPRoute;
import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;
import org.asb.mule.probe.framework.service.SqliteService;

import com.alcatelsbell.nms.valueobject.BObject;

public class TrafficTrunkDataTask extends CommonDataTask {

	public TrafficTrunkDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		try {
			List<TrafficTrunk> trafficTrunkList = service.retrieveAllTrafficTrunk();
			nbilog.info("TrafficTrunk : " + trafficTrunkList.size());
			if (trafficTrunkList != null && trafficTrunkList.size() > 0) {
				for (TrafficTrunk trafficTrunk : trafficTrunkList) {
					getSqliteConn().insertBObject(trafficTrunk);

					List<IPRoute> routes = trafficTrunk.getRoutes();
					if (routes != null) {
						for (IPRoute ipRoute : routes) {
							getSqliteConn().insertBObject(ipRoute);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
