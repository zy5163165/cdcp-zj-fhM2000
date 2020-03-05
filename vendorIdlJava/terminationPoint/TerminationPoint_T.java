package terminationPoint;

/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TerminationPoint_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public terminationPoint.TPType_T type;
	public terminationPoint.TPConnectionState_T connectionState;
	public terminationPoint.TerminationMode_T tpMappingMode;
	public terminationPoint.Directionality_T direction;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public terminationPoint.TPProtectionAssociation_T tpProtectionAssociation;
	public boolean edgePoint;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TerminationPoint_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName, terminationPoint.TPType_T type, terminationPoint.TPConnectionState_T connectionState, terminationPoint.TerminationMode_T tpMappingMode, terminationPoint.Directionality_T direction, transmissionParameters.LayeredParameters_T[] transmissionParams, terminationPoint.TPProtectionAssociation_T tpProtectionAssociation, boolean edgePoint, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
		this.type = type;
		this.connectionState = connectionState;
		this.tpMappingMode = tpMappingMode;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.tpProtectionAssociation = tpProtectionAssociation;
		this.edgePoint = edgePoint;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TerminationPoint_T");
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
		textStruct.append("ingressTrafficDescriptorName=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <ingressTrafficDescriptorName.length; mem4++){
			textStruct.append(ingressTrafficDescriptorName[mem4]);
			if(mem4 < ingressTrafficDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("egressTrafficDescriptorName=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <egressTrafficDescriptorName.length; mem5++){
			textStruct.append(egressTrafficDescriptorName[mem5]);
			if(mem5 < egressTrafficDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("type=");
		textStruct.append(type);
		textStruct.append(","); 
		textStruct.append("connectionState=");
		textStruct.append(connectionState);
		textStruct.append(","); 
		textStruct.append("tpMappingMode=");
		textStruct.append(tpMappingMode);
		textStruct.append(","); 
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <transmissionParams.length; mem10++){
			textStruct.append(transmissionParams[mem10]);
			if(mem10 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tpProtectionAssociation=");
		textStruct.append(tpProtectionAssociation);
		textStruct.append(","); 
		textStruct.append("edgePoint=");
		textStruct.append(edgePoint);
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
