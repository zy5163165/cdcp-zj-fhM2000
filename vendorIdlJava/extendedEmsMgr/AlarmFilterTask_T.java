package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmFilterTask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmFilterTask_T(){}
	public globaldefs.NameAndStringValue_T[] alarmFilterTaskName;
	public globaldefs.NameAndStringValue_T[] entityName;
	public java.lang.String nativeProbableCause = "";
	public java.lang.String ProbableCause = "";
	public notifications.PerceivedSeverity_T perceivedSeverity;
	public java.lang.String emsBeginTime;
	public java.lang.String emsEndTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmFilterTask_T(globaldefs.NameAndStringValue_T[] alarmFilterTaskName, globaldefs.NameAndStringValue_T[] entityName, java.lang.String nativeProbableCause, java.lang.String ProbableCause, notifications.PerceivedSeverity_T perceivedSeverity, java.lang.String emsBeginTime, java.lang.String emsEndTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.alarmFilterTaskName = alarmFilterTaskName;
		this.entityName = entityName;
		this.nativeProbableCause = nativeProbableCause;
		this.ProbableCause = ProbableCause;
		this.perceivedSeverity = perceivedSeverity;
		this.emsBeginTime = emsBeginTime;
		this.emsEndTime = emsEndTime;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlarmFilterTask_T");
		textStruct.append("(");
		textStruct.append("alarmFilterTaskName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <alarmFilterTaskName.length; mem0++){
			textStruct.append(alarmFilterTaskName[mem0]);
			if(mem0 < alarmFilterTaskName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("entityName=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <entityName.length; mem1++){
			textStruct.append(entityName[mem1]);
			if(mem1 < entityName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("nativeProbableCause=");
		textStruct.append(nativeProbableCause);
		textStruct.append(","); 
		textStruct.append("ProbableCause=");
		textStruct.append(ProbableCause);
		textStruct.append(","); 
		textStruct.append("perceivedSeverity=");
		textStruct.append(perceivedSeverity);
		textStruct.append(","); 
		textStruct.append("emsBeginTime=");
		textStruct.append(emsBeginTime);
		textStruct.append(","); 
		textStruct.append("emsEndTime=");
		textStruct.append(emsEndTime);
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
