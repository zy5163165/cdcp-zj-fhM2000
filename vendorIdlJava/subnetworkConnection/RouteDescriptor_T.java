package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteDescriptor_T(){}
	public java.lang.String id = "";
	public java.lang.String intended = "";
	public java.lang.String actualState = "";
	public java.lang.String administrativeState = "";
	public java.lang.String inUseBy = "";
	public java.lang.String exclusive = "";
	public subnetworkConnection.CrossConnect_T[] routeXCs;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteDescriptor_T(java.lang.String id, java.lang.String intended, java.lang.String actualState, java.lang.String administrativeState, java.lang.String inUseBy, java.lang.String exclusive, subnetworkConnection.CrossConnect_T[] routeXCs, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.id = id;
		this.intended = intended;
		this.actualState = actualState;
		this.administrativeState = administrativeState;
		this.inUseBy = inUseBy;
		this.exclusive = exclusive;
		this.routeXCs = routeXCs;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RouteDescriptor_T");
		textStruct.append("(");
		textStruct.append("id=");
		textStruct.append(id);
		textStruct.append(","); 
		textStruct.append("intended=");
		textStruct.append(intended);
		textStruct.append(","); 
		textStruct.append("actualState=");
		textStruct.append(actualState);
		textStruct.append(","); 
		textStruct.append("administrativeState=");
		textStruct.append(administrativeState);
		textStruct.append(","); 
		textStruct.append("inUseBy=");
		textStruct.append(inUseBy);
		textStruct.append(","); 
		textStruct.append("exclusive=");
		textStruct.append(exclusive);
		textStruct.append(","); 
		textStruct.append("routeXCs=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <routeXCs.length; mem6++){
			textStruct.append(routeXCs[mem6]);
			if(mem6 < routeXCs.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalInfo.length; mem7++){
			textStruct.append(additionalInfo[mem7]);
			if(mem7 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
