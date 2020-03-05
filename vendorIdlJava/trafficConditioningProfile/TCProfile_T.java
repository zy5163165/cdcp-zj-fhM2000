package trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCProfile_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean defaultProfile;
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TCProfile_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean defaultProfile, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.defaultProfile = defaultProfile;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TCProfile_T");
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
		textStruct.append("defaultProfile=");
		textStruct.append(defaultProfile);
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
