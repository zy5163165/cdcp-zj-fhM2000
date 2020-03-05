package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "AlarmReportingMask_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmReportingMask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmReportingMask_T(){}
	public globaldefs.NameAndStringValue_T[] entityName;
	public java.lang.String owner = "";
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public AlarmReportingMask_T(globaldefs.NameAndStringValue_T[] entityName, java.lang.String owner, short layerRate, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.entityName = entityName;
		this.owner = owner;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlarmReportingMask_T");
		textStruct.append("(");
		textStruct.append("entityName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <entityName.length; mem0++){
			textStruct.append(entityName[mem0]);
			if(mem0 < entityName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
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
