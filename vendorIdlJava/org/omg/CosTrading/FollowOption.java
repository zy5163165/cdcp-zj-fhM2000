package org.omg.CosTrading;
/**
 *	Generated from IDL definition of enum "FollowOption"
 *	@author JacORB IDL compiler 
 */

public final class FollowOption
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _local_only = 0;
	public static final FollowOption local_only = new FollowOption(_local_only);
	public static final int _if_no_local = 1;
	public static final FollowOption if_no_local = new FollowOption(_if_no_local);
	public static final int _always = 2;
	public static final FollowOption always = new FollowOption(_always);
	public int value()
	{
		return value;
	}
	public static FollowOption from_int(int value)
	{
		switch (value) {
			case _local_only: return local_only;
			case _if_no_local: return if_no_local;
			case _always: return always;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FollowOption(int i)
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
		textEnum.append("FollowOption");
		textEnum.append(".");
		switch(value())
		{
		case _local_only:
			textEnum.append("local_only");
			break;
		case _if_no_local:
			textEnum.append("if_no_local");
			break;
		case _always:
			textEnum.append("always");
			break;
		}
		return textEnum.toString();
	}
}
