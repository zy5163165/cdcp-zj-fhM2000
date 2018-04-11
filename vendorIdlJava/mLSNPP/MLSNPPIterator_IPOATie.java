package mLSNPP;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MLSNPPIterator_I"
 *	@author JacORB IDL compiler 
 */

public class MLSNPPIterator_IPOATie
	extends MLSNPPIterator_IPOA
{
	private MLSNPPIterator_IOperations _delegate;

	private POA _poa;
	public MLSNPPIterator_IPOATie(MLSNPPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPIterator_IPOATie(MLSNPPIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mLSNPP.MLSNPPIterator_I _this()
	{
		return mLSNPP.MLSNPPIterator_IHelper.narrow(_this_object());
	}
	public mLSNPP.MLSNPPIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return mLSNPP.MLSNPPIterator_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_n(int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mLSNPPList);
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
