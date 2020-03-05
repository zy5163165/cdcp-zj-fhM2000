package globaldefs;
/**
 *	Generated from IDL definition of enum "ConnectionDirection_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionDirection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CD_UNI = 0;
	public static final ConnectionDirection_T CD_UNI = new ConnectionDirection_T(_CD_UNI);
	public static final int _CD_BI = 1;
	public static final ConnectionDirection_T CD_BI = new ConnectionDirection_T(_CD_BI);
	public int value()
	{
		return value;
	}
	public static ConnectionDirection_T from_int(int value)
	{
		switch (value) {
			case _CD_UNI: return CD_UNI;
			case _CD_BI: return CD_BI;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConnectionDirection_T(int i)
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
		textEnum.append("ConnectionDirection_T");
		textEnum.append(".");
		switch(value())
		{
		case _CD_UNI:
			textEnum.append("CD_UNI");
			break;
		case _CD_BI:
			textEnum.append("CD_BI");
			break;
		}
		return textEnum.toString();
	}
}
