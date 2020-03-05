package org.asb.mule.probe.ptn.fenghuo.sbi.mgrhandler;

import extendedFlowDomainMgr.ExMFDFrIterator_IHolder;
import extendedFlowDomainMgr.ExMatrixFlowDomainFragmentList_THolder;
import extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T;
import extendedFlowDomainMgr.ExtendedFlowDomainMgr_I;
import flowDomain.FlowDomainMgr_I;
import flowDomainFragment.FDFrIterator_IHolder;
import flowDomainFragment.FDFrList_THolder;
import flowDomainFragment.FlowDomainFragment_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;

public class ExtendFlowDomainMgrHandler {
	private static ExtendFlowDomainMgrHandler instance;

	public static ExtendFlowDomainMgrHandler instance() {
		if (null == instance)
			instance = new ExtendFlowDomainMgrHandler();

		return instance;
	}

	public ExMatrixFlowDomainFragment_T[] retrieveAllFDFrsInMe(ExtendedFlowDomainMgr_I fdMgr, short[] layerList, NameAndStringValue_T[] meName)
			throws ProcessingFailureException {
		java.util.Vector extfdfrsVector = new java.util.Vector();

		ExMatrixFlowDomainFragmentList_THolder extfdfrList = new ExMatrixFlowDomainFragmentList_THolder();
		ExMFDFrIterator_IHolder extfdfrIt = new ExMFDFrIterator_IHolder();
		fdMgr.getAllExMFdFrInMe(meName, layerList, 50, extfdfrList, extfdfrIt);
		// void getAllExMFdFrInMeSingleMeRoute(globaldefs.NameAndStringValue_T[] meName, short[] layerList, int how_many, flowDomainFragment.FDFrList_THolder
		// fdfrList, flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws globaldefs.ProcessingFailureException;

		for (int i = 0; i < extfdfrList.value.length; i++) {
			extfdfrsVector.addElement(extfdfrList.value[i]);
		}

		if (null != extfdfrIt.value) {
			boolean shouldContinue = true;
			while (shouldContinue) {
				shouldContinue = extfdfrIt.value.next_n(50, extfdfrList);

				for (int i = 0; i < extfdfrList.value.length; i++)
					extfdfrsVector.addElement(extfdfrList.value[i]);
			}

			try {
				extfdfrIt.value.destroy();
			} catch (Throwable ex) {
				// datalog.info("retrieveretrieveAllFDFrsInMe:destory Iterator");
			}
		}

		ExMatrixFlowDomainFragment_T[] extfdfrs = new ExMatrixFlowDomainFragment_T[extfdfrsVector.size()];
		extfdfrsVector.copyInto(extfdfrs);

		// for(int i=0;i<extfdfrs.length;i++)
		// {
		// datalog.debug("Get extfdfrs :"+extfdfrs[i].toString());
		// }

		return extfdfrs;
	}
}
