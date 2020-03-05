package org.asb.mule.probe.ptn.fenghuo.service.mapper;

import java.util.List;

import org.asb.mule.probe.framework.entity.FlowDomainFragment;
import org.asb.mule.probe.framework.entity.ProtectionGroup;
import org.asb.mule.probe.framework.entity.TrailNtwProtection;
import org.asb.mule.probe.framework.service.Constant;
import org.asb.mule.probe.framework.util.CodeTool;

import protection.EProtectionGroup_T;
import protection.ProtectionGroupType_T;
import protection.ProtectionSchemeState_T;
import protection.ReversionMode_T;
import trailNtwProtection.TrailNtwProtection_T;

import com.alcatelsbell.nms.common.SysUtil;

import extendedMLSNMgr.TNetworkProtectionGroup_T;

/**
 * Author: Ronnie.Chen
 * Date: 13-6-27
 * Time: 下午1:42
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class ProtectGroupMapper extends CommonMapper {
	private static ProtectGroupMapper instance;

	public static ProtectGroupMapper instance() {
		if (instance == null) {
			instance = new ProtectGroupMapper();
		}
		return instance;
	}

	public ProtectionGroup convert(EProtectionGroup_T vendorEntity) {
		ProtectionGroup pg = new ProtectionGroup();

		if (vendorEntity.name.length == 2)
			pg.setDn(vendorEntity.name[0].value + Constant.dnSplit + vendorEntity.name[1].value);
		else if (vendorEntity.name.length >= 3)
			pg.setDn(vendorEntity.name[0].value + Constant.dnSplit + vendorEntity.name[1].value + Constant.dnSplit + vendorEntity.name[3].value);
		pg.setParentDn(mapperParentDnNameAndStringValue(vendorEntity.name));
		pg.setEmsName(vendorEntity.name[0].value);
		pg.setOwner(vendorEntity.owner);
		pg.setProtectionSchemeState(vendorEntity.protectionSchemeState.value() + "");
		pg.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		pg.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));
		pg.setPgpParameters(mapperAdditionalInfo(vendorEntity.ePgpParameters));
		pg.setProtectedList(mapperNameAndStringValues(vendorEntity.protectedList));
		pg.setProtectingList(mapperNameAndStringValues(vendorEntity.protectingList));
		pg.setProtectionGroupType(vendorEntity.eProtectionGroupType);
		pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		return pg;

	}

	public TrailNtwProtection convert(TNetworkProtectionGroup_T vendorEntity) {
		TrailNtwProtection pg = new TrailNtwProtection();
		pg.setDn(nv2dn(vendorEntity.name));
		pg.setEmsName(vendorEntity.name[0].value);
		pg.setOwner(vendorEntity.owner);
		pg.setProtectionSchemeState(mapperState(vendorEntity.protectionSchemeState));
		pg.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		pg.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));
		pg.setWorkerTrailList(nvs2dn(vendorEntity.sncProtectedNameList));
		pg.setProtectionTrail(nvs2dn(vendorEntity.sncProtectingNameList));
		pg.setProtectionGroupType(mapperType(vendorEntity.protectionGroupType));
		pg.setRate(vendorEntity.rate + "");
		pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		return pg;

	}
	
	public TrailNtwProtection convert(TrailNtwProtection_T vendorEntity) {
		TrailNtwProtection pg = new TrailNtwProtection();

		pg.setDn(nv2dn(vendorEntity.name));
		pg.setEmsName(vendorEntity.name[0].value);
		pg.setOwner(vendorEntity.owner);
		pg.setProtectionSchemeState(mapperState(vendorEntity.protectionSchemeState));
		pg.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		pg.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));
		pg.setProtectionGroupType(mapperType(vendorEntity.protectionGroupType));
		pg.setReversionMode(mapperMode(vendorEntity.reversionMode));
		pg.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		pg.setApsFunction(vendorEntity.apsFunction);
		pg.setNetworkAccessDomain(vendorEntity.networkAccessDomain);
		pg.setPgATPList(nvs2dn(vendorEntity.pgATPList));
		pg.setPgZTPList(nvs2dn(vendorEntity.pgATPList));
		pg.setProtectionGroupAName(nv2dn(vendorEntity.protectionGroupAName));
		pg.setProtectionGroupZName(nv2dn(vendorEntity.protectionGroupAName));
		pg.setProtectionTrail(nvs2dn(vendorEntity.protectionTrail));
		pg.setWorkerTrailList(nvss2dn(vendorEntity.workerTrailList));
		pg.setRate(String.valueOf(vendorEntity.rate));
		pg.setTnpParameters(nv2dn(vendorEntity.tnpParameters));
		pg.setTrailNtwProtectionType(vendorEntity.trailNtwProtectionType);
		
		return pg;

	}

	public TrailNtwProtection convert(List<FlowDomainFragment> pglist) {
		TrailNtwProtection pg = new TrailNtwProtection();

		pg.setDn(SysUtil.nextDN());
		pg.setEmsName(pglist.get(0).getEmsName());
		pg.setNativeEMSName(pglist.get(0).getNativeEMSName());
		pg.setProtectionGroupType(getType(pglist));
		pg.setProtectionTrail(getPTrailDN(pglist));
		pg.setWorkerTrailList(getWTrailDN(pglist));
		return pg;
	}

	private String getType(List<FlowDomainFragment> pglist) {
		for (FlowDomainFragment flowDomainFragment : pglist) {
			String type = flowDomainFragment.getTag1().trim();
			if (type.equals("NBI_PGT_TP_MPLS_SNCP_1FOR1")) {
				return "NBI_PGT_TP_MPLS_SNCP_1FOR1";
			} else if (type.equals("NBI_PGT_TP_MPLS_SNCP_1PLUS1")) {
				return "NBI_PGT_TP_MPLS_SNCP_1PLUS1";
			}
		}
		return "NBI_PGT_NONE";
	}

	private String getPTrailDN(List<FlowDomainFragment> pglist) {
		StringBuilder traildn = new StringBuilder();
		for (FlowDomainFragment flowDomainFragment : pglist) {
			if (flowDomainFragment.getTag1().trim().equals("NBI_PGT_NONE")) {
				traildn.append("||");
				traildn.append(flowDomainFragment.getDn());
			}
		}
		return traildn.toString().contains("||") ? traildn.substring(2) : "";
	}

	private String getWTrailDN(List<FlowDomainFragment> pglist) {
		StringBuilder traildn = new StringBuilder();
		for (FlowDomainFragment flowDomainFragment : pglist) {
			String type = flowDomainFragment.getTag1().trim();
			if (type.equals("NBI_PGT_TP_MPLS_SNCP_1FOR1") || type.equals("NBI_PGT_TP_MPLS_SNCP_1PLUS1")) {
				traildn.append("||");
				traildn.append(flowDomainFragment.getDn());
			}
		}
		return traildn.toString().contains("||") ? traildn.substring(2) : "";
	}

	private String mapperState(ProtectionSchemeState_T state) {
		String pmode = "";
		switch (state.value()) {
		case ProtectionSchemeState_T._PSS_AUTOMATIC:
			pmode = "PSS_AUTOMATIC";
			break;
		case ProtectionSchemeState_T._PSS_FORCED_OR_LOCKED_OUT:
			pmode = "PSS_FORCED_OR_LOCKED_OUT";
			break;
		case ProtectionSchemeState_T._PSS_UNKNOWN:
			pmode = "PSS_UNKNOWN";
			break;

		}
		return pmode;
	}

	private String mapperType(ProtectionGroupType_T type) {
		String pmode = "";
		switch (type.value()) {
		case ProtectionGroupType_T._PGT_2_FIBER_BLSR:
			pmode = "PGT_2_FIBER_BLSR";
			break;
		case ProtectionGroupType_T._PGT_4_FIBER_BLSR:
			pmode = "PGT_4_FIBER_BLSR";
			break;
		case ProtectionGroupType_T._PGT_MSP_1_FOR_N:
			pmode = "PGT_MSP_1_FOR_N";
			break;
		case ProtectionGroupType_T._PGT_MSP_1_PLUS_1:
			pmode = "PGT_MSP_1_PLUS_1";
			break;

		}
		return pmode;
	}

	private String mapperMode(ReversionMode_T reversionMode) {
		String pmode = "";
		switch (reversionMode.value()) {
		case ReversionMode_T._RM_UNKNOWN:
			pmode = "RM_UNKNOWN";
			break;
		case ReversionMode_T._RM_REVERTIVE:
			pmode = "RM_REVERTIVE";
			break;
		case ReversionMode_T._RM_NON_REVERTIVE:
			pmode = "RM_NON_REVERTIVE";
			break;

		}
		return pmode;
	}
}
