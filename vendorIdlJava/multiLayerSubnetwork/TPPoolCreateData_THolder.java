package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TPPoolCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPPoolCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.TPPoolCreateData_T value;

	public TPPoolCreateData_THolder ()
	{
	}
	public TPPoolCreateData_THolder (final multiLayerSubnetwork.TPPoolCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return multiLayerSubnetwork.TPPoolCreateData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = multiLayerSubnetwork.TPPoolCreateData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		multiLayerSubnetwork.TPPoolCreateData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
