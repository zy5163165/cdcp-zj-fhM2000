package ipMgrCMCC;

/**
 *	Generated from IDL definition of alias "BridgeList_T"
 *	@author JacORB IDL compiler 
 */

public final class BridgeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ipMgrCMCC.Bridge_T[] value;

	public BridgeList_THolder ()
	{
	}
	public BridgeList_THolder (final ipMgrCMCC.Bridge_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BridgeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BridgeList_THelper.write (out,value);
	}
}
