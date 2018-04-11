package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "VRRPProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class VRRPProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public VRRPProtection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public short rate;
	public globaldefs.NameAndStringValue_T[][] tpList;
	public globaldefs.NameAndStringValue_T[] vrrpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRRPProtection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, short rate, globaldefs.NameAndStringValue_T[][] tpList, globaldefs.NameAndStringValue_T[] vrrpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.rate = rate;
		this.tpList = tpList;
		this.vrrpParameters = vrrpParameters;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("VRRPProtection_T");
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
		textStruct.append("rate=");
		textStruct.append(rate);
		textStruct.append(","); 
		textStruct.append("tpList=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <tpList.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <tpList[mem5].length; mem5_++){
				textStruct.append(tpList[mem5][mem5_]);
				if(mem5_ < tpList[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < tpList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("vrrpParameters=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <vrrpParameters.length; mem6++){
			textStruct.append(vrrpParameters[mem6]);
			if(mem6 < vrrpParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalInfo.length; mem7++){
			textStruct.append(additionalInfo[mem7]);
			if(mem7 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
