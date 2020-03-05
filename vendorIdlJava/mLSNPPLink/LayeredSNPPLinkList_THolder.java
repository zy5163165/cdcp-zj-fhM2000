package mLSNPPLink;

/**
 *	Generated from IDL definition of alias "LayeredSNPPLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLinkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mLSNPPLink.LayeredSNPPLink_T[] value;

	public LayeredSNPPLinkList_THolder ()
	{
	}
	public LayeredSNPPLinkList_THolder (final mLSNPPLink.LayeredSNPPLink_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayeredSNPPLinkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayeredSNPPLinkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayeredSNPPLinkList_THelper.write (out,value);
	}
}
