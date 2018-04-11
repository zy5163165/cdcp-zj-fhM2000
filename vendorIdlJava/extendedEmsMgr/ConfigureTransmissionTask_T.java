package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ConfigureTransmissionTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ConfigureTransmissionTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConfigureTransmissionTask_T(){}
	public globaldefs.NameAndStringValue_T[][] objectNameList;
	public notifications.ObjectType_T[] objectTypeList;
	public boolean beCompressed;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ConfigureTransmissionTask_T(globaldefs.NameAndStringValue_T[][] objectNameList, notifications.ObjectType_T[] objectTypeList, boolean beCompressed, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectNameList = objectNameList;
		this.objectTypeList = objectTypeList;
		this.beCompressed = beCompressed;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ConfigureTransmissionTask_T");
		textStruct.append("(");
		textStruct.append("objectNameList=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <objectNameList.length; mem0++){
			textStruct.append("[");
			for(int mem0_ =0; mem0_ <objectNameList[mem0].length; mem0_++){
				textStruct.append(objectNameList[mem0][mem0_]);
				if(mem0_ < objectNameList[mem0].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem0 < objectNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("objectTypeList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <objectTypeList.length; mem1++){
			textStruct.append(objectTypeList[mem1]);
			if(mem1 < objectTypeList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("beCompressed=");
		textStruct.append(beCompressed);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <additionalInfo.length; mem3++){
			textStruct.append(additionalInfo[mem3]);
			if(mem3 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
