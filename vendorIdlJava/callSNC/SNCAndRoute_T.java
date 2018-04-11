package callSNC;

/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCAndRoute_T(){}
	public subnetworkConnection.SubnetworkConnection_T connection;
	public subnetworkConnection.RouteDescriptor_T[] connectionRoutes;
	public mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks;
	public mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks;
	public java.lang.String routeType;
	public SNCAndRoute_T(subnetworkConnection.SubnetworkConnection_T connection, subnetworkConnection.RouteDescriptor_T[] connectionRoutes, mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks, mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks, java.lang.String routeType)
	{
		this.connection = connection;
		this.connectionRoutes = connectionRoutes;
		this.edgeMLSNPPLinks = edgeMLSNPPLinks;
		this.internalMLSNPPLinks = internalMLSNPPLinks;
		this.routeType = routeType;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNCAndRoute_T");
		textStruct.append("(");
		textStruct.append("connection=");
		textStruct.append(connection);
		textStruct.append(","); 
		textStruct.append("connectionRoutes=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <connectionRoutes.length; mem1++){
			textStruct.append(connectionRoutes[mem1]);
			if(mem1 < connectionRoutes.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("edgeMLSNPPLinks=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <edgeMLSNPPLinks.length; mem2++){
			textStruct.append(edgeMLSNPPLinks[mem2]);
			if(mem2 < edgeMLSNPPLinks.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("internalMLSNPPLinks=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <internalMLSNPPLinks.length; mem3++){
			textStruct.append(internalMLSNPPLinks[mem3]);
			if(mem3 < internalMLSNPPLinks.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("routeType=");
		textStruct.append(routeType);
		textStruct.append(")");
		return textStruct.toString();
	}
}
