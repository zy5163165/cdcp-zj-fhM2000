package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "BusinessCutOverGroupList_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverGroupList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.BusinessCutOverGroup_T[] value;

	public BusinessCutOverGroupList_THolder ()
	{
	}
	public BusinessCutOverGroupList_THolder (final extendedEmsMgr.BusinessCutOverGroup_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BusinessCutOverGroupList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BusinessCutOverGroupList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BusinessCutOverGroupList_THelper.write (out,value);
	}
}
