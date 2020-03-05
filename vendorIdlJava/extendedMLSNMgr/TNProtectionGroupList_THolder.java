package extendedMLSNMgr;

/**
 *	Generated from IDL definition of alias "TNProtectionGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class TNProtectionGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedMLSNMgr.TNetworkProtectionGroup_T[] value;

	public TNProtectionGroupList_THolder ()
	{
	}
	public TNProtectionGroupList_THolder (final extendedMLSNMgr.TNetworkProtectionGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TNProtectionGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TNProtectionGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TNProtectionGroupList_THelper.write (out,value);
	}
}
