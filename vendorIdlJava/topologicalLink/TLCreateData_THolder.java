package topologicalLink;

/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public topologicalLink.TLCreateData_T value;

	public TLCreateData_THolder ()
	{
	}
	public TLCreateData_THolder (final topologicalLink.TLCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return topologicalLink.TLCreateData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = topologicalLink.TLCreateData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		topologicalLink.TLCreateData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
