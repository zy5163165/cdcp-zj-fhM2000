package mLSNPPLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MLSNPPLinkIterator_I"
 *	@author JacORB IDL compiler 
 */

public class MLSNPPLinkIterator_IPOATie
	extends MLSNPPLinkIterator_IPOA
{
	private MLSNPPLinkIterator_IOperations _delegate;

	private POA _poa;
	public MLSNPPLinkIterator_IPOATie(MLSNPPLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPLinkIterator_IPOATie(MLSNPPLinkIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mLSNPPLink.MLSNPPLinkIterator_I _this()
	{
		return mLSNPPLink.MLSNPPLinkIterator_IHelper.narrow(_this_object());
	}
	public mLSNPPLink.MLSNPPLinkIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return mLSNPPLink.MLSNPPLinkIterator_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPLinkIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPLinkIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mLSNPPLink);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
