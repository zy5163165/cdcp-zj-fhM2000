package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of interface "FaultGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FaultGroupIterator_I value;
	public FaultGroupIterator_IHolder ()
	{
	}
	public FaultGroupIterator_IHolder (final FaultGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FaultGroupIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FaultGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FaultGroupIterator_IHelper.write (_out,value);
	}
}
