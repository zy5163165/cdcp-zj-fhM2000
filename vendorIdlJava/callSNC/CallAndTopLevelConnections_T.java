package callSNC;

/**
 *	Generated from IDL definition of struct "CallAndTopLevelConnections_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnections_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallAndTopLevelConnections_T(){}
	public callSNC.Call_T theCall;
	public subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList;
	public CallAndTopLevelConnections_T(callSNC.Call_T theCall, subnetworkConnection.SubnetworkConnection_T[] topLevelConnectionsList)
	{
		this.theCall = theCall;
		this.topLevelConnectionsList = topLevelConnectionsList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CallAndTopLevelConnections_T");
		textStruct.append("(");
		textStruct.append("theCall=");
		textStruct.append(theCall);
		textStruct.append(","); 
		textStruct.append("topLevelConnectionsList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <topLevelConnectionsList.length; mem1++){
			textStruct.append(topLevelConnectionsList[mem1]);
			if(mem1 < topLevelConnectionsList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
