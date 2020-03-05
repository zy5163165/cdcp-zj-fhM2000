package FH_FaultAnalyzer;

/**
 *	Generated from IDL definition of struct "FaultGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class FaultGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FaultGroup_T(){}
	public FH_FaultAnalyzer.FilterAlarm_T[] filterAlarms;
	public FH_FaultAnalyzer.ProcessPrivilege_T[] suggestedPPR;
	public FaultGroup_T(FH_FaultAnalyzer.FilterAlarm_T[] filterAlarms, FH_FaultAnalyzer.ProcessPrivilege_T[] suggestedPPR)
	{
		this.filterAlarms = filterAlarms;
		this.suggestedPPR = suggestedPPR;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FaultGroup_T");
		textStruct.append("(");
		textStruct.append("filterAlarms=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <filterAlarms.length; mem0++){
			textStruct.append(filterAlarms[mem0]);
			if(mem0 < filterAlarms.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("suggestedPPR=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <suggestedPPR.length; mem1++){
			textStruct.append(suggestedPPR[mem1]);
			if(mem1 < suggestedPPR.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
