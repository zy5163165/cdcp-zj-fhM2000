package protection;

/**
 *	Generated from IDL definition of struct "EProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class EProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String eProtectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public globaldefs.NameAndStringValue_T[][] protectedList;
	public globaldefs.NameAndStringValue_T[][] protectingList;
	public globaldefs.NameAndStringValue_T[] ePgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String eProtectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, globaldefs.NameAndStringValue_T[][] protectedList, globaldefs.NameAndStringValue_T[][] protectingList, globaldefs.NameAndStringValue_T[] ePgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.eProtectionGroupType = eProtectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.protectedList = protectedList;
		this.protectingList = protectingList;
		this.ePgpParameters = ePgpParameters;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EProtectionGroup_T");
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
		textStruct.append("eProtectionGroupType=");
		textStruct.append(eProtectionGroupType);
		textStruct.append(","); 
		textStruct.append("protectionSchemeState=");
		textStruct.append(protectionSchemeState);
		textStruct.append(","); 
		textStruct.append("reversionMode=");
		textStruct.append(reversionMode);
		textStruct.append(","); 
		textStruct.append("protectedList=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <protectedList.length; mem7++){
			textStruct.append("[");
			for(int mem7_ =0; mem7_ <protectedList[mem7].length; mem7_++){
				textStruct.append(protectedList[mem7][mem7_]);
				if(mem7_ < protectedList[mem7].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem7 < protectedList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectingList=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <protectingList.length; mem8++){
			textStruct.append("[");
			for(int mem8_ =0; mem8_ <protectingList[mem8].length; mem8_++){
				textStruct.append(protectingList[mem8][mem8_]);
				if(mem8_ < protectingList[mem8].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem8 < protectingList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("ePgpParameters=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <ePgpParameters.length; mem9++){
			textStruct.append(ePgpParameters[mem9]);
			if(mem9 < ePgpParameters.length-1)
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
