package ipMgrCMCC;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "VRRPIterator_I"
 *	@author JacORB IDL compiler 
 */

public class VRRPIterator_IPOATie
	extends VRRPIterator_IPOA
{
	private VRRPIterator_IOperations _delegate;

	private POA _poa;
	public VRRPIterator_IPOATie(VRRPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public VRRPIterator_IPOATie(VRRPIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgrCMCC.VRRPIterator_I _this()
	{
		return ipMgrCMCC.VRRPIterator_IHelper.narrow(_this_object());
	}
	public ipMgrCMCC.VRRPIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgrCMCC.VRRPIterator_IHelper.narrow(_this_object(orb));
	}
	public VRRPIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(VRRPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, ipMgrCMCC.VRRPList_THolder vrrpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,vrrpList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
