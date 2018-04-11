package mLSNPP;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPP.MultiLayerSNPP_T value;

	public MultiLayerSNPP_THolder ()
	{
	}
	public MultiLayerSNPP_THolder (final mLSNPP.MultiLayerSNPP_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPP.MultiLayerSNPP_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPP.MultiLayerSNPP_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPP.MultiLayerSNPP_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
