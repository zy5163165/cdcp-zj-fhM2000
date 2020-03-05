package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "TimeSpan_T"
 *	@author JacORB IDL compiler 
 */

public final class TimeSpan_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TimeSpan_T(){}
	public java.lang.String TimeSpanBegin;
	public java.lang.String TimeSpanEnd;
	public TimeSpan_T(java.lang.String TimeSpanBegin, java.lang.String TimeSpanEnd)
	{
		this.TimeSpanBegin = TimeSpanBegin;
		this.TimeSpanEnd = TimeSpanEnd;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TimeSpan_T");
		textStruct.append("(");
		textStruct.append("TimeSpanBegin=");
		textStruct.append(TimeSpanBegin);
		textStruct.append(","); 
		textStruct.append("TimeSpanEnd=");
		textStruct.append(TimeSpanEnd);
		textStruct.append(")");
		return textStruct.toString();
	}
}
