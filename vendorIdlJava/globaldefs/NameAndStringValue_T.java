package globaldefs;

/**
 *	Generated from IDL definition of struct "NameAndStringValue_T"
 *	@author JacORB IDL compiler 
 */

public final class NameAndStringValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NameAndStringValue_T(){}
	public java.lang.String name = "";
	public java.lang.String value = "";
	public NameAndStringValue_T(java.lang.String name, java.lang.String value)
	{
		this.name = name;
		this.value = value;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NameAndStringValue_T");
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
