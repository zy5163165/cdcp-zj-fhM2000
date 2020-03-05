package terminationPoint;

/**
 *	Generated from IDL definition of interface "GTPiterator_I"
 *	@author JacORB IDL compiler 
 */

public final class GTPiterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public GTPiterator_I value;
	public GTPiterator_IHolder ()
	{
	}
	public GTPiterator_IHolder (final GTPiterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GTPiterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GTPiterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GTPiterator_IHelper.write (_out,value);
	}
}
