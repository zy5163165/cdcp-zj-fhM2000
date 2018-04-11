package callSNC;

/**
 *	Generated from IDL definition of struct "Call_T"
 *	@author JacORB IDL compiler 
 */

public final class Call_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Call_T(){}
	public globaldefs.NameAndStringValue_T[] callName;
	public java.lang.String userLabel = "";
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String callId = "";
	public java.lang.String callState;
	public callSNC.CallEnd_T aEnd;
	public callSNC.CallEnd_T zEnd;
	public callSNC.CallParameterProfile_T callParameters;
	public callSNC.Diversity_T callDiversity;
	public java.lang.String diversitySynthesis = "";
	public callSNC.DiversityInfo_T linkDiversityViolations;
	public callSNC.DiversityInfo_T nodeDiversityViolations;
	public callSNC.DiversityInfo_T[] linkPartialDiversityList;
	public callSNC.DiversityInfo_T[] nodePartialDiversityList;
	public globaldefs.NameAndStringValue_T[] callAdditionalInfo;
	public Call_T(globaldefs.NameAndStringValue_T[] callName, java.lang.String userLabel, java.lang.String owner, java.lang.String networkAccessDomain, java.lang.String nativeEMSName, java.lang.String callId, java.lang.String callState, callSNC.CallEnd_T aEnd, callSNC.CallEnd_T zEnd, callSNC.CallParameterProfile_T callParameters, callSNC.Diversity_T callDiversity, java.lang.String diversitySynthesis, callSNC.DiversityInfo_T linkDiversityViolations, callSNC.DiversityInfo_T nodeDiversityViolations, callSNC.DiversityInfo_T[] linkPartialDiversityList, callSNC.DiversityInfo_T[] nodePartialDiversityList, globaldefs.NameAndStringValue_T[] callAdditionalInfo)
	{
		this.callName = callName;
		this.userLabel = userLabel;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.nativeEMSName = nativeEMSName;
		this.callId = callId;
		this.callState = callState;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.callParameters = callParameters;
		this.callDiversity = callDiversity;
		this.diversitySynthesis = diversitySynthesis;
		this.linkDiversityViolations = linkDiversityViolations;
		this.nodeDiversityViolations = nodeDiversityViolations;
		this.linkPartialDiversityList = linkPartialDiversityList;
		this.nodePartialDiversityList = nodePartialDiversityList;
		this.callAdditionalInfo = callAdditionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Call_T");
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
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("callId=");
		textStruct.append(callId);
		textStruct.append(","); 
		textStruct.append("callState=");
		textStruct.append(callState);
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
		textStruct.append("diversitySynthesis=");
		textStruct.append(diversitySynthesis);
		textStruct.append(","); 
		textStruct.append("linkDiversityViolations=");
		textStruct.append(linkDiversityViolations);
		textStruct.append(","); 
		textStruct.append("nodeDiversityViolations=");
		textStruct.append(nodeDiversityViolations);
		textStruct.append(","); 
		textStruct.append("linkPartialDiversityList=");
		textStruct.append("[");
		for(int mem14 =0; mem14 <linkPartialDiversityList.length; mem14++){
			textStruct.append(linkPartialDiversityList[mem14]);
			if(mem14 < linkPartialDiversityList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("nodePartialDiversityList=");
		textStruct.append("[");
		for(int mem15 =0; mem15 <nodePartialDiversityList.length; mem15++){
			textStruct.append(nodePartialDiversityList[mem15]);
			if(mem15 < nodePartialDiversityList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("callAdditionalInfo=");
		textStruct.append("[");
		for(int mem16 =0; mem16 <callAdditionalInfo.length; mem16++){
			textStruct.append(callAdditionalInfo[mem16]);
			if(mem16 < callAdditionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
