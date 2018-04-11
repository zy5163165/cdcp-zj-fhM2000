package callSNC;

/**
 *	Generated from IDL definition of struct "RouteGroupInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteGroupInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteGroupInfo_T(){}
	public globaldefs.NameAndStringValue_T[] sNCname;
	public java.lang.String routeGroupLabel = "";
	public RouteGroupInfo_T(globaldefs.NameAndStringValue_T[] sNCname, java.lang.String routeGroupLabel)
	{
		this.sNCname = sNCname;
		this.routeGroupLabel = routeGroupLabel;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RouteGroupInfo_T");
		textStruct.append("(");
		textStruct.append("sNCname=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <sNCname.length; mem0++){
			textStruct.append(sNCname[mem0]);
			if(mem0 < sNCname.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("routeGroupLabel=");
		textStruct.append(routeGroupLabel);
		textStruct.append(")");
		return textStruct.toString();
	}
}
