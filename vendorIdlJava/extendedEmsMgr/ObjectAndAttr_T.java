package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ObjectAndAttr_T"
 *	@author JacORB IDL compiler 
 */

public final class ObjectAndAttr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ObjectAndAttr_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ObjectAndAttr_T(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ObjectAndAttr_T");
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
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <additionalInfo.length; mem1++){
			textStruct.append(additionalInfo[mem1]);
			if(mem1 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
