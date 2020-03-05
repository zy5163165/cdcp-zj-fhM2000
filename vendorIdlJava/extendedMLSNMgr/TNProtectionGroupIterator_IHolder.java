package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "TNProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TNProtectionGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TNProtectionGroupIterator_I value;
	public TNProtectionGroupIterator_IHolder ()
	{
	}
	public TNProtectionGroupIterator_IHolder (final TNProtectionGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TNProtectionGroupIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TNProtectionGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TNProtectionGroupIterator_IHelper.write (_out,value);
	}
}
