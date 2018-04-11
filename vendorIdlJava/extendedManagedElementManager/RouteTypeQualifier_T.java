package extendedManagedElementManager;
/**
 *	Generated from IDL definition of enum "RouteTypeQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CC = 0;
	public static final RouteTypeQualifier_T CC = new RouteTypeQualifier_T(_CC);
	public static final int _TPL = 1;
	public static final RouteTypeQualifier_T TPL = new RouteTypeQualifier_T(_TPL);
	public int value()
	{
		return value;
	}
	public static RouteTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _CC: return CC;
			case _TPL: return TPL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected RouteTypeQualifier_T(int i)
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
		textEnum.append("RouteTypeQualifier_T");
		textEnum.append(".");
		switch(value())
		{
		case _CC:
			textEnum.append("CC");
			break;
		case _TPL:
			textEnum.append("TPL");
			break;
		}
		return textEnum.toString();
	}
}
