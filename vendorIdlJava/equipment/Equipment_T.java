package equipment;

/**
 *	Generated from IDL definition of struct "Equipment_T"
 *	@author JacORB IDL compiler 
 */

public final class Equipment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Equipment_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public equipment.ServiceState_T serviceState;
	public java.lang.String expectedEquipmentObjectType;
	public java.lang.String installedEquipmentObjectType;
	public java.lang.String installedPartNumber = "";
	public java.lang.String installedVersion = "";
	public java.lang.String installedSerialNumber = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public Equipment_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, equipment.ServiceState_T serviceState, java.lang.String expectedEquipmentObjectType, java.lang.String installedEquipmentObjectType, java.lang.String installedPartNumber, java.lang.String installedVersion, java.lang.String installedSerialNumber, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.serviceState = serviceState;
		this.expectedEquipmentObjectType = expectedEquipmentObjectType;
		this.installedEquipmentObjectType = installedEquipmentObjectType;
		this.installedPartNumber = installedPartNumber;
		this.installedVersion = installedVersion;
		this.installedSerialNumber = installedSerialNumber;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Equipment_T");
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
		textStruct.append("alarmReportingIndicator=");
		textStruct.append(alarmReportingIndicator);
		textStruct.append(","); 
		textStruct.append("serviceState=");
		textStruct.append(serviceState);
		textStruct.append(","); 
		textStruct.append("expectedEquipmentObjectType=");
		textStruct.append(expectedEquipmentObjectType);
		textStruct.append(","); 
		textStruct.append("installedEquipmentObjectType=");
		textStruct.append(installedEquipmentObjectType);
		textStruct.append(","); 
		textStruct.append("installedPartNumber=");
		textStruct.append(installedPartNumber);
		textStruct.append(","); 
		textStruct.append("installedVersion=");
		textStruct.append(installedVersion);
		textStruct.append(","); 
		textStruct.append("installedSerialNumber=");
		textStruct.append(installedSerialNumber);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <additionalInfo.length; mem11++){
			textStruct.append(additionalInfo[mem11]);
			if(mem11 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
