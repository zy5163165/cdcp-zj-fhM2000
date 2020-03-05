package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "CCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class CCCapacity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CCCapacity_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public java.lang.String capacityType = "";
	public java.lang.String maxCapacity = "";
	public extendedManagedElementManager.LayeredCCCapacity_T[] maxCCCapacity;
	public extendedManagedElementManager.LayeredCCCapacity_T[] currentCCCapacity;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public CCCapacity_T(globaldefs.NameAndStringValue_T[] objectName, java.lang.String capacityType, java.lang.String maxCapacity, extendedManagedElementManager.LayeredCCCapacity_T[] maxCCCapacity, extendedManagedElementManager.LayeredCCCapacity_T[] currentCCCapacity, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.objectName = objectName;
		this.capacityType = capacityType;
		this.maxCapacity = maxCapacity;
		this.maxCCCapacity = maxCCCapacity;
		this.currentCCCapacity = currentCCCapacity;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CCCapacity_T");
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
		textStruct.append("capacityType=");
		textStruct.append(capacityType);
		textStruct.append(","); 
		textStruct.append("maxCapacity=");
		textStruct.append(maxCapacity);
		textStruct.append(","); 
		textStruct.append("maxCCCapacity=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <maxCCCapacity.length; mem3++){
			textStruct.append(maxCCCapacity[mem3]);
			if(mem3 < maxCCCapacity.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("currentCCCapacity=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <currentCCCapacity.length; mem4++){
			textStruct.append(currentCCCapacity[mem4]);
			if(mem4 < currentCCCapacity.length-1)
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
