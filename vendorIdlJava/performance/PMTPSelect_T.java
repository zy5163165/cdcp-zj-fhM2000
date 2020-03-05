package performance;

/**
 *	Generated from IDL definition of struct "PMTPSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPSelect_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String[] granularityList;
	public PMTPSelect_T(globaldefs.NameAndStringValue_T[] name, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String[] granularityList)
	{
		this.name = name;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.granularityList = granularityList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMTPSelect_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("layerRateList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <layerRateList.length; mem1++){
			textStruct.append(layerRateList[mem1]);
			if(mem1 < layerRateList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("pMLocationList=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <pMLocationList.length; mem2++){
			textStruct.append(pMLocationList[mem2]);
			if(mem2 < pMLocationList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("granularityList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <granularityList.length; mem3++){
			textStruct.append(granularityList[mem3]);
			if(mem3 < granularityList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
