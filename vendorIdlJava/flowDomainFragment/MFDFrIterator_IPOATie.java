package flowDomainFragment;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MFDFrIterator_I"
 *	@author JacORB IDL compiler 
 */

public class MFDFrIterator_IPOATie
	extends MFDFrIterator_IPOA
{
	private MFDFrIterator_IOperations _delegate;

	private POA _poa;
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MFDFrIterator_IPOATie(MFDFrIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public flowDomainFragment.MFDFrIterator_I _this()
	{
		return flowDomainFragment.MFDFrIterator_IHelper.narrow(_this_object());
	}
	public flowDomainFragment.MFDFrIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomainFragment.MFDFrIterator_IHelper.narrow(_this_object(orb));
	}
	public MFDFrIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MFDFrIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdfrList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
