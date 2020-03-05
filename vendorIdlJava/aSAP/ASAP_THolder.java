package aSAP;

/**
 *	Generated from IDL definition of struct "ASAP_T"
 *	@author JacORB IDL compiler 
 */

public final class ASAP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public aSAP.ASAP_T value;

	public ASAP_THolder ()
	{
	}
	public ASAP_THolder (final aSAP.ASAP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return aSAP.ASAP_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = aSAP.ASAP_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		aSAP.ASAP_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
