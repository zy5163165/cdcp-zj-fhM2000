package mLSNPP;

/**
 *	Generated from IDL definition of struct "LayeredSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPP.LayeredSNPP_T value;

	public LayeredSNPP_THolder ()
	{
	}
	public LayeredSNPP_THolder (final mLSNPP.LayeredSNPP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPP.LayeredSNPP_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPP.LayeredSNPP_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPP.LayeredSNPP_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
