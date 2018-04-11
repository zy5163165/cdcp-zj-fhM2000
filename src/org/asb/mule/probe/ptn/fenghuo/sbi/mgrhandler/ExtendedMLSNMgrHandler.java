package org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler;

import java.util.Vector;

import extendedMLSNMgr.ExtendedMLSNMgr_I;
import extendedMLSNMgr.TNProtectionGroupIterator_IHolder;
import extendedMLSNMgr.TNProtectionGroupList_THolder;
import extendedMLSNMgr.TNetworkProtectionGroup_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

public class ExtendedMLSNMgrHandler {

	private static ExtendedMLSNMgrHandler instance;

	public static ExtendedMLSNMgrHandler instance() {
		if (null == instance)
			instance = new ExtendedMLSNMgrHandler();

		return instance;
	}

	private ExtendedMLSNMgrHandler() {
	}

	public TNetworkProtectionGroup_T[] retrieveTNetworkProtectionGroups(ExtendedMLSNMgr_I extendedMLSNMgr, NameAndStringValue_T[] subnetName,
			String protectionType) throws ProcessingFailureException {
		TNProtectionGroupList_THolder tnProtectionGroupList = new TNProtectionGroupList_THolder();
		TNProtectionGroupIterator_IHolder tnProtectionGroupIterator = new TNProtectionGroupIterator_IHolder();
		Vector<TNetworkProtectionGroup_T> tnpVector = new Vector<TNetworkProtectionGroup_T>();

		int howmany = 50;
		extendedMLSNMgr.getTNetworkProtectionGroups(subnetName, protectionType, howmany, tnProtectionGroupList, tnProtectionGroupIterator);
		for (TNetworkProtectionGroup_T tnp : tnProtectionGroupList.value) {
			tnpVector.add(tnp);
		}
		if (tnProtectionGroupIterator.value != null) {
			boolean hasMore;
			do {
				hasMore = tnProtectionGroupIterator.value.next_n(howmany, tnProtectionGroupList);
				for (TNetworkProtectionGroup_T tnp : tnProtectionGroupList.value) {
					tnpVector.add(tnp);
				}
			} while (hasMore);

			try {
				tnProtectionGroupIterator.value.destroy();
			} catch (Throwable ex) {
				// datalog.debug("retrieveTNetworkProtectionGroups destroy");
			}
		}
		// datalog.debug("retrieveTNetworkProtectionGroups: " + tnpVector.size());
		TNetworkProtectionGroup_T[] tnps = new TNetworkProtectionGroup_T[tnpVector.size()];
		tnpVector.copyInto(tnps);

		return tnps;

	}

}
