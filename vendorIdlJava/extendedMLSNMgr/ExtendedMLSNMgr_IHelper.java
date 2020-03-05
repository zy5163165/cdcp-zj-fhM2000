package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "ExtendedMLSNMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class ExtendedMLSNMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final extendedMLSNMgr.ExtendedMLSNMgr_I s)
	{
		any.insert_Object (s);
	}
	public static extendedMLSNMgr.ExtendedMLSNMgr_I extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/ExtendedMLSNMgr_I:1.0", "ExtendedMLSNMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/ExtendedMLSNMgr_I:1.0";
	}
	public static ExtendedMLSNMgr_I read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final extendedMLSNMgr.ExtendedMLSNMgr_I s)
	{
		_out.write_Object(s);
	}
	public static extendedMLSNMgr.ExtendedMLSNMgr_I narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (extendedMLSNMgr.ExtendedMLSNMgr_I)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/ExtendedMLSNMgr_I:1.0"))
			{
				extendedMLSNMgr._ExtendedMLSNMgr_IStub stub;
				stub = new extendedMLSNMgr._ExtendedMLSNMgr_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
