package FH_FaultAnalyzer;
/**
 *	Generated from IDL definition of enum "FaultGroupType_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _NORMAL_TYPE = 0;
	public static final FaultGroupType_T NORMAL_TYPE = new FaultGroupType_T(_NORMAL_TYPE);
	public static final int _NO_OBJECT_FAULT = 1;
	public static final FaultGroupType_T NO_OBJECT_FAULT = new FaultGroupType_T(_NO_OBJECT_FAULT);
	public static final int _INVALIDE_CROSSCONNECTION = 2;
	public static final FaultGroupType_T INVALIDE_CROSSCONNECTION = new FaultGroupType_T(_INVALIDE_CROSSCONNECTION);
	public static final int _NO_CROSSCONNECTION = 3;
	public static final FaultGroupType_T NO_CROSSCONNECTION = new FaultGroupType_T(_NO_CROSSCONNECTION);
	public static final int _NOT_USED_CROSSCONNECTION = 4;
	public static final FaultGroupType_T NOT_USED_CROSSCONNECTION = new FaultGroupType_T(_NOT_USED_CROSSCONNECTION);
	public static final int _ENV_PROBABLECAUSE = 5;
	public static final FaultGroupType_T ENV_PROBABLECAUSE = new FaultGroupType_T(_ENV_PROBABLECAUSE);
	public int value()
	{
		return value;
	}
	public static FaultGroupType_T from_int(int value)
	{
		switch (value) {
			case _NORMAL_TYPE: return NORMAL_TYPE;
			case _NO_OBJECT_FAULT: return NO_OBJECT_FAULT;
			case _INVALIDE_CROSSCONNECTION: return INVALIDE_CROSSCONNECTION;
			case _NO_CROSSCONNECTION: return NO_CROSSCONNECTION;
			case _NOT_USED_CROSSCONNECTION: return NOT_USED_CROSSCONNECTION;
			case _ENV_PROBABLECAUSE: return ENV_PROBABLECAUSE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FaultGroupType_T(int i)
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
		textEnum.append("FaultGroupType_T");
		textEnum.append(".");
		switch(value())
		{
		case _NORMAL_TYPE:
			textEnum.append("NORMAL_TYPE");
			break;
		case _NO_OBJECT_FAULT:
			textEnum.append("NO_OBJECT_FAULT");
			break;
		case _INVALIDE_CROSSCONNECTION:
			textEnum.append("INVALIDE_CROSSCONNECTION");
			break;
		case _NO_CROSSCONNECTION:
			textEnum.append("NO_CROSSCONNECTION");
			break;
		case _NOT_USED_CROSSCONNECTION:
			textEnum.append("NOT_USED_CROSSCONNECTION");
			break;
		case _ENV_PROBABLECAUSE:
			textEnum.append("ENV_PROBABLECAUSE");
			break;
		}
		return textEnum.toString();
	}
}
