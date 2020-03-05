package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "LogTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class LogTransmissionTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LogTransmissionTask_T(){}
	public java.lang.String eventTypeName = "";
	public notifications.ObjectType_T[] objectTypeList;
	public boolean beCompressed;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public LogTransmissionTask_T(java.lang.String eventTypeName, notifications.ObjectType_T[] objectTypeList, boolean beCompressed, java.lang.String beginTime, java.lang.String endTime, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.eventTypeName = eventTypeName;
		this.objectTypeList = objectTypeList;
		this.beCompressed = beCompressed;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("LogTransmissionTask_T");
		textStruct.append("(");
		textStruct.append("eventTypeName=");
		textStruct.append(eventTypeName);
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
		textStruct.append("beCompressed=");
		textStruct.append(beCompressed);
		textStruct.append(","); 
		textStruct.append("beginTime=");
		textStruct.append(beginTime);
		textStruct.append(","); 
		textStruct.append("endTime=");
		textStruct.append(endTime);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalInfo.length; mem5++){
			textStruct.append(additionalInfo[mem5]);
			if(mem5 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
