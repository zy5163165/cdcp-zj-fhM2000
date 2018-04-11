package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "CCCapacityIterator_I"
 *	@author JacORB IDL compiler 
 */

public class CCCapacityIterator_IPOATie
	extends CCCapacityIterator_IPOA
{
	private CCCapacityIterator_IOperations _delegate;

	private POA _poa;
	public CCCapacityIterator_IPOATie(CCCapacityIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public CCCapacityIterator_IPOATie(CCCapacityIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.CCCapacityIterator_I _this()
	{
		return extendedManagedElementManager.CCCapacityIterator_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.CCCapacityIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.CCCapacityIterator_IHelper.narrow(_this_object(orb));
	}
	public CCCapacityIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CCCapacityIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

	public boolean next_n(int how_many, extendedManagedElementManager.CCCapacityList_THolder CCCapacityList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,CCCapacityList);
	}

}
