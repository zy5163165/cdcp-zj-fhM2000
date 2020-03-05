package aSAP;

/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ASAPCreateModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ASAPCreateModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, aSAP.AlarmSeverityAssignment_T[] alarmSeverityAssignmentList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.alarmSeverityAssignmentList = alarmSeverityAssignmentList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ASAPCreateModifyData_T");
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
		textStruct.append("alarmSeverityAssignmentList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <alarmSeverityAssignmentList.length; mem3++){
			textStruct.append(alarmSeverityAssignmentList[mem3]);
			if(mem3 < alarmSeverityAssignmentList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <additionalInfo.length; mem4++){
			textStruct.append(additionalInfo[mem4]);
			if(mem4 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
