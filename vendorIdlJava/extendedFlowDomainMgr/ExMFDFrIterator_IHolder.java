package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of interface "ExMFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class ExMFDFrIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExMFDFrIterator_I value;
	public ExMFDFrIterator_IHolder ()
	{
	}
	public ExMFDFrIterator_IHolder (final ExMFDFrIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExMFDFrIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExMFDFrIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExMFDFrIterator_IHelper.write (_out,value);
	}
}
