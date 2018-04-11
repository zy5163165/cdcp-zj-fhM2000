package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPP.SNPTNAData_T value;

	public SNPTNAData_THolder ()
	{
	}
	public SNPTNAData_THolder (final mLSNPP.SNPTNAData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPP.SNPTNAData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPP.SNPTNAData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPP.SNPTNAData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
