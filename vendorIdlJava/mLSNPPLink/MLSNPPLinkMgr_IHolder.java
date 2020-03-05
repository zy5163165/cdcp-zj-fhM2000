package mLSNPPLink;

/**
 *	Generated from IDL definition of interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class MLSNPPLinkMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MLSNPPLinkMgr_I value;
	public MLSNPPLinkMgr_IHolder ()
	{
	}
	public MLSNPPLinkMgr_IHolder (final MLSNPPLinkMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNPPLinkMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPLinkMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MLSNPPLinkMgr_IHelper.write (_out,value);
	}
}
