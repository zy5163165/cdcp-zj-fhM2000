package maintenanceOps;

/**
 *	Generated from IDL definition of struct "CurrentMaintenanceOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class CurrentMaintenanceOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CurrentMaintenanceOperation_T(){}
	public globaldefs.NameAndStringValue_T[] tpName;
	public java.lang.String maintenanceOperation;
	public short layerRate;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public CurrentMaintenanceOperation_T(globaldefs.NameAndStringValue_T[] tpName, java.lang.String maintenanceOperation, short layerRate, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tpName = tpName;
		this.maintenanceOperation = maintenanceOperation;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CurrentMaintenanceOperation_T");
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
		textStruct.append("maintenanceOperation=");
		textStruct.append(maintenanceOperation);
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
