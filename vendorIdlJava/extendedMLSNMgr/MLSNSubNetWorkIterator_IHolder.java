package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "MLSNSubNetWorkIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class MLSNSubNetWorkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MLSNSubNetWorkIterator_I value;
	public MLSNSubNetWorkIterator_IHolder ()
	{
	}
	public MLSNSubNetWorkIterator_IHolder (final MLSNSubNetWorkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNSubNetWorkIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNSubNetWorkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MLSNSubNetWorkIterator_IHelper.write (_out,value);
	}
}
