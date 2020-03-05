package performance;

/**
 *	Generated from IDL definition of struct "PMP_T"
 *	@author JacORB IDL compiler 
 */

public final class PMP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList;
	public performance.AdministrativeState_T monitoringState;
	public performance.AdministrativeState_T supervisionState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMP_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList, performance.AdministrativeState_T monitoringState, performance.AdministrativeState_T supervisionState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.pmParameterWithThresholdsList = pmParameterWithThresholdsList;
		this.monitoringState = monitoringState;
		this.supervisionState = supervisionState;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMP_T");
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
		textStruct.append("pmParameterWithThresholdsList=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <pmParameterWithThresholdsList.length; mem4++){
			textStruct.append(pmParameterWithThresholdsList[mem4]);
			if(mem4 < pmParameterWithThresholdsList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("monitoringState=");
		textStruct.append(monitoringState);
		textStruct.append(","); 
		textStruct.append("supervisionState=");
		textStruct.append(supervisionState);
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
