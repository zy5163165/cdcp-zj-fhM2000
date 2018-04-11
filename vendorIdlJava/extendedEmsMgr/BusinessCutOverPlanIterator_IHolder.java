package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "BusinessCutOverPlanIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverPlanIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public BusinessCutOverPlanIterator_I value;
	public BusinessCutOverPlanIterator_IHolder ()
	{
	}
	public BusinessCutOverPlanIterator_IHolder (final BusinessCutOverPlanIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BusinessCutOverPlanIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BusinessCutOverPlanIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		BusinessCutOverPlanIterator_IHelper.write (_out,value);
	}
}
