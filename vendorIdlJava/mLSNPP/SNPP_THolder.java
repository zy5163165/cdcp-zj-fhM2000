package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPP.SNPP_T value;

	public SNPP_THolder ()
	{
	}
	public SNPP_THolder (final mLSNPP.SNPP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPP.SNPP_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPP.SNPP_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPP.SNPP_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
