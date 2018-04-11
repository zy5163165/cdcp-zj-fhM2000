package transmissionDescriptor;

/**
 *	Generated from IDL definition of interface "TransmissionDescriptorIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptorIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransmissionDescriptorIterator_I value;
	public TransmissionDescriptorIterator_IHolder ()
	{
	}
	public TransmissionDescriptorIterator_IHolder (final TransmissionDescriptorIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionDescriptorIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionDescriptorIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransmissionDescriptorIterator_IHelper.write (_out,value);
	}
}
