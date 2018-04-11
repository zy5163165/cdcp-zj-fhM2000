package ipMgrCMCC;

/**
 *	Generated from IDL definition of interface "FRRIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class FRRIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FRRIterator_I value;
	public FRRIterator_IHolder ()
	{
	}
	public FRRIterator_IHolder (final FRRIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FRRIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FRRIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FRRIterator_IHelper.write (_out,value);
	}
}
