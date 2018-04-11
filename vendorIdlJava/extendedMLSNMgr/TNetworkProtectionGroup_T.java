package extendedMLSNMgr;

/**
 *	Generated from IDL definition of struct "TNetworkProtectionGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class TNetworkProtectionGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TNetworkProtectionGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionType = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public globaldefs.NameAndStringValue_T[][] pgpNameList;
	public globaldefs.NameAndStringValue_T[][] tpNameList;
	public globaldefs.NameAndStringValue_T[][] sncProtectedNameList;
	public globaldefs.NameAndStringValue_T[][] sncProtectingNameList;
	public globaldefs.NameAndStringValue_T[] pgpParameters;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TNetworkProtectionGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionType, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, globaldefs.NameAndStringValue_T[][] pgpNameList, globaldefs.NameAndStringValue_T[][] tpNameList, globaldefs.NameAndStringValue_T[][] sncProtectedNameList, globaldefs.NameAndStringValue_T[][] sncProtectingNameList, globaldefs.NameAndStringValue_T[] pgpParameters, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionType = protectionType;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.pgpNameList = pgpNameList;
		this.tpNameList = tpNameList;
		this.sncProtectedNameList = sncProtectedNameList;
		this.sncProtectingNameList = sncProtectingNameList;
		this.pgpParameters = pgpParameters;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TNetworkProtectionGroup_T");
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
		textStruct.append("protectionType=");
		textStruct.append(protectionType);
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
		textStruct.append("pgpNameList=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <pgpNameList.length; mem9++){
			textStruct.append("[");
			for(int mem9_ =0; mem9_ <pgpNameList[mem9].length; mem9_++){
				textStruct.append(pgpNameList[mem9][mem9_]);
				if(mem9_ < pgpNameList[mem9].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem9 < pgpNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tpNameList=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <tpNameList.length; mem10++){
			textStruct.append("[");
			for(int mem10_ =0; mem10_ <tpNameList[mem10].length; mem10_++){
				textStruct.append(tpNameList[mem10][mem10_]);
				if(mem10_ < tpNameList[mem10].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem10 < tpNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("sncProtectedNameList=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <sncProtectedNameList.length; mem11++){
			textStruct.append("[");
			for(int mem11_ =0; mem11_ <sncProtectedNameList[mem11].length; mem11_++){
				textStruct.append(sncProtectedNameList[mem11][mem11_]);
				if(mem11_ < sncProtectedNameList[mem11].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem11 < sncProtectedNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("sncProtectingNameList=");
		textStruct.append("[");
		for(int mem12 =0; mem12 <sncProtectingNameList.length; mem12++){
			textStruct.append("[");
			for(int mem12_ =0; mem12_ <sncProtectingNameList[mem12].length; mem12_++){
				textStruct.append(sncProtectingNameList[mem12][mem12_]);
				if(mem12_ < sncProtectingNameList[mem12].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem12 < sncProtectingNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pgpParameters=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <pgpParameters.length; mem13++){
			textStruct.append(pgpParameters[mem13]);
			if(mem13 < pgpParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem14 =0; mem14 <additionalInfo.length; mem14++){
			textStruct.append(additionalInfo[mem14]);
			if(mem14 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
