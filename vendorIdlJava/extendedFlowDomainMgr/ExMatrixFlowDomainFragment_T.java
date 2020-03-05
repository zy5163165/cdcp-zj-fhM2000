package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "ExMatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class ExMatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ExMatrixFlowDomainFragment_T(){}
	public globaldefs.NameAndStringValue_T[] exMFdFrName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public boolean flexible;
	public boolean active;
	public java.lang.String mfdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ExMatrixFlowDomainFragment_T(globaldefs.NameAndStringValue_T[] exMFdFrName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, boolean flexible, boolean active, java.lang.String mfdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.exMFdFrName = exMFdFrName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.flexible = flexible;
		this.active = active;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ExMatrixFlowDomainFragment_T");
		textStruct.append("(");
		textStruct.append("exMFdFrName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <exMFdFrName.length; mem0++){
			textStruct.append(exMFdFrName[mem0]);
			if(mem0 < exMFdFrName.length-1)
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
		textStruct.append("flexible=");
		textStruct.append(flexible);
		textStruct.append(","); 
		textStruct.append("active=");
		textStruct.append(active);
		textStruct.append(","); 
		textStruct.append("mfdfrType=");
		textStruct.append(mfdfrType);
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
