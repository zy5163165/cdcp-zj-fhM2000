package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TPPoolCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPPoolCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPPoolCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public multiLayerSubnetwork.MultiLayerSubnetwork_T containingMLSN;
	public globaldefs.NameAndStringValue_T[][] containedMembers;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public java.lang.String descriptionOfUse = "";
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TPPoolCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, multiLayerSubnetwork.MultiLayerSubnetwork_T containingMLSN, globaldefs.NameAndStringValue_T[][] containedMembers, transmissionParameters.LayeredParameters_T[] transmissionParams, java.lang.String descriptionOfUse, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.containingMLSN = containingMLSN;
		this.containedMembers = containedMembers;
		this.transmissionParams = transmissionParams;
		this.descriptionOfUse = descriptionOfUse;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TPPoolCreateData_T");
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
		textStruct.append("containingMLSN=");
		textStruct.append(containingMLSN);
		textStruct.append(","); 
		textStruct.append("containedMembers=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <containedMembers.length; mem4++){
			textStruct.append("[");
			for(int mem4_ =0; mem4_ <containedMembers[mem4].length; mem4_++){
				textStruct.append(containedMembers[mem4][mem4_]);
				if(mem4_ < containedMembers[mem4].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem4 < containedMembers.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <transmissionParams.length; mem5++){
			textStruct.append(transmissionParams[mem5]);
			if(mem5 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("descriptionOfUse=");
		textStruct.append(descriptionOfUse);
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
