package notifications;

/**
 *	Generated from IDL definition of struct "CorrelatedNotifications_T"
 *	@author JacORB IDL compiler 
 */

public final class CorrelatedNotifications_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CorrelatedNotifications_T(){}
	public globaldefs.NameAndStringValue_T[] source;
	public java.lang.String[] notifIDs;
	public CorrelatedNotifications_T(globaldefs.NameAndStringValue_T[] source, java.lang.String[] notifIDs)
	{
		this.source = source;
		this.notifIDs = notifIDs;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CorrelatedNotifications_T");
		textStruct.append("(");
		textStruct.append("source=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <source.length; mem0++){
			textStruct.append(source[mem0]);
			if(mem0 < source.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("notifIDs=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <notifIDs.length; mem1++){
			textStruct.append(notifIDs[mem1]);
			if(mem1 < notifIDs.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
