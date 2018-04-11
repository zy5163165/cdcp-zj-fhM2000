package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "SNCModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public java.lang.String modifyType = "";
	public boolean retainOldSNC;
	public boolean modifyServers_allowed;
	public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public subnetworkConnection.ProtectionEffort_T protectionEffort;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public subnetworkConnection.SNCType_T sncType;
	public short layerRate;
	public subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute;
	public subnetworkConnection.RouteDescriptor_T[] removedRoute;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public globaldefs.NameAndStringValue_T[][] aEnd;
	public globaldefs.NameAndStringValue_T[][] zEnd;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public SNCModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, java.lang.String modifyType, boolean retainOldSNC, boolean modifyServers_allowed, subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, subnetworkConnection.ProtectionEffort_T protectionEffort, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, subnetworkConnection.SNCType_T sncType, short layerRate, subnetworkConnection.RouteDescriptor_T[] addedOrNewRoute, subnetworkConnection.RouteDescriptor_T[] removedRoute, globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.modifyType = modifyType;
		this.retainOldSNC = retainOldSNC;
		this.modifyServers_allowed = modifyServers_allowed;
		this.staticProtectionLevel = staticProtectionLevel;
		this.protectionEffort = protectionEffort;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.sncType = sncType;
		this.layerRate = layerRate;
		this.addedOrNewRoute = addedOrNewRoute;
		this.removedRoute = removedRoute;
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
		textStruct.append("SNCModifyData_T");
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
		textStruct.append("modifyType=");
		textStruct.append(modifyType);
		textStruct.append(","); 
		textStruct.append("retainOldSNC=");
		textStruct.append(retainOldSNC);
		textStruct.append(","); 
		textStruct.append("modifyServers_allowed=");
		textStruct.append(modifyServers_allowed);
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
		textStruct.append("addedOrNewRoute=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <addedOrNewRoute.length; mem13++){
			textStruct.append(addedOrNewRoute[mem13]);
			if(mem13 < addedOrNewRoute.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("removedRoute=");
		textStruct.append("[");
		for(int mem14 =0; mem14 <removedRoute.length; mem14++){
			textStruct.append(removedRoute[mem14]);
			if(mem14 < removedRoute.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("neTpInclusions=");
		textStruct.append("[");
		for(int mem15 =0; mem15 <neTpInclusions.length; mem15++){
			textStruct.append("[");
			for(int mem15_ =0; mem15_ <neTpInclusions[mem15].length; mem15_++){
				textStruct.append(neTpInclusions[mem15][mem15_]);
				if(mem15_ < neTpInclusions[mem15].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem15 < neTpInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("fullRoute=");
		textStruct.append(fullRoute);
		textStruct.append(","); 
		textStruct.append("neTpSncExclusions=");
		textStruct.append("[");
		for(int mem17 =0; mem17 <neTpSncExclusions.length; mem17++){
			textStruct.append("[");
			for(int mem17_ =0; mem17_ <neTpSncExclusions[mem17].length; mem17_++){
				textStruct.append(neTpSncExclusions[mem17][mem17_]);
				if(mem17_ < neTpSncExclusions[mem17].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem17 < neTpSncExclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem18 =0; mem18 <aEnd.length; mem18++){
			textStruct.append("[");
			for(int mem18_ =0; mem18_ <aEnd[mem18].length; mem18_++){
				textStruct.append(aEnd[mem18][mem18_]);
				if(mem18_ < aEnd[mem18].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem18 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem19 =0; mem19 <zEnd.length; mem19++){
			textStruct.append("[");
			for(int mem19_ =0; mem19_ <zEnd[mem19].length; mem19_++){
				textStruct.append(zEnd[mem19][mem19_]);
				if(mem19_ < zEnd[mem19].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem19 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem20 =0; mem20 <additionalCreationInfo.length; mem20++){
			textStruct.append(additionalCreationInfo[mem20]);
			if(mem20 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
