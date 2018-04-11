package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "CCorTPLList_T"
 *	@author JacORB IDL compiler 
 */

public final class CCorTPLList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.CCorTPL_T[] value;

	public CCorTPLList_THolder ()
	{
	}
	public CCorTPLList_THolder (final extendedManagedElementManager.CCorTPL_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CCorTPLList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCorTPLList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CCorTPLList_THelper.write (out,value);
	}
}
