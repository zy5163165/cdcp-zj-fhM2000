package CORBA;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "Principal"
 *	@author JacORB IDL compiler 
 */

public class PrincipalPOATie
	extends PrincipalPOA
{
	private PrincipalOperations _delegate;

	private POA _poa;
	public PrincipalPOATie(PrincipalOperations delegate)
	{
		_delegate = delegate;
	}
	public PrincipalPOATie(PrincipalOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public CORBA.Principal _this()
	{
		return CORBA.PrincipalHelper.narrow(_this_object());
	}
	public CORBA.Principal _this(org.omg.CORBA.ORB orb)
	{
		return CORBA.PrincipalHelper.narrow(_this_object(orb));
	}
	public PrincipalOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PrincipalOperations delegate)
	{
		_delegate = delegate;
	}
}
