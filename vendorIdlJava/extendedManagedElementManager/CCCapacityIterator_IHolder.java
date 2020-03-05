package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "CCCapacityIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacityIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CCCapacityIterator_I value;
	public CCCapacityIterator_IHolder ()
	{
	}
	public CCCapacityIterator_IHolder (final CCCapacityIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CCCapacityIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCCapacityIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CCCapacityIterator_IHelper.write (_out,value);
	}
}
