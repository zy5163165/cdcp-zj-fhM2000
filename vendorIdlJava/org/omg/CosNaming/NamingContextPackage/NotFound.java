package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "NotFound"
 *	@author JacORB IDL compiler 
 */

public final class NotFound
	extends org.omg.CORBA.UserException
{
	public NotFound()
	{
		super(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id());
	}

	public org.omg.CosNaming.NamingContextPackage.NotFoundReason why;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public NotFound(java.lang.String _reason,org.omg.CosNaming.NamingContextPackage.NotFoundReason why, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.NotFoundHelper.id()+""+_reason );
		this.why = why;
		this.rest_of_name = rest_of_name;
	}
	public NotFound(org.omg.CosNaming.NamingContextPackage.NotFoundReason why, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		this.why = why;
		this.rest_of_name = rest_of_name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NotFound");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("why=");
		textStruct.append(why);
		textStruct.append(","); 
		textStruct.append("rest_of_name=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <rest_of_name.length; mem1++){
			textStruct.append(rest_of_name[mem1]);
			if(mem1 < rest_of_name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
