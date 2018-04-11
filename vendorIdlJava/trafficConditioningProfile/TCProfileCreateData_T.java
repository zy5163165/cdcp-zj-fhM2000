package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfileCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfileCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCProfileCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TCProfileCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TCProfileCreateData_T");
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
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <additionalCreationInfo.length; mem4++){
			textStruct.append(additionalCreationInfo[mem4]);
			if(mem4 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
