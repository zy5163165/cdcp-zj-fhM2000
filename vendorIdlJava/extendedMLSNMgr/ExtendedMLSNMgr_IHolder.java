package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "ExtendedMLSNMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class ExtendedMLSNMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtendedMLSNMgr_I value;
	public ExtendedMLSNMgr_IHolder ()
	{
	}
	public ExtendedMLSNMgr_IHolder (final ExtendedMLSNMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtendedMLSNMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtendedMLSNMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtendedMLSNMgr_IHelper.write (_out,value);
	}
}
