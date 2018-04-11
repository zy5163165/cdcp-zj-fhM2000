package CORBA;

/**
 *	Generated from IDL definition of interface "Principal"
 *	@author JacORB IDL compiler 
 */

public final class PrincipalHolder	implements org.omg.CORBA.portable.Streamable{
	 public Principal value;
	public PrincipalHolder ()
	{
	}
	public PrincipalHolder (final Principal initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PrincipalHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PrincipalHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PrincipalHelper.write (_out,value);
	}
}
