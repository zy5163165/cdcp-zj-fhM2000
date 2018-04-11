package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "EXMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class EXMegEntityData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.EXMegEntityData_T value;

	public EXMegEntityData_THolder ()
	{
	}
	public EXMegEntityData_THolder (final extendedEmsMgr.EXMegEntityData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.EXMegEntityData_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.EXMegEntityData_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.EXMegEntityData_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
