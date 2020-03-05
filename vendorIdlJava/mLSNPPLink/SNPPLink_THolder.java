package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPPLink.SNPPLink_T value;

	public SNPPLink_THolder ()
	{
	}
	public SNPPLink_THolder (final mLSNPPLink.SNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPPLink.SNPPLink_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPPLink.SNPPLink_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPPLink.SNPPLink_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
