package terminationPoint;
/**
 *	Generated from IDL definition of enum "GTPEffort_T"
 *	@author JacORB IDL compiler 
 */

public final class GTPEffort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EFFORT_WHATEVER = 0;
	public static final GTPEffort_T EFFORT_WHATEVER = new GTPEffort_T(_EFFORT_WHATEVER);
	public static final int _EFFORT_SAME = 1;
	public static final GTPEffort_T EFFORT_SAME = new GTPEffort_T(_EFFORT_SAME);
	public int value()
	{
		return value;
	}
	public static GTPEffort_T from_int(int value)
	{
		switch (value) {
			case _EFFORT_WHATEVER: return EFFORT_WHATEVER;
			case _EFFORT_SAME: return EFFORT_SAME;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected GTPEffort_T(int i)
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
		textEnum.append("GTPEffort_T");
		textEnum.append(".");
		switch(value())
		{
		case _EFFORT_WHATEVER:
			textEnum.append("EFFORT_WHATEVER");
			break;
		case _EFFORT_SAME:
			textEnum.append("EFFORT_SAME");
			break;
		}
		return textEnum.toString();
	}
}
