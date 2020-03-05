package CORBA;

/**
 *	Generated from IDL definition of interface "Principal"
 *	@author JacORB IDL compiler 
 */


public abstract class PrincipalPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, CORBA.PrincipalOperations
{
	private String[] ids = {"IDL:CORBA/Principal:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public CORBA.Principal _this()
	{
		return CORBA.PrincipalHelper.narrow(_this_object());
	}
	public CORBA.Principal _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.PrincipalHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
