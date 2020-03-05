package ipMgrCMCC;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FRRIterator_I"
 *	@author JacORB IDL compiler 
 */

public class FRRIterator_IPOATie
	extends FRRIterator_IPOA
{
	private FRRIterator_IOperations _delegate;

	private POA _poa;
	public FRRIterator_IPOATie(FRRIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FRRIterator_IPOATie(FRRIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public ipMgrCMCC.FRRIterator_I _this()
	{
		return ipMgrCMCC.FRRIterator_IHelper.narrow(_this_object());
	}
	public ipMgrCMCC.FRRIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return ipMgrCMCC.FRRIterator_IHelper.narrow(_this_object(orb));
	}
	public FRRIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FRRIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, ipMgrCMCC.FRRList_THolder frrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,frrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
