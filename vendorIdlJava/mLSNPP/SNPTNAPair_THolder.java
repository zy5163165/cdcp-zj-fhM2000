package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPP.SNPTNAPair_T value;

	public SNPTNAPair_THolder ()
	{
	}
	public SNPTNAPair_THolder (final mLSNPP.SNPTNAPair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPP.SNPTNAPair_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPP.SNPTNAPair_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPP.SNPTNAPair_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
