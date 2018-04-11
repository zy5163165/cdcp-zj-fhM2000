package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "ClassType_T"
 *	@author JacORB IDL compiler 
 */

public final class ClassType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ClassType_T value;

	public ClassType_THolder ()
	{
	}
	public ClassType_THolder (final ClassType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClassType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClassType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClassType_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
