package common;

/**
 *	Generated from IDL definition of alias "Capability_T"
 *	@author JacORB IDL compiler 
 */

public final class Capability_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T value;

	public Capability_THolder ()
	{
	}
	public Capability_THolder (final globaldefs.NameAndStringValue_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Capability_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Capability_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Capability_THelper.write (out,value);
	}
}
