package flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "FDIterator_I"
 *	@author JacORB IDL compiler 
 */

public class FDIterator_IPOATie
	extends FDIterator_IPOA
{
	private FDIterator_IOperations _delegate;

	private POA _poa;
	public FDIterator_IPOATie(FDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FDIterator_IPOATie(FDIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public flowDomain.FDIterator_I _this()
	{
		return flowDomain.FDIterator_IHelper.narrow(_this_object());
	}
	public flowDomain.FDIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomain.FDIterator_IHelper.narrow(_this_object(orb));
	}
	public FDIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, flowDomain.FDList_THolder fdList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,fdList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
