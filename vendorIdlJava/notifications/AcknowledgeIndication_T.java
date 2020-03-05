package notifications;
/**
 *	Generated from IDL definition of enum "AcknowledgeIndication_T"
 *	@author JacORB IDL compiler 
 */

public final class AcknowledgeIndication_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _AI_EVENT_ACKNOWLEDGED = 0;
	public static final AcknowledgeIndication_T AI_EVENT_ACKNOWLEDGED = new AcknowledgeIndication_T(_AI_EVENT_ACKNOWLEDGED);
	public static final int _AI_EVENT_UNACKNOWLEDGED = 1;
	public static final AcknowledgeIndication_T AI_EVENT_UNACKNOWLEDGED = new AcknowledgeIndication_T(_AI_EVENT_UNACKNOWLEDGED);
	public static final int _AI_NA = 2;
	public static final AcknowledgeIndication_T AI_NA = new AcknowledgeIndication_T(_AI_NA);
	public int value()
	{
		return value;
	}
	public static AcknowledgeIndication_T from_int(int value)
	{
		switch (value) {
			case _AI_EVENT_ACKNOWLEDGED: return AI_EVENT_ACKNOWLEDGED;
			case _AI_EVENT_UNACKNOWLEDGED: return AI_EVENT_UNACKNOWLEDGED;
			case _AI_NA: return AI_NA;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AcknowledgeIndication_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int( value() );
	}
	public String toString()
	{
		StringBuffer textEnum = new StringBuffer();
		textEnum.append("AcknowledgeIndication_T");
		textEnum.append(".");
		switch(value())
		{
		case _AI_EVENT_ACKNOWLEDGED:
			textEnum.append("AI_EVENT_ACKNOWLEDGED");
			break;
		case _AI_EVENT_UNACKNOWLEDGED:
			textEnum.append("AI_EVENT_UNACKNOWLEDGED");
			break;
		case _AI_NA:
			textEnum.append("AI_NA");
			break;
		}
		return textEnum.toString();
	}
}
