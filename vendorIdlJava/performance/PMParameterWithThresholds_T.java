package performance;

/**
 *	Generated from IDL definition of struct "PMParameterWithThresholds_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholds_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMParameterWithThresholds_T(){}
	public java.lang.String pmParameterName;
	public performance.PMThreshold_T[] pmThresholdList;
	public PMParameterWithThresholds_T(java.lang.String pmParameterName, performance.PMThreshold_T[] pmThresholdList)
	{
		this.pmParameterName = pmParameterName;
		this.pmThresholdList = pmThresholdList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("PMParameterWithThresholds_T");
		textStruct.append("(");
		textStruct.append("pmParameterName=");
		textStruct.append(pmParameterName);
		textStruct.append(","); 
		textStruct.append("pmThresholdList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <pmThresholdList.length; mem1++){
			textStruct.append(pmThresholdList[mem1]);
			if(mem1 < pmThresholdList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
