package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "EXMegEntityDataIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class EXMegEntityDataIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EXMegEntityDataIterator_I value;
	public EXMegEntityDataIterator_IHolder ()
	{
	}
	public EXMegEntityDataIterator_IHolder (final EXMegEntityDataIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EXMegEntityDataIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EXMegEntityDataIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EXMegEntityDataIterator_IHelper.write (_out,value);
	}
}
