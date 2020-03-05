package extendedManagedElementManager;

/**
 *	Generated from IDL definition of union "CCorTPL_T"
 *	@author JacORB IDL compiler 
 */

public final class CCorTPL_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.CCorTPL_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.CCorTPL_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/CCorTPL_T:1.0";
	}
	public static CCorTPL_T read (org.omg.CORBA.portable.InputStream in)
	{
		CCorTPL_T result = new CCorTPL_T ();
		extendedManagedElementManager.RouteTypeQualifier_T disc = extendedManagedElementManager.RouteTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case extendedManagedElementManager.RouteTypeQualifier_T._TPL:
			{
				topologicalLink.TopologicalLink_T _var;
				_var=topologicalLink.TopologicalLink_THelper.read(in);
				result.tplinfo (_var);
				break;
			}
			case extendedManagedElementManager.RouteTypeQualifier_T._CC:
			{
				subnetworkConnection.CrossConnect_T _var;
				_var=subnetworkConnection.CrossConnect_THelper.read(in);
				result.ccinfo (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, CCorTPL_T s)
	{
		out.write_long(s.discriminator().value());
		switch(s.discriminator().value())
		{
			case extendedManagedElementManager.RouteTypeQualifier_T._TPL:
			{
				topologicalLink.TopologicalLink_THelper.write(out,s.tplinfo ());
				break;
			}
			case extendedManagedElementManager.RouteTypeQualifier_T._CC:
			{
				subnetworkConnection.CrossConnect_THelper.write(out,s.ccinfo ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			extendedManagedElementManager.RouteTypeQualifier_THelper.insert( label_any, extendedManagedElementManager.RouteTypeQualifier_T.TPL );
			members[0] = new org.omg.CORBA.UnionMember ("tplinfo", label_any, topologicalLink.TopologicalLink_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			extendedManagedElementManager.RouteTypeQualifier_THelper.insert( label_any, extendedManagedElementManager.RouteTypeQualifier_T.CC );
			members[1] = new org.omg.CORBA.UnionMember ("ccinfo", label_any, subnetworkConnection.CrossConnect_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"CCorTPL_T",extendedManagedElementManager.RouteTypeQualifier_THelper.type(), members);
		}
		return _type;
	}
}
