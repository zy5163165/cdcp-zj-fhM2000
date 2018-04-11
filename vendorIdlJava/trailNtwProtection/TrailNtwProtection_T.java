package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public protection.ProtectionGroupType_T protectionGroupType;
	public protection.ProtectionSchemeState_T protectionSchemeState;
	public protection.ReversionMode_T reversionMode;
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public globaldefs.NameAndStringValue_T[][] pgATPList;
	public globaldefs.NameAndStringValue_T[][] pgZTPList;
	public globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public globaldefs.NameAndStringValue_T[][] protectionTrail;
	public globaldefs.NameAndStringValue_T[] tnpParameters;
	public java.lang.String apsFunction = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrailNtwProtection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, protection.ProtectionGroupType_T protectionGroupType, protection.ProtectionSchemeState_T protectionSchemeState, protection.ReversionMode_T reversionMode, short rate, java.lang.String trailNtwProtectionType, globaldefs.NameAndStringValue_T[] protectionGroupAName, globaldefs.NameAndStringValue_T[] protectionGroupZName, globaldefs.NameAndStringValue_T[][] pgATPList, globaldefs.NameAndStringValue_T[][] pgZTPList, globaldefs.NameAndStringValue_T[][][] workerTrailList, globaldefs.NameAndStringValue_T[][] protectionTrail, globaldefs.NameAndStringValue_T[] tnpParameters, java.lang.String apsFunction, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionGroupType = protectionGroupType;
		this.protectionSchemeState = protectionSchemeState;
		this.reversionMode = reversionMode;
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.pgATPList = pgATPList;
		this.pgZTPList = pgZTPList;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.tnpParameters = tnpParameters;
		this.apsFunction = apsFunction;
		this.networkAccessDomain = networkAccessDomain;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TrailNtwProtection_T");
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
		textStruct.append("trailNtwProtectionType=");
		textStruct.append(trailNtwProtectionType);
		textStruct.append(","); 
		textStruct.append("protectionGroupAName=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <protectionGroupAName.length; mem9++){
			textStruct.append(protectionGroupAName[mem9]);
			if(mem9 < protectionGroupAName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectionGroupZName=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <protectionGroupZName.length; mem10++){
			textStruct.append(protectionGroupZName[mem10]);
			if(mem10 < protectionGroupZName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pgATPList=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <pgATPList.length; mem11++){
			textStruct.append("[");
			for(int mem11_ =0; mem11_ <pgATPList[mem11].length; mem11_++){
				textStruct.append(pgATPList[mem11][mem11_]);
				if(mem11_ < pgATPList[mem11].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem11 < pgATPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pgZTPList=");
		textStruct.append("[");
		for(int mem12 =0; mem12 <pgZTPList.length; mem12++){
			textStruct.append("[");
			for(int mem12_ =0; mem12_ <pgZTPList[mem12].length; mem12_++){
				textStruct.append(pgZTPList[mem12][mem12_]);
				if(mem12_ < pgZTPList[mem12].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem12 < pgZTPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("workerTrailList=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <workerTrailList.length; mem13++){
			textStruct.append("[");
			for(int mem13_ =0; mem13_ <workerTrailList[mem13].length; mem13_++){
				textStruct.append("[");
				for(int mem13__ =0; mem13__ <workerTrailList[mem13][mem13_].length; mem13__++){
					textStruct.append(workerTrailList[mem13][mem13_][mem13__]);
					if(mem13__ < workerTrailList[mem13][mem13_].length-1)
						textStruct.append(",");
				}
				textStruct.append("]");
				if(mem13_ < workerTrailList[mem13].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem13 < workerTrailList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectionTrail=");
		textStruct.append("[");
		for(int mem14 =0; mem14 <protectionTrail.length; mem14++){
			textStruct.append("[");
			for(int mem14_ =0; mem14_ <protectionTrail[mem14].length; mem14_++){
				textStruct.append(protectionTrail[mem14][mem14_]);
				if(mem14_ < protectionTrail[mem14].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem14 < protectionTrail.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tnpParameters=");
		textStruct.append("[");
		for(int mem15 =0; mem15 <tnpParameters.length; mem15++){
			textStruct.append(tnpParameters[mem15]);
			if(mem15 < tnpParameters.length-1)
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
		for(int mem18 =0; mem18 <additionalInfo.length; mem18++){
			textStruct.append(additionalInfo[mem18]);
			if(mem18 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
