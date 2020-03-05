package flowDomain;
/**
 *	Generated from IDL definition of enum "CPTP_Role_T"
 *	@author JacORB IDL compiler 
 */

public final class CPTP_Role_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CPTPR_FD_EDGE = 0;
	public static final CPTP_Role_T CPTPR_FD_EDGE = new CPTP_Role_T(_CPTPR_FD_EDGE);
	public static final int _CPTPR_FD_INTERNAL = 1;
	public static final CPTP_Role_T CPTPR_FD_INTERNAL = new CPTP_Role_T(_CPTPR_FD_INTERNAL);
	public static final int _CPTPR_ALL = 2;
	public static final CPTP_Role_T CPTPR_ALL = new CPTP_Role_T(_CPTPR_ALL);
	public int value()
	{
		return value;
	}
	public static CPTP_Role_T from_int(int value)
	{
		switch (value) {
			case _CPTPR_FD_EDGE: return CPTPR_FD_EDGE;
			case _CPTPR_FD_INTERNAL: return CPTPR_FD_INTERNAL;
			case _CPTPR_ALL: return CPTPR_ALL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected CPTP_Role_T(int i)
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
		textEnum.append("CPTP_Role_T");
		textEnum.append(".");
		switch(value())
		{
		case _CPTPR_FD_EDGE:
			textEnum.append("CPTPR_FD_EDGE");
			break;
		case _CPTPR_FD_INTERNAL:
			textEnum.append("CPTPR_FD_INTERNAL");
			break;
		case _CPTPR_ALL:
			textEnum.append("CPTPR_ALL");
			break;
		}
		return textEnum.toString();
	}
}
