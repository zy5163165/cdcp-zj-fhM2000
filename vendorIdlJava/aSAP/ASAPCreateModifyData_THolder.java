package aSAP;

/**
 *	Generated from IDL definition of struct "ASAPCreateModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAPCreateModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public aSAP.ASAPCreateModifyData_T value;

	public ASAPCreateModifyData_THolder ()
	{
	}
	public ASAPCreateModifyData_THolder (final aSAP.ASAPCreateModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return aSAP.ASAPCreateModifyData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = aSAP.ASAPCreateModifyData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		aSAP.ASAPCreateModifyData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
