package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverGroup_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.BusinessCutOverGroup_T value;

	public BusinessCutOverGroup_THolder ()
	{
	}
	public BusinessCutOverGroup_THolder (final extendedEmsMgr.BusinessCutOverGroup_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.BusinessCutOverGroup_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.BusinessCutOverGroup_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.BusinessCutOverGroup_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
