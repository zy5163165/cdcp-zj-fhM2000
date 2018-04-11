package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "exFdFrCreateAdditionalData_T"
 *	@author JacORB IDL compiler 
 */

public final class exFdFrCreateAdditionalData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public exFdFrCreateAdditionalData_T(){}
	public boolean fullRoute;
	public boolean forceUniqueness;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[][] inclusionResource;
	public globaldefs.NameAndStringValue_T[][] exclusionResource;
	public extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] ccInclusions;
	public extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] backupCCInclusions;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public exFdFrCreateAdditionalData_T(boolean fullRoute, boolean forceUniqueness, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, short layerRate, globaldefs.NameAndStringValue_T[][] inclusionResource, globaldefs.NameAndStringValue_T[][] exclusionResource, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] ccInclusions, extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] backupCCInclusions, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.fullRoute = fullRoute;
		this.forceUniqueness = forceUniqueness;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.layerRate = layerRate;
		this.inclusionResource = inclusionResource;
		this.exclusionResource = exclusionResource;
		this.ccInclusions = ccInclusions;
		this.backupCCInclusions = backupCCInclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("exFdFrCreateAdditionalData_T");
		textStruct.append("(");
		textStruct.append("fullRoute=");
		textStruct.append(fullRoute);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("rerouteAllowed=");
		textStruct.append(rerouteAllowed);
		textStruct.append(","); 
		textStruct.append("networkRouted=");
		textStruct.append(networkRouted);
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("inclusionResource=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <inclusionResource.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <inclusionResource[mem5].length; mem5_++){
				textStruct.append(inclusionResource[mem5][mem5_]);
				if(mem5_ < inclusionResource[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < inclusionResource.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("exclusionResource=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <exclusionResource.length; mem6++){
			textStruct.append("[");
			for(int mem6_ =0; mem6_ <exclusionResource[mem6].length; mem6_++){
				textStruct.append(exclusionResource[mem6][mem6_]);
				if(mem6_ < exclusionResource[mem6].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem6 < exclusionResource.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("ccInclusions=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <ccInclusions.length; mem7++){
			textStruct.append(ccInclusions[mem7]);
			if(mem7 < ccInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("backupCCInclusions=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <backupCCInclusions.length; mem8++){
			textStruct.append(backupCCInclusions[mem8]);
			if(mem8 < backupCCInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <additionalCreationInfo.length; mem9++){
			textStruct.append(additionalCreationInfo[mem9]);
			if(mem9 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
