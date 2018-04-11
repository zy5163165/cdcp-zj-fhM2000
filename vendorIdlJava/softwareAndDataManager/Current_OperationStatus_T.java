package softwareAndDataManager;
/**
 *	Generated from IDL definition of enum "Current_OperationStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class Current_OperationStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _COS_Idle = 0;
	public static final Current_OperationStatus_T COS_Idle = new Current_OperationStatus_T(_COS_Idle);
	public static final int _COS_Pending = 1;
	public static final Current_OperationStatus_T COS_Pending = new Current_OperationStatus_T(_COS_Pending);
	public static final int _COS_InProgress = 2;
	public static final Current_OperationStatus_T COS_InProgress = new Current_OperationStatus_T(_COS_InProgress);
	public static final int _COS_Completed = 3;
	public static final Current_OperationStatus_T COS_Completed = new Current_OperationStatus_T(_COS_Completed);
	public static final int _COS_Aborted = 4;
	public static final Current_OperationStatus_T COS_Aborted = new Current_OperationStatus_T(_COS_Aborted);
	public int value()
	{
		return value;
	}
	public static Current_OperationStatus_T from_int(int value)
	{
		switch (value) {
			case _COS_Idle: return COS_Idle;
			case _COS_Pending: return COS_Pending;
			case _COS_InProgress: return COS_InProgress;
			case _COS_Completed: return COS_Completed;
			case _COS_Aborted: return COS_Aborted;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Current_OperationStatus_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int( value() );
	}
	public String toString()
	{
		StringBuffer textEnum = new StringBuffer();
		textEnum.append("Current_OperationStatus_T");
		textEnum.append(".");
		switch(value())
		{
		case _COS_Idle:
			textEnum.append("COS_Idle");
			break;
		case _COS_Pending:
			textEnum.append("COS_Pending");
			break;
		case _COS_InProgress:
			textEnum.append("COS_InProgress");
			break;
		case _COS_Completed:
			textEnum.append("COS_Completed");
			break;
		case _COS_Aborted:
			textEnum.append("COS_Aborted");
			break;
		}
		return textEnum.toString();
	}
}
