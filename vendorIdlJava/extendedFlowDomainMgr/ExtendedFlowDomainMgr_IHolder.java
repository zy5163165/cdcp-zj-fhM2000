package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of interface "ExtendedFlowDomainMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class ExtendedFlowDomainMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ExtendedFlowDomainMgr_I value;
	public ExtendedFlowDomainMgr_IHolder ()
	{
	}
	public ExtendedFlowDomainMgr_IHolder (final ExtendedFlowDomainMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExtendedFlowDomainMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExtendedFlowDomainMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ExtendedFlowDomainMgr_IHelper.write (_out,value);
	}
}
