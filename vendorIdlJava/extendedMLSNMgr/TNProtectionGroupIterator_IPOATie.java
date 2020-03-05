package extendedMLSNMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TNProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public class TNProtectionGroupIterator_IPOATie
	extends TNProtectionGroupIterator_IPOA
{
	private TNProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public TNProtectionGroupIterator_IPOATie(TNProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TNProtectionGroupIterator_IPOATie(TNProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedMLSNMgr.TNProtectionGroupIterator_I _this()
	{
		return extendedMLSNMgr.TNProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public extendedMLSNMgr.TNProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedMLSNMgr.TNProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public TNProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TNProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedMLSNMgr.TNProtectionGroupList_THolder tNetworkProtectGroupList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tNetworkProtectGroupList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
