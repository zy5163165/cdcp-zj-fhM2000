package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "ProcessPrivilege_T"
 *	@author JacORB IDL compiler 
 */

public final class ProcessPrivilege_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PPR_CRITICAL = 0;
	public static final ProcessPrivilege_T PPR_CRITICAL = new ProcessPrivilege_T(_PPR_CRITICAL);
	public static final int _PPR_MAJOR = 1;
	public static final ProcessPrivilege_T PPR_MAJOR = new ProcessPrivilege_T(_PPR_MAJOR);
	public static final int _PPR_MINOR = 2;
	public static final ProcessPrivilege_T PPR_MINOR = new ProcessPrivilege_T(_PPR_MINOR);
	public static final int _PPR_WARNING = 3;
	public static final ProcessPrivilege_T PPR_WARNING = new ProcessPrivilege_T(_PPR_WARNING);
	public static final int _PPR_CLEARED = 4;
	public static final ProcessPrivilege_T PPR_CLEARED = new ProcessPrivilege_T(_PPR_CLEARED);
	public int value()
	{
		return value;
	}
	public static ProcessPrivilege_T from_int(int value)
	{
		switch (value) {
			case _PPR_CRITICAL: return PPR_CRITICAL;
			case _PPR_MAJOR: return PPR_MAJOR;
			case _PPR_MINOR: return PPR_MINOR;
			case _PPR_WARNING: return PPR_WARNING;
			case _PPR_CLEARED: return PPR_CLEARED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProcessPrivilege_T(int i)
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
		textEnum.append("ProcessPrivilege_T");
		textEnum.append(".");
		switch(value())
		{
		case _PPR_CRITICAL:
			textEnum.append("PPR_CRITICAL");
			break;
		case _PPR_MAJOR:
			textEnum.append("PPR_MAJOR");
			break;
		case _PPR_MINOR:
			textEnum.append("PPR_MINOR");
			break;
		case _PPR_WARNING:
			textEnum.append("PPR_WARNING");
			break;
		case _PPR_CLEARED:
			textEnum.append("PPR_CLEARED");
			break;
		}
		return textEnum.toString();
	}
}
