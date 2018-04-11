package org.omg.CosTrading.LookupPackage;
/**
 *	Generated from IDL definition of enum "HowManyProps"
 *	@author JacORB IDL compiler 
 */

public final class HowManyProps
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _none = 0;
	public static final HowManyProps none = new HowManyProps(_none);
	public static final int _some = 1;
	public static final HowManyProps some = new HowManyProps(_some);
	public static final int _all = 2;
	public static final HowManyProps all = new HowManyProps(_all);
	public int value()
	{
		return value;
	}
	public static HowManyProps from_int(int value)
	{
		switch (value) {
			case _none: return none;
			case _some: return some;
			case _all: return all;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HowManyProps(int i)
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
		textEnum.append("HowManyProps");
		textEnum.append(".");
		switch(value())
		{
		case _none:
			textEnum.append("none");
			break;
		case _some:
			textEnum.append("some");
			break;
		case _all:
			textEnum.append("all");
			break;
		}
		return textEnum.toString();
	}
}
