package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "Bridge_T"
 *	@author JacORB IDL compiler 
 */

public final class Bridge_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Bridge_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public globaldefs.NameAndStringValue_T[][] aEnd;
	public globaldefs.NameAndStringValue_T[][] zEnd;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public Bridge_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Bridge_T");
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
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <aEnd.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <aEnd[mem5].length; mem5_++){
				textStruct.append(aEnd[mem5][mem5_]);
				if(mem5_ < aEnd[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <zEnd.length; mem6++){
			textStruct.append("[");
			for(int mem6_ =0; mem6_ <zEnd[mem6].length; mem6_++){
				textStruct.append(zEnd[mem6][mem6_]);
				if(mem6_ < zEnd[mem6].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem6 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <transmissionParams.length; mem7++){
			textStruct.append(transmissionParams[mem7]);
			if(mem7 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <additionalInfo.length; mem8++){
			textStruct.append(additionalInfo[mem8]);
			if(mem8 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
