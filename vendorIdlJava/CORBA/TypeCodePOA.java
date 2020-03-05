package CORBA;

/**
 *	Generated from IDL definition of interface "TypeCode"
 *	@author JacORB IDL compiler 
 */


public abstract class TypeCodePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, CORBA.TypeCodeOperations
{
	private String[] ids = {"IDL:CORBA/TypeCode:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public CORBA.TypeCode _this()
	{
		return CORBA.TypeCodeHelper.narrow(_this_object());
	}
	public CORBA.TypeCode _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.TypeCodeHelper.narrow(_this_object(orb));
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
