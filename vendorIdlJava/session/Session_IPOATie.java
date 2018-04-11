package session;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "Session_I"
 *	@author JacORB IDL compiler 
 */

public class Session_IPOATie
	extends Session_IPOA
{
	private Session_IOperations _delegate;

	private POA _poa;
	public Session_IPOATie(Session_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Session_IPOATie(Session_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public session.Session_I _this()
	{
		return session.Session_IHelper.narrow(_this_object());
	}
	public session.Session_I _this(org.omg.CORBA.ORB orb)
	{
		return session.Session_IHelper.narrow(_this_object(orb));
	}
	public Session_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Session_IOperations delegate)
	{
		_delegate = delegate;
	}
	public session.Session_I associatedSession()
	{
		return _delegate.associatedSession();
	}

	public void ping()
	{
_delegate.ping();
	}

	public void endSession()
	{
_delegate.endSession();
	}

}
