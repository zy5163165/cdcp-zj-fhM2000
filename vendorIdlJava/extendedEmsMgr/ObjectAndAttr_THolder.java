package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ObjectAndAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndAttr_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.ObjectAndAttr_T value;

	public ObjectAndAttr_THolder ()
	{
	}
	public ObjectAndAttr_THolder (final extendedEmsMgr.ObjectAndAttr_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.ObjectAndAttr_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.ObjectAndAttr_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.ObjectAndAttr_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
