package protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "ProtectionGroupIterator_I"
 *	@author JacORB IDL compiler 
 */

public class ProtectionGroupIterator_IPOATie
	extends ProtectionGroupIterator_IPOA
{
	private ProtectionGroupIterator_IOperations _delegate;

	private POA _poa;
	public ProtectionGroupIterator_IPOATie(ProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionGroupIterator_IPOATie(ProtectionGroupIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public protection.ProtectionGroupIterator_I _this()
	{
		return protection.ProtectionGroupIterator_IHelper.narrow(_this_object());
	}
	public protection.ProtectionGroupIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return protection.ProtectionGroupIterator_IHelper.narrow(_this_object(orb));
	}
	public ProtectionGroupIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionGroupIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_n(int how_many, protection.ProtectionGroupList_THolder pgpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,pgpList);
	}

	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
