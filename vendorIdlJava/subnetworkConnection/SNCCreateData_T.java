package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public subnetworkConnection.ProtectionEffort_T protectionEffort;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public subnetworkConnection.CrossConnect_T[] ccInclusions;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public globaldefs.NameAndStringValue_T[][] aEnd;
	public globaldefs.NameAndStringValue_T[][] zEnd;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, subnetworkConnection.ProtectionEffort_T protectionEffort, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, subnetworkConnection.SNCType_T sncType, short layerRate, subnetworkConnection.CrossConnect_T[] ccInclusions, globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNCCreateData_T");
		textStruct.append("(");
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("staticProtectionLevel=");
		textStruct.append(staticProtectionLevel);
		textStruct.append(","); 
		textStruct.append("protectionEffort=");
		textStruct.append(protectionEffort);
		textStruct.append(","); 
		textStruct.append("rerouteAllowed=");
		textStruct.append(rerouteAllowed);
		textStruct.append(","); 
		textStruct.append("networkRouted=");
		textStruct.append(networkRouted);
		textStruct.append(","); 
		textStruct.append("sncType=");
		textStruct.append(sncType);
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("ccInclusions=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <ccInclusions.length; mem10++){
			textStruct.append(ccInclusions[mem10]);
			if(mem10 < ccInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("neTpInclusions=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <neTpInclusions.length; mem11++){
			textStruct.append("[");
			for(int mem11_ =0; mem11_ <neTpInclusions[mem11].length; mem11_++){
				textStruct.append(neTpInclusions[mem11][mem11_]);
				if(mem11_ < neTpInclusions[mem11].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem11 < neTpInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("fullRoute=");
		textStruct.append(fullRoute);
		textStruct.append(","); 
		textStruct.append("neTpSncExclusions=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <neTpSncExclusions.length; mem13++){
			textStruct.append("[");
			for(int mem13_ =0; mem13_ <neTpSncExclusions[mem13].length; mem13_++){
				textStruct.append(neTpSncExclusions[mem13][mem13_]);
				if(mem13_ < neTpSncExclusions[mem13].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem13 < neTpSncExclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem14 =0; mem14 <aEnd.length; mem14++){
			textStruct.append("[");
			for(int mem14_ =0; mem14_ <aEnd[mem14].length; mem14_++){
				textStruct.append(aEnd[mem14][mem14_]);
				if(mem14_ < aEnd[mem14].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem14 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem15 =0; mem15 <zEnd.length; mem15++){
			textStruct.append("[");
			for(int mem15_ =0; mem15_ <zEnd[mem15].length; mem15_++){
				textStruct.append(zEnd[mem15][mem15_]);
				if(mem15_ < zEnd[mem15].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem15 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem16 =0; mem16 <additionalCreationInfo.length; mem16++){
			textStruct.append(additionalCreationInfo[mem16]);
			if(mem16 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
