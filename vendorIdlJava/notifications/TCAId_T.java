package notifications;

/**
 *	Generated from IDL definition of struct "TCAId_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAId_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public short layerRate;
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public java.lang.String granularity;
	public TCAId_T(globaldefs.NameAndStringValue_T[] objectName, short layerRate, java.lang.String pmParameterName, java.lang.String pmLocation, java.lang.String granularity)
	{
		this.objectName = objectName;
		this.layerRate = layerRate;
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.granularity = granularity;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TCAId_T");
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
		textStruct.append("pmParameterName=");
		textStruct.append(pmParameterName);
		textStruct.append(","); 
		textStruct.append("pmLocation=");
		textStruct.append(pmLocation);
		textStruct.append(","); 
		textStruct.append("granularity=");
		textStruct.append(granularity);
		textStruct.append(")");
		return textStruct.toString();
	}
}
