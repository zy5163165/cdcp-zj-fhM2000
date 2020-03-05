package flowDomainFragment;

/**
 *	Generated from IDL definition of interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class MFDFrIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MFDFrIterator_I value;
	public MFDFrIterator_IHolder ()
	{
	}
	public MFDFrIterator_IHolder (final MFDFrIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MFDFrIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MFDFrIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MFDFrIterator_IHelper.write (_out,value);
	}
}
