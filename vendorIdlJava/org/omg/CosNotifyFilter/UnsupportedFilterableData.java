package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "UnsupportedFilterableData"
 *	@author JacORB IDL compiler 
 */

public final class UnsupportedFilterableData
	extends org.omg.CORBA.UserException
{
	public UnsupportedFilterableData()
	{
		super(org.omg.CosNotifyFilter.UnsupportedFilterableDataHelper.id());
	}

	public UnsupportedFilterableData(String value)
	{
		super(value);
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("UnsupportedFilterableData");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(")");
		return textStruct.toString();
	}
}
