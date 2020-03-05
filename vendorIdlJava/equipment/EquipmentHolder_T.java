package equipment;

/**
 *	Generated from IDL definition of struct "EquipmentHolder_T"
 *	@author JacORB IDL compiler 
 */

public final class EquipmentHolder_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EquipmentHolder_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public java.lang.String holderType;
	public globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment;
	public java.lang.String[] acceptableEquipmentTypeList;
	public equipment.HolderState_T holderState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EquipmentHolder_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, java.lang.String holderType, globaldefs.NameAndStringValue_T[] expectedOrInstalledEquipment, java.lang.String[] acceptableEquipmentTypeList, equipment.HolderState_T holderState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.holderType = holderType;
		this.expectedOrInstalledEquipment = expectedOrInstalledEquipment;
		this.acceptableEquipmentTypeList = acceptableEquipmentTypeList;
		this.holderState = holderState;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EquipmentHolder_T");
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
		textStruct.append("holderType=");
		textStruct.append(holderType);
		textStruct.append(","); 
		textStruct.append("expectedOrInstalledEquipment=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <expectedOrInstalledEquipment.length; mem6++){
			textStruct.append(expectedOrInstalledEquipment[mem6]);
			if(mem6 < expectedOrInstalledEquipment.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("acceptableEquipmentTypeList=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <acceptableEquipmentTypeList.length; mem7++){
			textStruct.append(acceptableEquipmentTypeList[mem7]);
			if(mem7 < acceptableEquipmentTypeList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("holderState=");
		textStruct.append(holderState);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <additionalInfo.length; mem9++){
			textStruct.append(additionalInfo[mem9]);
			if(mem9 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
