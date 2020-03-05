package protection;

/**
 *	Generated from IDL definition of struct "ProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class ProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] pgpTPList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] pgpTPList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpTPList = pgpTPList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProtectionGroup_T");
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
		textStruct.append("protectionGroupType=");
		textStruct.append(protectionGroupType);
		textStruct.append(","); 
		textStruct.append("protectionSchemeState=");
		textStruct.append(protectionSchemeState);
		textStruct.append(","); 
		textStruct.append("reversionMode=");
		textStruct.append(reversionMode);
		textStruct.append(","); 
		textStruct.append("rate=");
		textStruct.append(rate);
		textStruct.append(","); 
		textStruct.append("pgpTPList=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <pgpTPList.length; mem8++){
			textStruct.append("[");
			for(int mem8_ =0; mem8_ <pgpTPList[mem8].length; mem8_++){
				textStruct.append(pgpTPList[mem8][mem8_]);
				if(mem8_ < pgpTPList[mem8].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem8 < pgpTPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pgpParameters=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <pgpParameters.length; mem9++){
			textStruct.append(pgpParameters[mem9]);
			if(mem9 < pgpParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <additionalInfo.length; mem10++){
			textStruct.append(additionalInfo[mem10]);
			if(mem10 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
