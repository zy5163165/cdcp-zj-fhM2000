package callSNC;

/**
 *	Generated from IDL definition of struct "CallCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class CallCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallCreateData_T(){}
	public globaldefs.NameAndStringValue_T[] callName;
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public callSNC.CallEnd_T aEnd;
	public callSNC.CallEnd_T zEnd;
	public callSNC.CallParameterProfile_T callParameters;
	public callSNC.Diversity_T callDiversity;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public CallCreateData_T(globaldefs.NameAndStringValue_T[] callName, java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, callSNC.CallEnd_T aEnd, callSNC.CallEnd_T zEnd, callSNC.CallParameterProfile_T callParameters, callSNC.Diversity_T callDiversity, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.callName = callName;
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.callParameters = callParameters;
		this.callDiversity = callDiversity;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CallCreateData_T");
		textStruct.append("(");
		textStruct.append("callName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <callName.length; mem0++){
			textStruct.append(callName[mem0]);
			if(mem0 < callName.length-1)
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
		textStruct.append("aEnd=");
		textStruct.append(aEnd);
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append(zEnd);
		textStruct.append(","); 
		textStruct.append("callParameters=");
		textStruct.append(callParameters);
		textStruct.append(","); 
		textStruct.append("callDiversity=");
		textStruct.append(callDiversity);
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <additionalCreationInfo.length; mem9++){
			textStruct.append(additionalCreationInfo[mem9]);
			if(mem9 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
