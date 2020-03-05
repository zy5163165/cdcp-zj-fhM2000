package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "FilterNotFound"
 *	@author JacORB IDL compiler 
 */

public final class FilterNotFound
	extends org.omg.CORBA.UserException
{
	public FilterNotFound()
	{
		super(org.omg.CosNotifyFilter.FilterNotFoundHelper.id());
	}

	public FilterNotFound(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FilterNotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
