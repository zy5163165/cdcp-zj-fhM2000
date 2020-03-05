package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "NamePairList_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.NamePair_T[] value;

	public NamePairList_THolder ()
	{
	}
	public NamePairList_THolder (final extendedEmsMgr.NamePair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamePairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamePairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamePairList_THelper.write (out,value);
	}
}
