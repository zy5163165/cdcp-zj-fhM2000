package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class FlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FlowDomainFragment_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String networkAccessDomain = "";
	public boolean flexible;
	public performance.AdministrativeState_T administrativeState;
	public subnetworkConnection.SNCState_T fdfrState;
	public java.lang.String fdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public FlowDomainFragment_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, java.lang.String networkAccessDomain, boolean flexible, performance.AdministrativeState_T administrativeState, subnetworkConnection.SNCState_T fdfrState, java.lang.String fdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.networkAccessDomain = networkAccessDomain;
		this.flexible = flexible;
		this.administrativeState = administrativeState;
		this.fdfrState = fdfrState;
		this.fdfrType = fdfrType;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FlowDomainFragment_T");
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
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append(transmissionParams);
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <aEnd.length; mem6++){
			textStruct.append(aEnd[mem6]);
			if(mem6 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <zEnd.length; mem7++){
			textStruct.append(zEnd[mem7]);
			if(mem7 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("flexible=");
		textStruct.append(flexible);
		textStruct.append(","); 
		textStruct.append("administrativeState=");
		textStruct.append(administrativeState);
		textStruct.append(","); 
		textStruct.append("fdfrState=");
		textStruct.append(fdfrState);
		textStruct.append(","); 
		textStruct.append("fdfrType=");
		textStruct.append(fdfrType);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <additionalInfo.length; mem13++){
			textStruct.append(additionalInfo[mem13]);
			if(mem13 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
