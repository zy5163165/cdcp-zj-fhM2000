package performance;

/**
 *	Generated from IDL definition of struct "PMThreshold_T"
 *	@author JacORB IDL compiler 
 */

public final class PMThreshold_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMThreshold_T(){}
	public performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThreshold_T(performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMThreshold_T");
		textStruct.append("(");
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
		textStruct.append(")");
		return textStruct.toString();
	}
}
