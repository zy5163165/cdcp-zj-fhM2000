package org.omg.CosNaming.NamingContextPackage;
/**
 *	Generated from IDL definition of enum "NotFoundReason"
 *	@author JacORB IDL compiler 
 */

public final class NotFoundReason
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _missing_node = 0;
	public static final NotFoundReason missing_node = new NotFoundReason(_missing_node);
	public static final int _not_context = 1;
	public static final NotFoundReason not_context = new NotFoundReason(_not_context);
	public static final int _not_object = 2;
	public static final NotFoundReason not_object = new NotFoundReason(_not_object);
	public int value()
	{
		return value;
	}
	public static NotFoundReason from_int(int value)
	{
		switch (value) {
			case _missing_node: return missing_node;
			case _not_context: return not_context;
			case _not_object: return not_object;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NotFoundReason(int i)
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
		textEnum.append("NotFoundReason");
		textEnum.append(".");
		switch(value())
		{
		case _missing_node:
			textEnum.append("missing_node");
			break;
		case _not_context:
			textEnum.append("not_context");
			break;
		case _not_object:
			textEnum.append("not_object");
			break;
		}
		return textEnum.toString();
	}
}
