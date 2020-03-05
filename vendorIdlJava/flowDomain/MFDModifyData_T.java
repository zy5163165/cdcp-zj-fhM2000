package flowDomain;

/**
 *	Generated from IDL definition of struct "MFDModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class MFDModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MFDModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public MFDModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.additionalModificationInfo = additionalModificationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MFDModifyData_T");
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
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <transmissionParams.length; mem4++){
			textStruct.append(transmissionParams[mem4]);
			if(mem4 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalModificationInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalModificationInfo.length; mem5++){
			textStruct.append(additionalModificationInfo[mem5]);
			if(mem5 < additionalModificationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
