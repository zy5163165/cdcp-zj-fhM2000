package globaldefs;

/**
 *	Generated from IDL definition of exception "ProcessingFailureException"
 *	@author JacORB IDL compiler 
 */

public final class ProcessingFailureException
	extends org.omg.CORBA.UserException
{
	public ProcessingFailureException()
	{
		super(globaldefs.ProcessingFailureExceptionHelper.id());
	}

	public globaldefs.ExceptionType_T exceptionType;
	public java.lang.String errorReason = "";
	public ProcessingFailureException(java.lang.String _reason,globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(globaldefs.ProcessingFailureExceptionHelper.id()+""+_reason );
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
	public ProcessingFailureException(globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProcessingFailureException");
		textStruct.append("(");
		textStruct.append(super.toString());
		textStruct.append(",");
		textStruct.append("exceptionType=");
		textStruct.append(exceptionType);
		textStruct.append(","); 
		textStruct.append("errorReason=");
		textStruct.append(errorReason);
		textStruct.append(")");
		return textStruct.toString();
	}
}
