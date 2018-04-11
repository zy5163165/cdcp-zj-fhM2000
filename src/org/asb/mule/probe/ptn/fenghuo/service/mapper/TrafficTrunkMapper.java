package org.asb.mule.probe.ptn.fenghuo.service.mapper;

import org.asb.mule.probe.framework.entity.TrafficTrunk;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.CodeTool;

import com.alcatelsbell.nms.common.SysUtil;

import flowDomainFragment.FlowDomainFragment_T;
import globaldefs.NameAndStringValue_T;

public class TrafficTrunkMapper extends CommonMapper

{
	private static TrafficTrunkMapper instance;

	public static TrafficTrunkMapper instance() {
		if (instance == null) {
			instance = new TrafficTrunkMapper();
		}
		return instance;
	}

	public TrafficTrunk convertTrafficTrunk(FlowDomainFragment_T vendorEntity)

	{
		TrafficTrunk tt = new TrafficTrunk();

		tt.setDn(SysUtil.nextDN());
		// tt.setTag1(vendorEntity.name[0].value + Constant.dnSplit + vendorEntity.name[1].value + Constant.dnSplit + vendorEntity.name[2].value);
		tt.setTag1(nv2dn(vendorEntity.name));
		// tt.setParentDn(vendorEntity.name[0].value + Constant.dnSplit
		// + vendorEntity.name[1].value);
		//tt.setParentDn(nv2dn(parentDn));
		tt.setParentDn(getChannelIdList(vendorEntity.additionalInfo));
		
		tt.setEmsName(vendorEntity.name[0].value);

		tt.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		tt.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));

		tt.setDirection(mapperConnectionDirection(vendorEntity.direction));
		tt.setTransmissionParams(mapperTransmissionPara(vendorEntity.transmissionParams));
		tt.setAdministrativeState(mapperAdministrativeState(vendorEntity.administrativeState));
		tt.setActiveState(mapperActiveState(vendorEntity.fdfrState));
		// tt.setaEnd(mapperNameAndStringValue(vendorEntity.aEnd[0].tpName));
		// tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
		// tt.setzEnd(mapperNameAndStringValue(vendorEntity.zEnd[0].tpName));
		// tt.setzEndtrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
		if (vendorEntity.aEnd.length > 0 && vendorEntity.aEnd[0] != null) {
			tt.setaEnd(end2String(vendorEntity.aEnd));
			tt.setaPtp(end2Ptp(vendorEntity.aEnd));
			tt.setaEndTrans(mapperTransmissionParas(vendorEntity.aEnd[0].transmissionParams));
		}

		if (vendorEntity.zEnd.length > 0 && vendorEntity.zEnd[0] != null) {
			tt.setzEnd(end2String(vendorEntity.zEnd));
			tt.setzPtp(end2Ptp(vendorEntity.zEnd));
			tt.setzEndtrans(mapperTransmissionParas(vendorEntity.zEnd[0].transmissionParams));
		}

		tt.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return tt;

	}
}
