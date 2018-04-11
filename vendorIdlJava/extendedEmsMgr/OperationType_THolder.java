package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "OperationType_T"
 *	@author JacORB IDL compiler 
 */

public final class OperationType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public OperationType_T value;

	public OperationType_THolder ()
	{
	}
	public OperationType_THolder (final OperationType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return OperationType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = OperationType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		OperationType_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
