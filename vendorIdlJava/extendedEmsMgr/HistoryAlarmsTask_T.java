package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "HistoryAlarmsTask_T"
 *	@author JacORB IDL compiler 
 */

public final class HistoryAlarmsTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HistoryAlarmsTask_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public notifications.ObjectType_T[] objectTypeList;
	public java.lang.String[] excludeProbCauseList;
	public notifications.PerceivedSeverity_T[] excludeSeverityList;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public HistoryAlarmsTask_T(globaldefs.NameAndStringValue_T[] objectName, notifications.ObjectType_T[] objectTypeList, java.lang.String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String beginTime, java.lang.String endTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.objectTypeList = objectTypeList;
		this.excludeProbCauseList = excludeProbCauseList;
		this.excludeSeverityList = excludeSeverityList;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("HistoryAlarmsTask_T");
		textStruct.append("(");
		textStruct.append("objectName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <objectName.length; mem0++){
			textStruct.append(objectName[mem0]);
			if(mem0 < objectName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("objectTypeList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <objectTypeList.length; mem1++){
			textStruct.append(objectTypeList[mem1]);
			if(mem1 < objectTypeList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("excludeProbCauseList=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <excludeProbCauseList.length; mem2++){
			textStruct.append(excludeProbCauseList[mem2]);
			if(mem2 < excludeProbCauseList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("excludeSeverityList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <excludeSeverityList.length; mem3++){
			textStruct.append(excludeSeverityList[mem3]);
			if(mem3 < excludeSeverityList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("beginTime=");
		textStruct.append(beginTime);
		textStruct.append(","); 
		textStruct.append("endTime=");
		textStruct.append(endTime);
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
