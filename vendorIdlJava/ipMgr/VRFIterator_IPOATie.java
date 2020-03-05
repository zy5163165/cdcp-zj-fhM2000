package ipMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "VRFIterator_I"
 *	@author JacORB IDL compiler 
 */

public class VRFIterator_IPOATie
	extends VRFIterator_IPOA
{
	private VRFIterator_IOperations _delegate;

	private POA _poa;
	public VRFIterator_IPOATie(VRFIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public VRFIterator_IPOATie(VRFIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgr.VRFIterator_I _this()
	{
		return ipMgr.VRFIterator_IHelper.narrow(_this_object());
	}
	public ipMgr.VRFIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgr.VRFIterator_IHelper.narrow(_this_object(orb));
	}
	public VRFIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(VRFIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, ipMgr.VRFList_THolder vrfList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,vrfList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
