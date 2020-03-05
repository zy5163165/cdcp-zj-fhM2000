package extendedPerformanceMgr;

/**
 *	Generated from IDL definition of struct "PMTPPmNameSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPPmNameSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPPmNameSelect_T(){}
	public performance.PMTPSelect_T pmTpSelect;
	public java.lang.String[] pmParamList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMTPPmNameSelect_T(performance.PMTPSelect_T pmTpSelect, java.lang.String[] pmParamList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.pmTpSelect = pmTpSelect;
		this.pmParamList = pmParamList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMTPPmNameSelect_T");
		textStruct.append("(");
		textStruct.append("pmTpSelect=");
		textStruct.append(pmTpSelect);
		textStruct.append(","); 
		textStruct.append("pmParamList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <pmParamList.length; mem1++){
			textStruct.append(pmParamList[mem1]);
			if(mem1 < pmParamList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <additionalInfo.length; mem2++){
			textStruct.append(additionalInfo[mem2]);
			if(mem2 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
