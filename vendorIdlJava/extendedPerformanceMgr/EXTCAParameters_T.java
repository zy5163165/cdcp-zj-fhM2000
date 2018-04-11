package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "EXTCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class EXTCAParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EXTCAParameters_T(){}
	public short layerRate;
	public java.lang.String granularity;
	public extendedPerformanceMgr.EXPMThresholdValue_T[] extcaTypeValues;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EXTCAParameters_T(short layerRate, java.lang.String granularity, extendedPerformanceMgr.EXPMThresholdValue_T[] extcaTypeValues, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.extcaTypeValues = extcaTypeValues;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EXTCAParameters_T");
		textStruct.append("(");
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("granularity=");
		textStruct.append(granularity);
		textStruct.append(","); 
		textStruct.append("extcaTypeValues=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <extcaTypeValues.length; mem2++){
			textStruct.append(extcaTypeValues[mem2]);
			if(mem2 < extcaTypeValues.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
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
