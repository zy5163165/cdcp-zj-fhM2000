package performance;

/**
 *	Generated from IDL definition of struct "PMData_T"
 *	@author JacORB IDL compiler 
 */

public final class PMData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMData_T(){}
	public globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity;
	public java.lang.String retrievalTime;
	public performance.PMMeasurement_T[] pmMeasurementList;
	public PMData_T(globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, java.lang.String retrievalTime, performance.PMMeasurement_T[] pmMeasurementList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.retrievalTime = retrievalTime;
		this.pmMeasurementList = pmMeasurementList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMData_T");
		textStruct.append("(");
		textStruct.append("tpName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <tpName.length; mem0++){
			textStruct.append(tpName[mem0]);
			if(mem0 < tpName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("granularity=");
		textStruct.append(granularity);
		textStruct.append(","); 
		textStruct.append("retrievalTime=");
		textStruct.append(retrievalTime);
		textStruct.append(","); 
		textStruct.append("pmMeasurementList=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <pmMeasurementList.length; mem4++){
			textStruct.append(pmMeasurementList[mem4]);
			if(mem4 < pmMeasurementList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
