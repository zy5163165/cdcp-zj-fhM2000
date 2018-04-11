package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPPLink.MultiLayerSNPPLink_T value;

	public MultiLayerSNPPLink_THolder ()
	{
	}
	public MultiLayerSNPPLink_THolder (final mLSNPPLink.MultiLayerSNPPLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPPLink.MultiLayerSNPPLink_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPPLink.MultiLayerSNPPLink_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPPLink.MultiLayerSNPPLink_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
