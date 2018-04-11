package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCapacity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPPLink.LayeredCapacity_T value;

	public LayeredCapacity_THolder ()
	{
	}
	public LayeredCapacity_THolder (final mLSNPPLink.LayeredCapacity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mLSNPPLink.LayeredCapacity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = mLSNPPLink.LayeredCapacity_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		mLSNPPLink.LayeredCapacity_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
