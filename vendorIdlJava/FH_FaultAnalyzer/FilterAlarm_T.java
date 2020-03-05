package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "FilterAlarm_T"
 *	@author JacORB IDL compiler 
 */

public final class FilterAlarm_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FilterAlarm_T(){}
	public org.omg.CosNotification.StructuredEvent emsAlarm;
	public java.lang.String businessNetWorkID = "";
	public FH_FaultAnalyzer.FilterAlarm_T[] childAlarmList;
	public FilterAlarm_T(org.omg.CosNotification.StructuredEvent emsAlarm, java.lang.String businessNetWorkID, FH_FaultAnalyzer.FilterAlarm_T[] childAlarmList)
	{
		this.emsAlarm = emsAlarm;
		this.businessNetWorkID = businessNetWorkID;
		this.childAlarmList = childAlarmList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FilterAlarm_T");
		textStruct.append("(");
		textStruct.append("emsAlarm=");
		textStruct.append(emsAlarm);
		textStruct.append(","); 
		textStruct.append("businessNetWorkID=");
		textStruct.append(businessNetWorkID);
		textStruct.append(","); 
		textStruct.append("childAlarmList=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <childAlarmList.length; mem2++){
			textStruct.append(childAlarmList[mem2]);
			if(mem2 < childAlarmList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
