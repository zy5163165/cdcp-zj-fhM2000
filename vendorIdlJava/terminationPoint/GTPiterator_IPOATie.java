package terminationPoint;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "GTPiterator_I"
 *	@author JacORB IDL compiler 
 */

public class GTPiterator_IPOATie
	extends GTPiterator_IPOA
{
	private GTPiterator_IOperations _delegate;

	private POA _poa;
	public GTPiterator_IPOATie(GTPiterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public GTPiterator_IPOATie(GTPiterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public terminationPoint.GTPiterator_I _this()
	{
		return terminationPoint.GTPiterator_IHelper.narrow(_this_object());
	}
	public terminationPoint.GTPiterator_I _this(org.omg.CORBA.ORB orb)
	{
		return terminationPoint.GTPiterator_IHelper.narrow(_this_object(orb));
	}
	public GTPiterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(GTPiterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_n(int how_many, terminationPoint.GTPlist_THolder gtpList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,gtpList);
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
