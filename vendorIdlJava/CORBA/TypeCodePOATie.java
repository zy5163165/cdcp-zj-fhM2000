package CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TypeCode"
 *	@author JacORB IDL compiler 
 */

public class TypeCodePOATie
	extends TypeCodePOA
{
	private TypeCodeOperations _delegate;

	private POA _poa;
	public TypeCodePOATie(TypeCodeOperations delegate)
	{
		_delegate = delegate;
	}
	public TypeCodePOATie(TypeCodeOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CORBA.TypeCode _this()
	{
		return CORBA.TypeCodeHelper.narrow(_this_object());
	}
	public CORBA.TypeCode _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.TypeCodeHelper.narrow(_this_object(orb));
	}
	public TypeCodeOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TypeCodeOperations delegate)
	{
		_delegate = delegate;
	}
}
