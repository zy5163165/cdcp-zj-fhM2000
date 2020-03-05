package subnetworkConnection;

/**
 *	Generated from IDL definition of alias "Resource_T"
 *	@author JacORB IDL compiler 
 */

public final class Resource_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[] value;

	public Resource_THolder ()
	{
	}
	public Resource_THolder (final globaldefs.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Resource_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Resource_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Resource_THelper.write (out,value);
	}
}
