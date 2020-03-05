package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "TPData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPData_T(){}
	public globaldefs.NameAndStringValue_T[] tpName;
	public terminationPoint.TerminationMode_T tpMappingMode;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public TPData_T(globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationMode_T tpMappingMode, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName)
	{
		this.tpName = tpName;
		this.tpMappingMode = tpMappingMode;
		this.transmissionParams = transmissionParams;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TPData_T");
		textStruct.append("(");
		textStruct.append("tpName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <tpName.length; mem0++){
			textStruct.append(tpName[mem0]);
			if(mem0 < tpName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tpMappingMode=");
		textStruct.append(tpMappingMode);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <transmissionParams.length; mem2++){
			textStruct.append(transmissionParams[mem2]);
			if(mem2 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("ingressTrafficDescriptorName=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <ingressTrafficDescriptorName.length; mem3++){
			textStruct.append(ingressTrafficDescriptorName[mem3]);
			if(mem3 < ingressTrafficDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("egressTrafficDescriptorName=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <egressTrafficDescriptorName.length; mem4++){
			textStruct.append(egressTrafficDescriptorName[mem4]);
			if(mem4 < egressTrafficDescriptorName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
