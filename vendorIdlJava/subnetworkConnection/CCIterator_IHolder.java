package subnetworkConnection;

/**
 *	Generated from IDL definition of interface "CCIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class CCIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CCIterator_I value;
	public CCIterator_IHolder ()
	{
	}
	public CCIterator_IHolder (final CCIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CCIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CCIterator_IHelper.write (_out,value);
	}
}
