package softwareAndDataManager;

/**
 *	Generated from IDL definition of struct "BackupId_T"
 *	@author JacORB IDL compiler 
 */

public final class BackupId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BackupId_T(){}
	public globaldefs.NameAndStringValue_T[] meName;
	public java.lang.String backupTime;
	public BackupId_T(globaldefs.NameAndStringValue_T[] meName, java.lang.String backupTime)
	{
		this.meName = meName;
		this.backupTime = backupTime;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BackupId_T");
		textStruct.append("(");
		textStruct.append("meName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <meName.length; mem0++){
			textStruct.append(meName[mem0]);
			if(mem0 < meName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("backupTime=");
		textStruct.append(backupTime);
		textStruct.append(")");
		return textStruct.toString();
	}
}
