package flowDomain;

/**
 *	Generated from IDL definition of struct "MFDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MFDCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public globaldefs.NameAndStringValue_T[][] unassignedCPTPs;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public MFDCreateData_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, globaldefs.NameAndStringValue_T[][] unassignedCPTPs, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.unassignedCPTPs = unassignedCPTPs;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MFDCreateData_T");
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
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("unassignedCPTPs=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <unassignedCPTPs.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <unassignedCPTPs[mem5].length; mem5_++){
				textStruct.append(unassignedCPTPs[mem5][mem5_]);
				if(mem5_ < unassignedCPTPs[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < unassignedCPTPs.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <transmissionParams.length; mem6++){
			textStruct.append(transmissionParams[mem6]);
			if(mem6 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalCreationInfo.length; mem7++){
			textStruct.append(additionalCreationInfo[mem7]);
			if(mem7 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
