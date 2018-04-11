package extendedEmsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "BusinessCutOverPlanIterator_I"
 *	@author JacORB IDL compiler 
 */

public class BusinessCutOverPlanIterator_IPOATie
	extends BusinessCutOverPlanIterator_IPOA
{
	private BusinessCutOverPlanIterator_IOperations _delegate;

	private POA _poa;
	public BusinessCutOverPlanIterator_IPOATie(BusinessCutOverPlanIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public BusinessCutOverPlanIterator_IPOATie(BusinessCutOverPlanIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedEmsMgr.BusinessCutOverPlanIterator_I _this()
	{
		return extendedEmsMgr.BusinessCutOverPlanIterator_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.BusinessCutOverPlanIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.BusinessCutOverPlanIterator_IHelper.narrow(_this_object(orb));
	}
	public BusinessCutOverPlanIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(BusinessCutOverPlanIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedEmsMgr.BusinessCutOverPlanList_THolder bcoPlanList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,bcoPlanList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
