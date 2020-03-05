package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "OperationType_T"
 *	@author JacORB IDL compiler 
 */

public final class OperationType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _OPERATE_SETUSERLABEL = 0;
	public static final OperationType_T OPERATE_SETUSERLABEL = new OperationType_T(_OPERATE_SETUSERLABEL);
	public static final int _OPERATE_SETOWNER = 1;
	public static final OperationType_T OPERATE_SETOWNER = new OperationType_T(_OPERATE_SETOWNER);
	public static final int _OPERATE_SETNATIVEEMSNAME = 2;
	public static final OperationType_T OPERATE_SETNATIVEEMSNAME = new OperationType_T(_OPERATE_SETNATIVEEMSNAME);
	public static final int _NULL = 3;
	public static final OperationType_T NULL = new OperationType_T(_NULL);
	public int value()
	{
		return value;
	}
	public static OperationType_T from_int(int value)
	{
		switch (value) {
			case _OPERATE_SETUSERLABEL: return OPERATE_SETUSERLABEL;
			case _OPERATE_SETOWNER: return OPERATE_SETOWNER;
			case _OPERATE_SETNATIVEEMSNAME: return OPERATE_SETNATIVEEMSNAME;
			case _NULL: return NULL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected OperationType_T(int i)
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
		textEnum.append("OperationType_T");
		textEnum.append(".");
		switch(value())
		{
		case _OPERATE_SETUSERLABEL:
			textEnum.append("OPERATE_SETUSERLABEL");
			break;
		case _OPERATE_SETOWNER:
			textEnum.append("OPERATE_SETOWNER");
			break;
		case _OPERATE_SETNATIVEEMSNAME:
			textEnum.append("OPERATE_SETNATIVEEMSNAME");
			break;
		case _NULL:
			textEnum.append("NULL");
			break;
		}
		return textEnum.toString();
	}
}
