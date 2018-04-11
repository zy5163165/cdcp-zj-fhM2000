package org.asb.mule.probe.ptn.fenghuo.service.mapper;

import globaldefs.NameAndStringValue_T;
import managedElement.ManagedElement_T;
import multiLayerSubnetwork.MultiLayerSubnetwork_T;

import org.asb.mule.probe.framework.entity.TopoNode;
import org.asb.mule.probe.framework.util.CodeTool;

import com.alcatelsbell.nms.common.SysUtil;

public class TopoNodeMapper extends CommonMapper {
	private static TopoNodeMapper instance;

	public static TopoNodeMapper instance() {
		if (instance == null) {
			instance = new TopoNodeMapper();
		}
		return instance;
	}

	public TopoNode convertTopoNode(MultiLayerSubnetwork_T vendorEntity, NameAndStringValue_T[] subnetwrokName) {
		TopoNode node = new TopoNode();
		node.setDn(SysUtil.nextDN());
		node.setName(nv2dn(vendorEntity.name));
		node.setParent(nv2dn(subnetwrokName));
		node.setNativeemsname(CodeTool.isoToGbk(vendorEntity.nativeEMSName));
		node.setAdditionalInfo(mapperAdditionalInfo(vendorEntity.additionalInfo));
		return node;
	}

	public TopoNode convertTopoNode(String name,String parentName,String nativeemsname) {
		TopoNode node = new TopoNode();
		node.setDn(SysUtil.nextDN());
		node.setName(name);
		node.setParent(parentName);
		node.setNativeemsname(nativeemsname);
		return node;
	}

	public String getNeblockdn(NameAndStringValue_T[] nename) {
		// EMS:SHX-OTNM2000-1-PTN@ManagedElement:134217729;66561
		String nedn = nv2dn(nename);
		String neblockid = nedn.substring(nedn.indexOf(";") + 1);
		int neblock = -1;
		if (Integer.parseInt(neblockid) >= 2162689) {
			String temp = Integer.toBinaryString(Integer.parseInt(neblockid) >> 8);
			String tail = ( temp.substring(temp.length() - 8));
			String head = temp.substring(0,temp.length()-13);
			neblock = Integer.parseInt(head+tail, 2);
		} else {

			String temp = Integer.toBinaryString(Integer.parseInt(neblockid) >> 8);
			neblock = Integer.parseInt(temp.substring(temp.length() - 8), 2);
		}

		NameAndStringValue_T[] dn = new NameAndStringValue_T[2];
		dn[0] = new NameAndStringValue_T();
		dn[1] = new NameAndStringValue_T();
		dn[0].name = "EMS";
		dn[1].name = "NeBlock";
		dn[0].value = nename[0].value;
		dn[1].value = String.valueOf(neblock);

		return nv2dn(dn);
	}

	public TopoNode convertTopoNode(NameAndStringValue_T[] nename, NameAndStringValue_T[] subnetwrokName) {
		TopoNode node = new TopoNode();
		node.setDn(SysUtil.nextDN());
		node.setName(nv2dn(nename));
		node.setParent(nv2dn(subnetwrokName));
		return node;
	}

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("101100100",2));
		String nedn = "EMS:JH-OTNM2000-1-PTN@ManagedElement:134222630;2188319";
		//String nedn = "EMS:JH-OTNM2000-1-PTN@ManagedElement:134219166;91143";
		String neblockid = nedn.substring(nedn.indexOf(";") + 1);

		if (Integer.parseInt(neblockid) >= 2162689) {
			System.out.println("111 full="+ Integer.toBinaryString(Integer.parseInt(neblockid)));
			String temp = Integer.toBinaryString(Integer.parseInt(neblockid) >> 8);

			String tail = ( temp.substring(temp.length() - 8));
			System.out.println("tail = " + temp.substring(temp.length() - 8));

			String head = temp.substring(0,temp.length()-13);
			System.out.println("head = " + head);
			int neblock = Integer.parseInt(head+tail, 2);
			System.out.println("neblock = " + neblock);
		} else {
			System.out.println("full="+ Integer.toBinaryString(Integer.parseInt(neblockid)));
			String temp = Integer.toBinaryString(Integer.parseInt(neblockid) >> 8);
			System.out.println("temp = " + temp.substring(temp.length() - 8));
			int neblock = Integer.parseInt(temp.substring(temp.length() - 8), 2);
			System.out.println("neblock = " + neblock);
		}



	}
}
