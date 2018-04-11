package org.omg.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ClientType"
 *	@author JacORB IDL compiler 
 */

public final class ClientType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ANY_EVENT = 0;
	public static final ClientType ANY_EVENT = new ClientType(_ANY_EVENT);
	public static final int _STRUCTURED_EVENT = 1;
	public static final ClientType STRUCTURED_EVENT = new ClientType(_STRUCTURED_EVENT);
	public static final int _SEQUENCE_EVENT = 2;
	public static final ClientType SEQUENCE_EVENT = new ClientType(_SEQUENCE_EVENT);
	public int value()
	{
		return value;
	}
	public static ClientType from_int(int value)
	{
		switch (value) {
			case _ANY_EVENT: return ANY_EVENT;
			case _STRUCTURED_EVENT: return STRUCTURED_EVENT;
			case _SEQUENCE_EVENT: return SEQUENCE_EVENT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ClientType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int( value() );
	}
	public String toString()
	{
		StringBuffer textEnum = new StringBuffer();
		textEnum.append("ClientType");
		textEnum.append(".");
		switch(value())
		{
		case _ANY_EVENT:
			textEnum.append("ANY_EVENT");
			break;
		case _STRUCTURED_EVENT:
			textEnum.append("STRUCTURED_EVENT");
			break;
		case _SEQUENCE_EVENT:
			textEnum.append("SEQUENCE_EVENT");
			break;
		}
		return textEnum.toString();
	}
}
