package org.asb.mule.probe.ptn.fenghuo.nbi.task;

import java.util.List;
import java.util.Vector;

import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.nbi.task.CommonDataTask;
import org.asb.mule.probe.framework.service.SqliteConn;


import com.alcatelsbell.nms.valueobject.BObject;

public class SectionDataTask extends CommonDataTask {

	public SectionDataTask(SqliteConn sqliteConn) {
        this.setSqliteConn(sqliteConn);
        // TODO Auto-generated constructor stub

    }

	@Override
	public Vector<BObject> excute() {
		// TODO Auto-generated method stub
		Vector<BObject> sections=new Vector<BObject>();
		try {
			List<Section> sectionList = service.retrieveAllSections();
			nbilog.info("Section : " + sectionList.size());
			if (sectionList != null && sectionList.size() > 0) {
				for (Section section : sectionList) {
					getSqliteConn().insertBObject(section);
					sections.add(section);
					nbilog.info("section:"+section.getDn()+" aend="+section.getaEndTP()+" zend="+section.getzEndTP());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sections;

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
