package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndRouteType_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndRouteType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteAndRouteType_T(){}
	public java.lang.String[] rAIDList;
	public java.lang.String routeType;
	public java.lang.String RouteDescription = "";
	public RouteAndRouteType_T(java.lang.String[] rAIDList, java.lang.String routeType, java.lang.String RouteDescription)
	{
		this.rAIDList = rAIDList;
		this.routeType = routeType;
		this.RouteDescription = RouteDescription;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RouteAndRouteType_T");
		textStruct.append("(");
		textStruct.append("rAIDList=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <rAIDList.length; mem0++){
			textStruct.append(rAIDList[mem0]);
			if(mem0 < rAIDList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("routeType=");
		textStruct.append(routeType);
		textStruct.append(","); 
		textStruct.append("RouteDescription=");
		textStruct.append(RouteDescription);
		textStruct.append(")");
		return textStruct.toString();
	}
}
