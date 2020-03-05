package extendedManagedElementManager;

/**
 *	Generated from IDL definition of interface "ClockLinkNetIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class ClockLinkNetIterator_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.ClockLinkNetIterator_I s)
	{
		any.insert_Object (s);
	}
	public static extendedManagedElementManager.ClockLinkNetIterator_I extract (final org.omg.CORBA.Any any)
	{
		return narrow (any.extract_Object ());
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc( "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/ClockLinkNetIterator_I:1.0", "ClockLinkNetIterator_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/ClockLinkNetIterator_I:1.0";
	}
	public static ClockLinkNetIterator_I read (final org.omg.CORBA.portable.InputStream in)
	{
		return narrow (in.read_Object ());
	}
	public static void write (final org.omg.CORBA.portable.OutputStream _out, final extendedManagedElementManager.ClockLinkNetIterator_I s)
	{
		_out.write_Object(s);
	}
	public static extendedManagedElementManager.ClockLinkNetIterator_I narrow (final org.omg.CORBA.Object obj)
	{
		if( obj == null )
			return null;
		try
		{
			return (extendedManagedElementManager.ClockLinkNetIterator_I)obj;
		}
		catch( ClassCastException c )
		{
			if( obj._is_a("IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/ClockLinkNetIterator_I:1.0"))
			{
				extendedManagedElementManager._ClockLinkNetIterator_IStub stub;
				stub = new extendedManagedElementManager._ClockLinkNetIterator_IStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
}
