package extendedMLSNMgr;

/**
 *	Generated from IDL definition of struct "MLSNSubNetWork_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNSubNetWork_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedMLSNMgr.MLSNSubNetWork_T value;

	public MLSNSubNetWork_THolder ()
	{
	}
	public MLSNSubNetWork_THolder (final extendedMLSNMgr.MLSNSubNetWork_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedMLSNMgr.MLSNSubNetWork_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedMLSNMgr.MLSNSubNetWork_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedMLSNMgr.MLSNSubNetWork_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
