package common;

/**
 *	Generated from IDL definition of interface "Common_I"
 *	@author JacORB IDL compiler 
 */

public final class Common_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public Common_I value;
	public Common_IHolder ()
	{
	}
	public Common_IHolder (final Common_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Common_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Common_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		Common_IHelper.write (_out,value);
	}
}
