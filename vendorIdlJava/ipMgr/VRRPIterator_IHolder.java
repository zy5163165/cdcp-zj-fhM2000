package ipMgr;

/**
 *	Generated from IDL definition of interface "VRRPIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class VRRPIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public VRRPIterator_I value;
	public VRRPIterator_IHolder ()
	{
	}
	public VRRPIterator_IHolder (final VRRPIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VRRPIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRRPIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		VRRPIterator_IHelper.write (_out,value);
	}
}
