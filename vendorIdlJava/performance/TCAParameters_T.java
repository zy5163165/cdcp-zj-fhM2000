package performance;

/**
 *	Generated from IDL definition of struct "TCAParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAParameters_T(){}
	public short layerRate;
	public java.lang.String granularity;
	public performance.PMThresholdValue_T[] tcaTypeValues;
	public TCAParameters_T(short layerRate, java.lang.String granularity, performance.PMThresholdValue_T[] tcaTypeValues)
	{
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.tcaTypeValues = tcaTypeValues;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TCAParameters_T");
		textStruct.append("(");
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("granularity=");
		textStruct.append(granularity);
		textStruct.append(","); 
		textStruct.append("tcaTypeValues=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <tcaTypeValues.length; mem2++){
			textStruct.append(tcaTypeValues[mem2]);
			if(mem2 < tcaTypeValues.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
