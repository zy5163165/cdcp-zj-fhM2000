package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteNameAndAdminState_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteNameAndAdminState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteNameAndAdminState_T(){}
	public java.lang.String id = "";
	public java.lang.String administrativeState = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteNameAndAdminState_T(java.lang.String id, java.lang.String administrativeState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.id = id;
		this.administrativeState = administrativeState;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RouteNameAndAdminState_T");
		textStruct.append("(");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(","); 
		textStruct.append("administrativeState=");
		textStruct.append(administrativeState);
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
