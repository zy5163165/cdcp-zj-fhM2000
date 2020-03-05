package org.omg.CosNaming.NamingContextPackage;

/**
 *	Generated from IDL definition of exception "CannotProceed"
 *	@author JacORB IDL compiler 
 */

public final class CannotProceed
	extends org.omg.CORBA.UserException
{
	public CannotProceed()
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id());
	}

	public org.omg.CosNaming.NamingContext cxt;
	public org.omg.CosNaming.NameComponent[] rest_of_name;
	public CannotProceed(java.lang.String _reason,org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		super(org.omg.CosNaming.NamingContextPackage.CannotProceedHelper.id()+""+_reason );
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
	public CannotProceed(org.omg.CosNaming.NamingContext cxt, org.omg.CosNaming.NameComponent[] rest_of_name)
	{
		this.cxt = cxt;
		this.rest_of_name = rest_of_name;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CannotProceed");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("cxt=");
		textStruct.append(cxt);
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
