package callSNC;


/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( callSNC.SNCAndRoute_THelper.id(),"SNCAndRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("connection", subnetworkConnection.SubnetworkConnection_THelper.type(), null),new org.omg.CORBA.StructMember("connectionRoutes", subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("edgeMLSNPPLinks", mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("internalMLSNPPLinks", mLSNPPLink.MLSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", callSNC.RouteType_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.SNCAndRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.SNCAndRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SNCAndRoute_T:1.0";
	}
	public static callSNC.SNCAndRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.SNCAndRoute_T result = new callSNC.SNCAndRoute_T();
		result.connection=subnetworkConnection.SubnetworkConnection_THelper.read(in);
		result.connectionRoutes = subnetworkConnection.RouteList_THelper.read(in);
		result.edgeMLSNPPLinks = mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.internalMLSNPPLinks = mLSNPPLink.MLSNPPLinkList_THelper.read(in);
		result.routeType = callSNC.RouteType_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.SNCAndRoute_T s)
	{
		subnetworkConnection.SubnetworkConnection_THelper.write(out,s.connection);
		subnetworkConnection.RouteList_THelper.write(out,s.connectionRoutes);
		mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.edgeMLSNPPLinks);
		mLSNPPLink.MLSNPPLinkList_THelper.write(out,s.internalMLSNPPLinks);
		callSNC.RouteType_THelper.write(out,s.routeType);
	}
}
