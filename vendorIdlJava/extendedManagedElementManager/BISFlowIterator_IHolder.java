package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "BISFlowIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class BISFlowIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public BISFlowIterator_I value;
	public BISFlowIterator_IHolder ()
	{
	}
	public BISFlowIterator_IHolder (final BISFlowIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BISFlowIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BISFlowIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BISFlowIterator_IHelper.write (_out,value);
	}
}
