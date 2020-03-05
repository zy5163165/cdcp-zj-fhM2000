package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverPlan_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverPlan_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BusinessCutOverPlan_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String mode = "";
	public java.lang.String policy = "";
	public java.lang.String cutOverTime = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BusinessCutOverPlan_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String mode, java.lang.String policy, java.lang.String cutOverTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.mode = mode;
		this.policy = policy;
		this.cutOverTime = cutOverTime;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BusinessCutOverPlan_T");
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
		textStruct.append("mode=");
		textStruct.append(mode);
		textStruct.append(","); 
		textStruct.append("policy=");
		textStruct.append(policy);
		textStruct.append(","); 
		textStruct.append("cutOverTime=");
		textStruct.append(cutOverTime);
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
