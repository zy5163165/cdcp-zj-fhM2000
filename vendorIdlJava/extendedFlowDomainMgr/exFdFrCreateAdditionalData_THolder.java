package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of struct "exFdFrCreateAdditionalData_T"
 *	@author JacORB IDL compiler 
 */

public final class exFdFrCreateAdditionalData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedFlowDomainMgr.exFdFrCreateAdditionalData_T value;

	public exFdFrCreateAdditionalData_THolder ()
	{
	}
	public exFdFrCreateAdditionalData_THolder (final extendedFlowDomainMgr.exFdFrCreateAdditionalData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedFlowDomainMgr.exFdFrCreateAdditionalData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
