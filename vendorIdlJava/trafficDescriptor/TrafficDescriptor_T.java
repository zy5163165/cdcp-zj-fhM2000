package trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TrafficDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficDescriptor_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public trafficDescriptor.ServiceCategory_T serviceCategory;
	public globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficDescriptor_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, trafficDescriptor.ServiceCategory_T serviceCategory, globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TrafficDescriptor_T");
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
		textStruct.append("serviceCategory=");
		textStruct.append(serviceCategory);
		textStruct.append(","); 
		textStruct.append("trafficParameters=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <trafficParameters.length; mem5++){
			textStruct.append(trafficParameters[mem5]);
			if(mem5 < trafficParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("conformanceDefinition=");
		textStruct.append(conformanceDefinition);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalInfo.length; mem7++){
			textStruct.append(additionalInfo[mem7]);
			if(mem7 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
