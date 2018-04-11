package org.asb.mule.probe.ptn.fenghuo.service.mapper;

import globaldefs.NameAndStringValue_T;

import org.asb.mule.probe.framework.entity.Section;
import org.asb.mule.probe.framework.util.CodeTool;

import topologicalLink.TopologicalLink_T;

public class SectionMapper extends CommonMapper

{
	private static SectionMapper instance;

	public static SectionMapper instance() {
		if (instance == null) {
			instance = new SectionMapper();
		}
		return instance;
	}

	public Section convertSection(TopologicalLink_T vendorEntity, NameAndStringValue_T[] subnetDn)

	{

		Section section = new Section();
		// section.setDn(SysUtil.nextDN());
		// section.setTag1(vendorEntity.name[0].value + Constant.dnSplit
		// + vendorEntity.name[1].value);
		section.setDn(nv2dn(vendorEntity.name));
		section.setTag1(section.getDn());
		section.setParentDn(nv2dn(subnetDn));
		section.setEmsName(vendorEntity.name[0].value);

		section.setNativeEMSName(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		section.setUserLabel(CodeTool.isoToGbk(vendorEntity.userLabel));

		section.setDirection(mapperConnectionDirection(vendorEntity.direction));
		section.setaEndTP(nv2dn(vendorEntity.aEndTP));
		section.setzEndTP(nv2dn(vendorEntity.zEndTP));
		section.setRate(vendorEntity.rate + "");

		section.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));

		return section;
	}

}
