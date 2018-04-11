package org.omg.CosNotifyFilter;


/**
 *	Generated from IDL definition of exception "InvalidConstraint"
 *	@author JacORB IDL compiler 
 */

public final class InvalidConstraintHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosNotifyFilter.InvalidConstraintHelper.id(),"InvalidConstraint",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("constr", org.omg.CosNotifyFilter.ConstraintExpHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.InvalidConstraint s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyFilter.InvalidConstraint extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0";
	}
	public static org.omg.CosNotifyFilter.InvalidConstraint read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotifyFilter.InvalidConstraint result = new org.omg.CosNotifyFilter.InvalidConstraint();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.constr=org.omg.CosNotifyFilter.ConstraintExpHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyFilter.InvalidConstraint s)
	{
		out.write_string(id());
		org.omg.CosNotifyFilter.ConstraintExpHelper.write(out,s.constr);
	}
}
