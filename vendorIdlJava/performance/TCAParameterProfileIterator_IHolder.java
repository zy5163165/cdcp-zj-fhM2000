package performance;

/**
 *	Generated from IDL definition of interface "TCAParameterProfileIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfileIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TCAParameterProfileIterator_I value;
	public TCAParameterProfileIterator_IHolder ()
	{
	}
	public TCAParameterProfileIterator_IHolder (final TCAParameterProfileIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TCAParameterProfileIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TCAParameterProfileIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TCAParameterProfileIterator_IHelper.write (_out,value);
	}
}
