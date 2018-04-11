package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "AlarmFilterTaskIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class AlarmFilterTaskIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public AlarmFilterTaskIterator_I value;
	public AlarmFilterTaskIterator_IHolder ()
	{
	}
	public AlarmFilterTaskIterator_IHolder (final AlarmFilterTaskIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AlarmFilterTaskIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmFilterTaskIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AlarmFilterTaskIterator_IHelper.write (_out,value);
	}
}
