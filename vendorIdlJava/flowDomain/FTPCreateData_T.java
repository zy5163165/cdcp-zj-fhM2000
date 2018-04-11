package flowDomain;

/**
 *	Generated from IDL definition of struct "FTPCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FTPCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FTPCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] equipmentName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName;
	public globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName;
	public terminationPoint.TerminationMode_T tpMappingMode;
	public terminationPoint.Directionality_T direction;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FTPCreateData_T(globaldefs.NameAndStringValue_T[] equipmentName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[] ingressTransmissionDescriptorName, globaldefs.NameAndStringValue_T[] egressTransmissionDescriptorName, terminationPoint.TerminationMode_T tpMappingMode, terminationPoint.Directionality_T direction, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.equipmentName = equipmentName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.ingressTransmissionDescriptorName = ingressTransmissionDescriptorName;
		this.egressTransmissionDescriptorName = egressTransmissionDescriptorName;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FTPCreateData_T");
		textStruct.append("(");
		textStruct.append("equipmentName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <equipmentName.length; mem0++){
			textStruct.append(equipmentName[mem0]);
			if(mem0 < equipmentName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("ingressTransmissionDescriptorName=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <ingressTransmissionDescriptorName.length; mem5++){
			textStruct.append(ingressTransmissionDescriptorName[mem5]);
			if(mem5 < ingressTransmissionDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("egressTransmissionDescriptorName=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <egressTransmissionDescriptorName.length; mem6++){
			textStruct.append(egressTransmissionDescriptorName[mem6]);
			if(mem6 < egressTransmissionDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tpMappingMode=");
		textStruct.append(tpMappingMode);
		textStruct.append(","); 
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <transmissionParams.length; mem9++){
			textStruct.append(transmissionParams[mem9]);
			if(mem9 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <additionalCreationInfo.length; mem10++){
			textStruct.append(additionalCreationInfo[mem10]);
			if(mem10 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
