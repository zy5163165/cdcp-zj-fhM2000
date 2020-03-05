package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "EXMegEntityDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class EXMegEntityDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.EXMegEntityData_T[] value;

	public EXMegEntityDataList_THolder ()
	{
	}
	public EXMegEntityDataList_THolder (final extendedEmsMgr.EXMegEntityData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EXMegEntityDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EXMegEntityDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EXMegEntityDataList_THelper.write (out,value);
	}
}
