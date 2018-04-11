package mLSNPP;

/**
 *	Generated from IDL definition of interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class MLSNPPMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MLSNPPMgr_I value;
	public MLSNPPMgr_IHolder ()
	{
	}
	public MLSNPPMgr_IHolder (final MLSNPPMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNPPMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNPPMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MLSNPPMgr_IHelper.write (_out,value);
	}
}
