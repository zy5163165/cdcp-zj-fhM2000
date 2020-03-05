package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "EXPMThresholdValue_T"
 *	@author JacORB IDL compiler 
 */

public final class EXPMThresholdValue_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EXPMThresholdValue_T(){}
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EXPMThresholdValue_T(java.lang.String pmParameterName, java.lang.String pmLocation, performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EXPMThresholdValue_T");
		textStruct.append("(");
		textStruct.append("pmParameterName=");
		textStruct.append(pmParameterName);
		textStruct.append(","); 
		textStruct.append("pmLocation=");
		textStruct.append(pmLocation);
		textStruct.append(","); 
		textStruct.append("thresholdType=");
		textStruct.append(thresholdType);
		textStruct.append(","); 
		textStruct.append("triggerFlag=");
		textStruct.append(triggerFlag);
		textStruct.append(","); 
		textStruct.append("value=");
		textStruct.append(value);
		textStruct.append(","); 
		textStruct.append("unit=");
		textStruct.append(unit);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalInfo.length; mem6++){
			textStruct.append(additionalInfo[mem6]);
			if(mem6 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
