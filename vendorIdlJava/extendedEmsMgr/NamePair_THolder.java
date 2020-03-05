package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "NamePair_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePair_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.NamePair_T value;

	public NamePair_THolder ()
	{
	}
	public NamePair_THolder (final extendedEmsMgr.NamePair_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return extendedEmsMgr.NamePair_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream _in)
	{
		value = extendedEmsMgr.NamePair_THelper.read (_in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		extendedEmsMgr.NamePair_THelper.write (_out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
