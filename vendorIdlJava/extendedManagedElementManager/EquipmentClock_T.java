package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "EquipmentClock_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentClock_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentClock_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String clockStatus = "";
	public java.lang.String synchroSrcClass = "";
	public java.lang.String synchroSrc = "";
	public java.lang.String workMode = "";
	public java.lang.String[] clockSourceList;
	public java.lang.String synchroProtocol = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentClock_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String clockStatus, java.lang.String synchroSrcClass, java.lang.String synchroSrc, java.lang.String workMode, java.lang.String[] clockSourceList, java.lang.String synchroProtocol, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.clockStatus = clockStatus;
		this.synchroSrcClass = synchroSrcClass;
		this.synchroSrc = synchroSrc;
		this.workMode = workMode;
		this.clockSourceList = clockSourceList;
		this.synchroProtocol = synchroProtocol;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EquipmentClock_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("clockStatus=");
		textStruct.append(clockStatus);
		textStruct.append(","); 
		textStruct.append("synchroSrcClass=");
		textStruct.append(synchroSrcClass);
		textStruct.append(","); 
		textStruct.append("synchroSrc=");
		textStruct.append(synchroSrc);
		textStruct.append(","); 
		textStruct.append("workMode=");
		textStruct.append(workMode);
		textStruct.append(","); 
		textStruct.append("clockSourceList=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <clockSourceList.length; mem8++){
			textStruct.append(clockSourceList[mem8]);
			if(mem8 < clockSourceList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("synchroProtocol=");
		textStruct.append(synchroProtocol);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <additionalInfo.length; mem10++){
			textStruct.append(additionalInfo[mem10]);
			if(mem10 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
