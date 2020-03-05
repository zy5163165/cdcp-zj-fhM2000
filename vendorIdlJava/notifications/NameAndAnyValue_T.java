package notifications;

/**
 *	Generated from IDL definition of struct "NameAndAnyValue_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndAnyValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameAndAnyValue_T(){}
	public java.lang.String name = "";
	public org.omg.CORBA.Any value;
	public NameAndAnyValue_T(java.lang.String name, org.omg.CORBA.Any value)
	{
		this.name = name;
		this.value = value;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NameAndAnyValue_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append(name);
		textStruct.append(","); 
		textStruct.append("value=");
		textStruct.append(value);
		textStruct.append(")");
		return textStruct.toString();
	}
}
