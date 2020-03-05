package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "ObjectAndAttrList_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndAttrList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.ObjectAndAttr_T[] value;

	public ObjectAndAttrList_THolder ()
	{
	}
	public ObjectAndAttrList_THolder (final extendedEmsMgr.ObjectAndAttr_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ObjectAndAttrList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ObjectAndAttrList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ObjectAndAttrList_THelper.write (out,value);
	}
}
