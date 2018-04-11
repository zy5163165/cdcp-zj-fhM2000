package org.omg.CosNaming;


/**
 *	Generated from IDL definition of struct "Binding"
 *	@author JacORB IDL compiler 
 */

public final class BindingHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( org.omg.CosNaming.BindingHelper.id(),"Binding",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("binding_name", org.omg.CosNaming.NameHelper.type(), null),new org.omg.CORBA.StructMember("binding_type", org.omg.CosNaming.BindingTypeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNaming.Binding s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNaming.Binding extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/Binding:1.0";
	}
	public static org.omg.CosNaming.Binding read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNaming.Binding result = new org.omg.CosNaming.Binding();
		result.binding_name = org.omg.CosNaming.NameHelper.read(in);
		result.binding_type=org.omg.CosNaming.BindingTypeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNaming.Binding s)
	{
		org.omg.CosNaming.NameHelper.write(out,s.binding_name);
		org.omg.CosNaming.BindingTypeHelper.write(out,s.binding_type);
	}
}
