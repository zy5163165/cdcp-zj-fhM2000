package CORBA;

/**
 *	Generated from IDL definition of interface "TypeCode"
 *	@author JacORB IDL compiler 
 */

public final class TypeCodeHolder	implements org.omg.CORBA.portable.Streamable{
	 public TypeCode value;
	public TypeCodeHolder ()
	{
	}
	public TypeCodeHolder (final TypeCode initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TypeCodeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TypeCodeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TypeCodeHelper.write (_out,value);
	}
}
