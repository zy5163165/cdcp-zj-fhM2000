package notifications;
/**
 *	Generated from IDL definition of enum "AcknowledgeIndication_T"
 *	@author JacORB IDL compiler 
 */

public final class AcknowledgeIndication_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public AcknowledgeIndication_T value;

	public AcknowledgeIndication_THolder ()
	{
	}
	public AcknowledgeIndication_THolder (final AcknowledgeIndication_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AcknowledgeIndication_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AcknowledgeIndication_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AcknowledgeIndication_THelper.write (out,value);
	}
	public String toString()
	{
		if(null != value)
			return value.toString();
		return "Holder contains no value";
	}
}
