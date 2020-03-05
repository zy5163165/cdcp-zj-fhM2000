package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TDCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public trafficDescriptor.ServiceCategory_T serviceCategory;
	public globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TDCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, trafficDescriptor.ServiceCategory_T serviceCategory, globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TDCreateData_T");
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
		textStruct.append("serviceCategory=");
		textStruct.append(serviceCategory);
		textStruct.append(","); 
		textStruct.append("trafficParameters=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <trafficParameters.length; mem4++){
			textStruct.append(trafficParameters[mem4]);
			if(mem4 < trafficParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("conformanceDefinition=");
		textStruct.append(conformanceDefinition);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalInfo.length; mem6++){
			textStruct.append(additionalInfo[mem6]);
			if(mem6 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
