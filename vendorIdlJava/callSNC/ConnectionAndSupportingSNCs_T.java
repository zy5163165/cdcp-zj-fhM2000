package callSNC;

/**
 *	Generated from IDL definition of struct "ConnectionAndSupportingSNCs_T"
 *	@author JacORB IDL compiler 
 */

public final class ConnectionAndSupportingSNCs_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConnectionAndSupportingSNCs_T(){}
	public subnetworkConnection.SubnetworkConnection_T topLevelConnection;
	public subnetworkConnection.SubnetworkConnection_T[] sNCList;
	public ConnectionAndSupportingSNCs_T(subnetworkConnection.SubnetworkConnection_T topLevelConnection, subnetworkConnection.SubnetworkConnection_T[] sNCList)
	{
		this.topLevelConnection = topLevelConnection;
		this.sNCList = sNCList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ConnectionAndSupportingSNCs_T");
		textStruct.append("(");
		textStruct.append("topLevelConnection=");
		textStruct.append(topLevelConnection);
		textStruct.append(","); 
		textStruct.append("sNCList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <sNCList.length; mem1++){
			textStruct.append(sNCList[mem1]);
			if(mem1 < sNCList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
