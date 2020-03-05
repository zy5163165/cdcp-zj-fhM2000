package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "ImportAttributes"
 *	@author JacORB IDL compiler 
 */

public final class ImportAttributesHolder	implements org.omg.CORBA.portable.Streamable{
	 public ImportAttributes value;
	public ImportAttributesHolder ()
	{
	}
	public ImportAttributesHolder (final ImportAttributes initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ImportAttributesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ImportAttributesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ImportAttributesHelper.write (_out,value);
	}
}
