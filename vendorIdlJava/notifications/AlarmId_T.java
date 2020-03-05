package notifications;

/**
 *	Generated from IDL definition of struct "AlarmId_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmId_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public short layerRate;
	public java.lang.String probableCause = "";
	public java.lang.String probableCauseQualifier = "";
	public AlarmId_T(globaldefs.NameAndStringValue_T[] objectName, short layerRate, java.lang.String probableCause, java.lang.String probableCauseQualifier)
	{
		this.objectName = objectName;
		this.layerRate = layerRate;
		this.probableCause = probableCause;
		this.probableCauseQualifier = probableCauseQualifier;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlarmId_T");
		textStruct.append("(");
		textStruct.append("objectName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <objectName.length; mem0++){
			textStruct.append(objectName[mem0]);
			if(mem0 < objectName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("probableCause=");
		textStruct.append(probableCause);
		textStruct.append(","); 
		textStruct.append("probableCauseQualifier=");
		textStruct.append(probableCauseQualifier);
		textStruct.append(")");
		return textStruct.toString();
	}
}
