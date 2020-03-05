package callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnectionsAndSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsAndSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnectionsAndSNCs_T(){}
	public callSNC.Call_T theCall;
	public callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList;
	public CallAndTopLevelConnectionsAndSNCs_T(callSNC.Call_T theCall, callSNC.ConnectionAndSupportingSNCs_T[] topLevelConnectionsAndSNCsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsAndSNCsList = topLevelConnectionsAndSNCsList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CallAndTopLevelConnectionsAndSNCs_T");
		textStruct.append("(");
		textStruct.append("theCall=");
		textStruct.append(theCall);
		textStruct.append(","); 
		textStruct.append("topLevelConnectionsAndSNCsList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <topLevelConnectionsAndSNCsList.length; mem1++){
			textStruct.append(topLevelConnectionsAndSNCsList[mem1]);
			if(mem1 < topLevelConnectionsAndSNCsList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
