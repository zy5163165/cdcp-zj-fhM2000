package org.omg.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "DuplicateConstraintID"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateConstraintID
	extends org.omg.CORBA.UserException
{
	public DuplicateConstraintID()
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id());
	}

	public int id;
	public DuplicateConstraintID(java.lang.String _reason,int id)
	{
		super(org.omg.CosNotifyFilter.DuplicateConstraintIDHelper.id()+""+_reason );
		this.id = id;
	}
	public DuplicateConstraintID(int id)
	{
		this.id = id;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("DuplicateConstraintID");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(")");
		return textStruct.toString();
	}
}
