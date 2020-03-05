package protection;

/**
 *	Generated from IDL definition of struct "SwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class SwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SwitchData_T(){}
	public protection.ProtectionType_T protectionType;
	public protection.SwitchReason_T switchReason;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] groupName;
	public globaldefs.NameAndStringValue_T[] protectedTP;
	public globaldefs.NameAndStringValue_T[] switchToTP;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public SwitchData_T(protection.ProtectionType_T protectionType, protection.SwitchReason_T switchReason, short layerRate, globaldefs.NameAndStringValue_T[] groupName, globaldefs.NameAndStringValue_T[] protectedTP, globaldefs.NameAndStringValue_T[] switchToTP, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.protectionType = protectionType;
		this.switchReason = switchReason;
		this.layerRate = layerRate;
		this.groupName = groupName;
		this.protectedTP = protectedTP;
		this.switchToTP = switchToTP;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SwitchData_T");
		textStruct.append("(");
		textStruct.append("protectionType=");
		textStruct.append(protectionType);
		textStruct.append(","); 
		textStruct.append("switchReason=");
		textStruct.append(switchReason);
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("groupName=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <groupName.length; mem3++){
			textStruct.append(groupName[mem3]);
			if(mem3 < groupName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectedTP=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <protectedTP.length; mem4++){
			textStruct.append(protectedTP[mem4]);
			if(mem4 < protectedTP.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("switchToTP=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <switchToTP.length; mem5++){
			textStruct.append(switchToTP[mem5]);
			if(mem5 < switchToTP.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalInfo.length; mem6++){
			textStruct.append(additionalInfo[mem6]);
			if(mem6 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
