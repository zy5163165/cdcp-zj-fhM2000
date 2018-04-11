package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "ObjectTypeList_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectTypeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.ObjectType_T[] value;

	public ObjectTypeList_THolder ()
	{
	}
	public ObjectTypeList_THolder (final notifications.ObjectType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectTypeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectTypeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectTypeList_THelper.write (out,value);
	}
}
