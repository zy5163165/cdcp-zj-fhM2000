package CORBA;

/**
 *	Generated from IDL definition of interface "NamedValue"
 *	@author JacORB IDL compiler 
 */


public abstract class NamedValuePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, CORBA.NamedValueOperations
{
	private String[] ids = {"IDL:CORBA/NamedValue:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public CORBA.NamedValue _this()
	{
		return CORBA.NamedValueHelper.narrow(_this_object());
	}
	public CORBA.NamedValue _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.NamedValueHelper.narrow(_this_object(orb));
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
