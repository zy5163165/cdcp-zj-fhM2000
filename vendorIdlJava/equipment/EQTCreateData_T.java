package equipment;

/**
 *	Generated from IDL definition of struct "EQTCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EQTCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String expectedEquipmentObjectType;
	public globaldefs.NameAndStringValue_T[] equipmentHolderName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EQTCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String expectedEquipmentObjectType, globaldefs.NameAndStringValue_T[] equipmentHolderName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.expectedEquipmentObjectType = expectedEquipmentObjectType;
		this.equipmentHolderName = equipmentHolderName;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EQTCreateData_T");
		textStruct.append("(");
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("expectedEquipmentObjectType=");
		textStruct.append(expectedEquipmentObjectType);
		textStruct.append(","); 
		textStruct.append("equipmentHolderName=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <equipmentHolderName.length; mem4++){
			textStruct.append(equipmentHolderName[mem4]);
			if(mem4 < equipmentHolderName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalInfo.length; mem5++){
			textStruct.append(additionalInfo[mem5]);
			if(mem5 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
