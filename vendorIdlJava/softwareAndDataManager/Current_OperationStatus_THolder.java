package softwareAndDataManager;
/**
 *	Generated from IDL definition of enum "Current_OperationStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class Current_OperationStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public Current_OperationStatus_T value;

	public Current_OperationStatus_THolder ()
	{
	}
	public Current_OperationStatus_THolder (final Current_OperationStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Current_OperationStatus_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Current_OperationStatus_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		Current_OperationStatus_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
