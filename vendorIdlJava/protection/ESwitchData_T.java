package protection;

/**
 *	Generated from IDL definition of struct "ESwitchData_T"
 *	@author JacORB IDL compiler 
 */

public final class ESwitchData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ESwitchData_T(){}
	public java.lang.String eProtectionGroupType;
	public java.lang.String eSwitchReason;
	public globaldefs.NameAndStringValue_T[] ePGPName;
	public globaldefs.NameAndStringValue_T[] protectedE;
	public globaldefs.NameAndStringValue_T[] switchToE;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ESwitchData_T(java.lang.String eProtectionGroupType, java.lang.String eSwitchReason, globaldefs.NameAndStringValue_T[] ePGPName, globaldefs.NameAndStringValue_T[] protectedE, globaldefs.NameAndStringValue_T[] switchToE, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eProtectionGroupType = eProtectionGroupType;
		this.eSwitchReason = eSwitchReason;
		this.ePGPName = ePGPName;
		this.protectedE = protectedE;
		this.switchToE = switchToE;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ESwitchData_T");
		textStruct.append("(");
		textStruct.append("eProtectionGroupType=");
		textStruct.append(eProtectionGroupType);
		textStruct.append(","); 
		textStruct.append("eSwitchReason=");
		textStruct.append(eSwitchReason);
		textStruct.append(","); 
		textStruct.append("ePGPName=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <ePGPName.length; mem2++){
			textStruct.append(ePGPName[mem2]);
			if(mem2 < ePGPName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectedE=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <protectedE.length; mem3++){
			textStruct.append(protectedE[mem3]);
			if(mem3 < protectedE.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("switchToE=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <switchToE.length; mem4++){
			textStruct.append(switchToE[mem4]);
			if(mem4 < switchToE.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalInfo.length; mem5++){
			textStruct.append(additionalInfo[mem5]);
			if(mem5 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
