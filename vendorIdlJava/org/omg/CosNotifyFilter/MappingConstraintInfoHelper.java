package org.omg.CosNotifyFilter;


/**
 *	Generated from IDL definition of struct "MappingConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNotifyFilter.MappingConstraintInfoHelper.id(),"MappingConstraintInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("constraint_expression", org.omg.CosNotifyFilter.ConstraintExpHelper.type(), null),new org.omg.CORBA.StructMember("constraint_id", org.omg.CosNotifyFilter.ConstraintIDHelper.type(), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotifyFilter.MappingConstraintInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotifyFilter.MappingConstraintInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotifyFilter/MappingConstraintInfo:1.0";
	}
	public static org.omg.CosNotifyFilter.MappingConstraintInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotifyFilter.MappingConstraintInfo result = new org.omg.CosNotifyFilter.MappingConstraintInfo();
		result.constraint_expression=org.omg.CosNotifyFilter.ConstraintExpHelper.read(in);
		result.constraint_id=in.read_long();
		result.value=in.read_any();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotifyFilter.MappingConstraintInfo s)
	{
		org.omg.CosNotifyFilter.ConstraintExpHelper.write(out,s.constraint_expression);
		out.write_long(s.constraint_id);
		out.write_any(s.value);
	}
}
