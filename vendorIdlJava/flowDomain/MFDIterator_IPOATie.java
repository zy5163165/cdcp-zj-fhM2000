package flowDomain;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "MFDIterator_I"
 *	@author JacORB IDL compiler 
 */

public class MFDIterator_IPOATie
	extends MFDIterator_IPOA
{
	private MFDIterator_IOperations _delegate;

	private POA _poa;
	public MFDIterator_IPOATie(MFDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MFDIterator_IPOATie(MFDIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public flowDomain.MFDIterator_I _this()
	{
		return flowDomain.MFDIterator_IHelper.narrow(_this_object());
	}
	public flowDomain.MFDIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return flowDomain.MFDIterator_IHelper.narrow(_this_object(orb));
	}
	public MFDIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MFDIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, flowDomain.MFDList_THolder mfdList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,mfdList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
