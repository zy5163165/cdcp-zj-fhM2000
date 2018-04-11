package performance;

/**
 *	Generated from IDL definition of struct "PMParameter_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMParameter_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public PMParameter_T(java.lang.String pmParameterName, java.lang.String pmLocation)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMParameter_T");
		textStruct.append("(");
		textStruct.append("pmParameterName=");
		textStruct.append(pmParameterName);
		textStruct.append(","); 
		textStruct.append("pmLocation=");
		textStruct.append(pmLocation);
		textStruct.append(")");
		return textStruct.toString();
	}
}
