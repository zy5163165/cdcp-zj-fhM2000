package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ReversionMode_T reversionMode;
	public globaldefs.NameAndStringValue_T[][] pgATPList;
	public globaldefs.NameAndStringValue_T[][] pgZTPList;
	public globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ReversionMode_T reversionMode, globaldefs.NameAndStringValue_T[][] pgATPList, globaldefs.NameAndStringValue_T[][] pgZTPList, globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.reversionMode = reversionMode;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TrailNtwProtModifyData_T");
		textStruct.append("(");
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
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
		textStruct.append("reversionMode=");
		textStruct.append(reversionMode);
		textStruct.append(","); 
		textStruct.append("pgATPList=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <pgATPList.length; mem6++){
			textStruct.append("[");
			for(int mem6_ =0; mem6_ <pgATPList[mem6].length; mem6_++){
				textStruct.append(pgATPList[mem6][mem6_]);
				if(mem6_ < pgATPList[mem6].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem6 < pgATPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pgZTPList=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <pgZTPList.length; mem7++){
			textStruct.append("[");
			for(int mem7_ =0; mem7_ <pgZTPList[mem7].length; mem7_++){
				textStruct.append(pgZTPList[mem7][mem7_]);
				if(mem7_ < pgZTPList[mem7].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem7 < pgZTPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tnpParameters=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <tnpParameters.length; mem8++){
			textStruct.append(tnpParameters[mem8]);
			if(mem8 < tnpParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("apsFunction=");
		textStruct.append(apsFunction);
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <additionalInfo.length; mem11++){
			textStruct.append(additionalInfo[mem11]);
			if(mem11 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
