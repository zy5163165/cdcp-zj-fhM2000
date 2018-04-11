package extendedMLSNMgr;

/**
 *	Generated from IDL definition of alias "MLSNSubNetWorkList_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNSubNetWorkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedMLSNMgr.MLSNSubNetWork_T[] value;

	public MLSNSubNetWorkList_THolder ()
	{
	}
	public MLSNSubNetWorkList_THolder (final extendedMLSNMgr.MLSNSubNetWork_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MLSNSubNetWorkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MLSNSubNetWorkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MLSNSubNetWorkList_THelper.write (out,value);
	}
}
