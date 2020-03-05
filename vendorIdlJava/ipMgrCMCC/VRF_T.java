package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "VRF_T"
 *	@author JacORB IDL compiler 
 */

public final class VRF_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VRF_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String vrfType = "";
	public java.lang.String vrfLabel = "";
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String rdFormat = "";
	public java.lang.String rdAttr = "";
	public java.lang.String[] importRTList;
	public java.lang.String[] exportRTList;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRF_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String vrfType, java.lang.String vrfLabel, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, java.lang.String rdFormat, java.lang.String rdAttr, java.lang.String[] importRTList, java.lang.String[] exportRTList, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.vrfType = vrfType;
		this.vrfLabel = vrfLabel;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rdFormat = rdFormat;
		this.rdAttr = rdAttr;
		this.importRTList = importRTList;
		this.exportRTList = exportRTList;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("VRF_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("vrfType=");
		textStruct.append(vrfType);
		textStruct.append(","); 
		textStruct.append("vrfLabel=");
		textStruct.append(vrfLabel);
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <aEnd.length; mem6++){
			textStruct.append(aEnd[mem6]);
			if(mem6 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <zEnd.length; mem7++){
			textStruct.append(zEnd[mem7]);
			if(mem7 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("rdFormat=");
		textStruct.append(rdFormat);
		textStruct.append(","); 
		textStruct.append("rdAttr=");
		textStruct.append(rdAttr);
		textStruct.append(","); 
		textStruct.append("importRTList=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <importRTList.length; mem10++){
			textStruct.append(importRTList[mem10]);
			if(mem10 < importRTList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("exportRTList=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <exportRTList.length; mem11++){
			textStruct.append(exportRTList[mem11]);
			if(mem11 < exportRTList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem12 =0; mem12 <transmissionParams.length; mem12++){
			textStruct.append(transmissionParams[mem12]);
			if(mem12 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <additionalInfo.length; mem13++){
			textStruct.append(additionalInfo[mem13]);
			if(mem13 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
