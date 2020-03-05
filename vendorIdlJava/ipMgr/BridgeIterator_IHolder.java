package ipMgr;

/**
 *	Generated from IDL definition of interface "BridgeIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class BridgeIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public BridgeIterator_I value;
	public BridgeIterator_IHolder ()
	{
	}
	public BridgeIterator_IHolder (final BridgeIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BridgeIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BridgeIterator_IHelper.write (_out,value);
	}
}
