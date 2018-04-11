package globaldefs;

/**
 *	Generated from IDL definition of alias "NamingAttributes_T"
 *	@author JacORB IDL compiler 
 */

public final class NamingAttributes_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[] value;

	public NamingAttributes_THolder ()
	{
	}
	public NamingAttributes_THolder (final globaldefs.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributes_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributes_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributes_THelper.write (out,value);
	}
}
