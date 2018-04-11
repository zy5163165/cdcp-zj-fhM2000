package softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BackupStatus_T(){}
	public softwareAndDataManager.Current_OperationStatus_T opStatus;
	public java.lang.String failureReason = "";
	public BackupStatus_T(softwareAndDataManager.Current_OperationStatus_T opStatus, java.lang.String failureReason)
	{
		this.opStatus = opStatus;
		this.failureReason = failureReason;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BackupStatus_T");
		textStruct.append("(");
		textStruct.append("opStatus=");
		textStruct.append(opStatus);
		textStruct.append(","); 
		textStruct.append("failureReason=");
		textStruct.append(failureReason);
		textStruct.append(")");
		return textStruct.toString();
	}
}
