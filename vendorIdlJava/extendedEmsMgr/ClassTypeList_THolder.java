package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "ClassTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class ClassTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.ClassType_T[] value;

	public ClassTypeList_THolder ()
	{
	}
	public ClassTypeList_THolder (final extendedEmsMgr.ClassType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ClassTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ClassTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ClassTypeList_THelper.write (out,value);
	}
}
