package org.omg.CosTrading.ProxyPackage;


/**
 *	Generated from IDL definition of exception "IllegalRecipe"
 *	@author JacORB IDL compiler 
 */

public final class IllegalRecipeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc( org.omg.CosTrading.ProxyPackage.IllegalRecipeHelper.id(),"IllegalRecipe",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("recipe", org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTrading.ProxyPackage.IllegalRecipe s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTrading.ProxyPackage.IllegalRecipe extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTrading/Proxy/IllegalRecipe:1.0";
	}
	public static org.omg.CosTrading.ProxyPackage.IllegalRecipe read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTrading.ProxyPackage.IllegalRecipe result = new org.omg.CosTrading.ProxyPackage.IllegalRecipe();
		if(!in.read_string().equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id");
		result.recipe = org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTrading.ProxyPackage.IllegalRecipe s)
	{
		out.write_string(id());
		org.omg.CosTrading.ProxyPackage.ConstraintRecipeHelper.write(out,s.recipe);
	}
}
