package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;

import org.asb.mule.probe.ptn.fenghuo.service.FenghuoService;

import com.alcatelsbell.nms.valueobject.BObject;

public class ProtectionGroupDataTask extends CommonDataTask {
    public ProtectionGroupDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }
	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		try {
			nbilog.info("ProtectionGroupDataTask : start...");
			List<TrailNtwProtection> protectionGroupList = service.retrieveAllTrailNtwProtections();
			nbilog.info("TrailNtwProtection : " + protectionGroupList.size());
			for (TrailNtwProtection protectionGroup : protectionGroupList) {
				getSqliteConn().insertBObject(protectionGroup);
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
