package extendedMLSNMgr;

/**
 *	Generated from IDL definition of interface "TNProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TNProtectionGroupIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final extendedMLSNMgr.TNProtectionGroupIterator_I s)
	{
		any.insert_Object (s);
	}
	public static extendedMLSNMgr.TNProtectionGroupIterator_I extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/TNProtectionGroupIterator_I:1.0", "TNProtectionGroupIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/TNProtectionGroupIterator_I:1.0";
	}
	public static TNProtectionGroupIterator_I read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final extendedMLSNMgr.TNProtectionGroupIterator_I s)
	{
		_out.write_Object(s);
	}
	public static extendedMLSNMgr.TNProtectionGroupIterator_I narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (extendedMLSNMgr.TNProtectionGroupIterator_I)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:mtnm.tmforum.org.fiberhome.extended/extendedMLSNMgr/TNProtectionGroupIterator_I:1.0"))
			{
				extendedMLSNMgr._TNProtectionGroupIterator_IStub stub;
				stub = new extendedMLSNMgr._TNProtectionGroupIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
