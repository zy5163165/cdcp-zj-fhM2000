package CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "NamedValue"
 *	@author JacORB IDL compiler 
 */

public class NamedValuePOATie
	extends NamedValuePOA
{
	private NamedValueOperations _delegate;

	private POA _poa;
	public NamedValuePOATie(NamedValueOperations delegate)
	{
		_delegate = delegate;
	}
	public NamedValuePOATie(NamedValueOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CORBA.NamedValue _this()
	{
		return CORBA.NamedValueHelper.narrow(_this_object());
	}
	public CORBA.NamedValue _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.NamedValueHelper.narrow(_this_object(orb));
	}
	public NamedValueOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(NamedValueOperations delegate)
	{
		_delegate = delegate;
	}
}
