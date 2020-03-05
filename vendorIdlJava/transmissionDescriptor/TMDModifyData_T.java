package transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TMDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class TMDModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TMDModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalObjectInfo;
	public globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TMDModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalObjectInfo, globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalObjectInfo = additionalObjectInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TMDModifyData_T");
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
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <transmissionParams.length; mem3++){
			textStruct.append(transmissionParams[mem3]);
			if(mem3 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalObjectInfo=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <additionalObjectInfo.length; mem4++){
			textStruct.append(additionalObjectInfo[mem4]);
			if(mem4 < additionalObjectInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("containingTMDName=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <containingTMDName.length; mem5++){
			textStruct.append(containingTMDName[mem5]);
			if(mem5 < containingTMDName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("externalRepresentationReference=");
		textStruct.append(externalRepresentationReference);
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
