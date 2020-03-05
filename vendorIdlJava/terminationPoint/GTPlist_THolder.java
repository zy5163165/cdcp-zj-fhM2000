package terminationPoint;

/**
 *	Generated from IDL definition of alias "GTPlist_T"
 *	@author JacORB IDL compiler 
 */

public final class GTPlist_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public terminationPoint.GTP_T[] value;

	public GTPlist_THolder ()
	{
	}
	public GTPlist_THolder (final terminationPoint.GTP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GTPlist_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GTPlist_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GTPlist_THelper.write (out,value);
	}
}
