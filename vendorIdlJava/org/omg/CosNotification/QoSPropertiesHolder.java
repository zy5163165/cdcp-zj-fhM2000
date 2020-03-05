package org.omg.CosNotification;

/**
 *	Generated from IDL definition of alias "QoSProperties"
 *	@author JacORB IDL compiler 
 */

public final class QoSPropertiesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CosNotification.Property[] value;

	public QoSPropertiesHolder ()
	{
	}
	public QoSPropertiesHolder (final org.omg.CosNotification.Property[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QoSPropertiesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSPropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QoSPropertiesHelper.write (out,value);
	}
}
