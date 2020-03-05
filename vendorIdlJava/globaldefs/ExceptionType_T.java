package globaldefs;
/**
 *	Generated from IDL definition of enum "ExceptionType_T"
 *	@author JacORB IDL compiler 
 */

public final class ExceptionType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EXCPT_NOT_IMPLEMENTED = 0;
	public static final ExceptionType_T EXCPT_NOT_IMPLEMENTED = new ExceptionType_T(_EXCPT_NOT_IMPLEMENTED);
	public static final int _EXCPT_INTERNAL_ERROR = 1;
	public static final ExceptionType_T EXCPT_INTERNAL_ERROR = new ExceptionType_T(_EXCPT_INTERNAL_ERROR);
	public static final int _EXCPT_INVALID_INPUT = 2;
	public static final ExceptionType_T EXCPT_INVALID_INPUT = new ExceptionType_T(_EXCPT_INVALID_INPUT);
	public static final int _EXCPT_OBJECT_IN_USE = 3;
	public static final ExceptionType_T EXCPT_OBJECT_IN_USE = new ExceptionType_T(_EXCPT_OBJECT_IN_USE);
	public static final int _EXCPT_TP_INVALID_ENDPOINT = 4;
	public static final ExceptionType_T EXCPT_TP_INVALID_ENDPOINT = new ExceptionType_T(_EXCPT_TP_INVALID_ENDPOINT);
	public static final int _EXCPT_ENTITY_NOT_FOUND = 5;
	public static final ExceptionType_T EXCPT_ENTITY_NOT_FOUND = new ExceptionType_T(_EXCPT_ENTITY_NOT_FOUND);
	public static final int _EXCPT_TIMESLOT_IN_USE = 6;
	public static final ExceptionType_T EXCPT_TIMESLOT_IN_USE = new ExceptionType_T(_EXCPT_TIMESLOT_IN_USE);
	public static final int _EXCPT_PROTECTION_EFFORT_NOT_MET = 7;
	public static final ExceptionType_T EXCPT_PROTECTION_EFFORT_NOT_MET = new ExceptionType_T(_EXCPT_PROTECTION_EFFORT_NOT_MET);
	public static final int _EXCPT_NOT_IN_VALID_STATE = 8;
	public static final ExceptionType_T EXCPT_NOT_IN_VALID_STATE = new ExceptionType_T(_EXCPT_NOT_IN_VALID_STATE);
	public static final int _EXCPT_UNABLE_TO_COMPLY = 9;
	public static final ExceptionType_T EXCPT_UNABLE_TO_COMPLY = new ExceptionType_T(_EXCPT_UNABLE_TO_COMPLY);
	public static final int _EXCPT_NE_COMM_LOSS = 10;
	public static final ExceptionType_T EXCPT_NE_COMM_LOSS = new ExceptionType_T(_EXCPT_NE_COMM_LOSS);
	public static final int _EXCPT_CAPACITY_EXCEEDED = 11;
	public static final ExceptionType_T EXCPT_CAPACITY_EXCEEDED = new ExceptionType_T(_EXCPT_CAPACITY_EXCEEDED);
	public static final int _EXCPT_ACCESS_DENIED = 12;
	public static final ExceptionType_T EXCPT_ACCESS_DENIED = new ExceptionType_T(_EXCPT_ACCESS_DENIED);
	public static final int _EXCPT_TOO_MANY_OPEN_ITERATORS = 13;
	public static final ExceptionType_T EXCPT_TOO_MANY_OPEN_ITERATORS = new ExceptionType_T(_EXCPT_TOO_MANY_OPEN_ITERATORS);
	public static final int _EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS = 14;
	public static final ExceptionType_T EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS = new ExceptionType_T(_EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS);
	public static final int _EXCPT_USERLABEL_IN_USE = 15;
	public static final ExceptionType_T EXCPT_USERLABEL_IN_USE = new ExceptionType_T(_EXCPT_USERLABEL_IN_USE);
	public int value()
	{
		return value;
	}
	public static ExceptionType_T from_int(int value)
	{
		switch (value) {
			case _EXCPT_NOT_IMPLEMENTED: return EXCPT_NOT_IMPLEMENTED;
			case _EXCPT_INTERNAL_ERROR: return EXCPT_INTERNAL_ERROR;
			case _EXCPT_INVALID_INPUT: return EXCPT_INVALID_INPUT;
			case _EXCPT_OBJECT_IN_USE: return EXCPT_OBJECT_IN_USE;
			case _EXCPT_TP_INVALID_ENDPOINT: return EXCPT_TP_INVALID_ENDPOINT;
			case _EXCPT_ENTITY_NOT_FOUND: return EXCPT_ENTITY_NOT_FOUND;
			case _EXCPT_TIMESLOT_IN_USE: return EXCPT_TIMESLOT_IN_USE;
			case _EXCPT_PROTECTION_EFFORT_NOT_MET: return EXCPT_PROTECTION_EFFORT_NOT_MET;
			case _EXCPT_NOT_IN_VALID_STATE: return EXCPT_NOT_IN_VALID_STATE;
			case _EXCPT_UNABLE_TO_COMPLY: return EXCPT_UNABLE_TO_COMPLY;
			case _EXCPT_NE_COMM_LOSS: return EXCPT_NE_COMM_LOSS;
			case _EXCPT_CAPACITY_EXCEEDED: return EXCPT_CAPACITY_EXCEEDED;
			case _EXCPT_ACCESS_DENIED: return EXCPT_ACCESS_DENIED;
			case _EXCPT_TOO_MANY_OPEN_ITERATORS: return EXCPT_TOO_MANY_OPEN_ITERATORS;
			case _EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS: return EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS;
			case _EXCPT_USERLABEL_IN_USE: return EXCPT_USERLABEL_IN_USE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ExceptionType_T(int i)
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
		textEnum.append("ExceptionType_T");
		textEnum.append(".");
		switch(value())
		{
		case _EXCPT_NOT_IMPLEMENTED:
			textEnum.append("EXCPT_NOT_IMPLEMENTED");
			break;
		case _EXCPT_INTERNAL_ERROR:
			textEnum.append("EXCPT_INTERNAL_ERROR");
			break;
		case _EXCPT_INVALID_INPUT:
			textEnum.append("EXCPT_INVALID_INPUT");
			break;
		case _EXCPT_OBJECT_IN_USE:
			textEnum.append("EXCPT_OBJECT_IN_USE");
			break;
		case _EXCPT_TP_INVALID_ENDPOINT:
			textEnum.append("EXCPT_TP_INVALID_ENDPOINT");
			break;
		case _EXCPT_ENTITY_NOT_FOUND:
			textEnum.append("EXCPT_ENTITY_NOT_FOUND");
			break;
		case _EXCPT_TIMESLOT_IN_USE:
			textEnum.append("EXCPT_TIMESLOT_IN_USE");
			break;
		case _EXCPT_PROTECTION_EFFORT_NOT_MET:
			textEnum.append("EXCPT_PROTECTION_EFFORT_NOT_MET");
			break;
		case _EXCPT_NOT_IN_VALID_STATE:
			textEnum.append("EXCPT_NOT_IN_VALID_STATE");
			break;
		case _EXCPT_UNABLE_TO_COMPLY:
			textEnum.append("EXCPT_UNABLE_TO_COMPLY");
			break;
		case _EXCPT_NE_COMM_LOSS:
			textEnum.append("EXCPT_NE_COMM_LOSS");
			break;
		case _EXCPT_CAPACITY_EXCEEDED:
			textEnum.append("EXCPT_CAPACITY_EXCEEDED");
			break;
		case _EXCPT_ACCESS_DENIED:
			textEnum.append("EXCPT_ACCESS_DENIED");
			break;
		case _EXCPT_TOO_MANY_OPEN_ITERATORS:
			textEnum.append("EXCPT_TOO_MANY_OPEN_ITERATORS");
			break;
		case _EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS:
			textEnum.append("EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS");
			break;
		case _EXCPT_USERLABEL_IN_USE:
			textEnum.append("EXCPT_USERLABEL_IN_USE");
			break;
		}
		return textEnum.toString();
	}
}
