package performance;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "TCAParameterProfileIterator_I"
 *	@author JacORB IDL compiler 
 */

public class TCAParameterProfileIterator_IPOATie
	extends TCAParameterProfileIterator_IPOA
{
	private TCAParameterProfileIterator_IOperations _delegate;

	private POA _poa;
	public TCAParameterProfileIterator_IPOATie(TCAParameterProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TCAParameterProfileIterator_IPOATie(TCAParameterProfileIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public performance.TCAParameterProfileIterator_I _this()
	{
		return performance.TCAParameterProfileIterator_IHelper.narrow(_this_object());
	}
	public performance.TCAParameterProfileIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.TCAParameterProfileIterator_IHelper.narrow(_this_object(orb));
	}
	public TCAParameterProfileIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TCAParameterProfileIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_n(int how_many, performance.TCAParameterProfileList_THolder tcaParameterProfileList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,tcaParameterProfileList);
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
