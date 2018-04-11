package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of union "SpecifiedProps"
 *	@author JacORB IDL compiler 
 */

public final class SpecifiedPropsHelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.LookupPackage.SpecifiedProps s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.LookupPackage.SpecifiedProps extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Lookup/SpecifiedProps:1.0";
	}
	public static SpecifiedProps read (org.omg.CORBA.portable.InputStream in)
	{
		SpecifiedProps result = new SpecifiedProps ();
		org.omg.CosTrading.LookupPackage.HowManyProps disc = org.omg.CosTrading.LookupPackage.HowManyProps.from_int(in.read_long());
		switch (disc.value ())
		{
			case org.omg.CosTrading.LookupPackage.HowManyProps._some:
			{
				java.lang.String[] _var;
				_var = org.omg.CosTrading.PropertyNameSeqHelper.read(in);
				result.prop_names (_var);
				break;
			}
			default: result.__default (disc);
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, SpecifiedProps s)
	{
		out.write_long(s.discriminator().value());
		switch(s.discriminator().value())
		{
			case org.omg.CosTrading.LookupPackage.HowManyProps._some:
			{
				org.omg.CosTrading.PropertyNameSeqHelper.write(out,s.prop_names ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[1];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.CosTrading.LookupPackage.HowManyPropsHelper.insert( label_any, org.omg.CosTrading.LookupPackage.HowManyProps.some );
			members[0] = new org.omg.CORBA.UnionMember ("prop_names", label_any, org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosTrading.PropertyNameHelper.type() ),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"SpecifiedProps",org.omg.CosTrading.LookupPackage.HowManyPropsHelper.type(), members);
		}
		return _type;
	}
}
