package extendedEmsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "AlarmFilterTaskIterator_I"
 *	@author JacORB IDL compiler 
 */

public class AlarmFilterTaskIterator_IPOATie
	extends AlarmFilterTaskIterator_IPOA
{
	private AlarmFilterTaskIterator_IOperations _delegate;

	private POA _poa;
	public AlarmFilterTaskIterator_IPOATie(AlarmFilterTaskIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmFilterTaskIterator_IPOATie(AlarmFilterTaskIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedEmsMgr.AlarmFilterTaskIterator_I _this()
	{
		return extendedEmsMgr.AlarmFilterTaskIterator_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.AlarmFilterTaskIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.AlarmFilterTaskIterator_IHelper.narrow(_this_object(orb));
	}
	public AlarmFilterTaskIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmFilterTaskIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedEmsMgr.AlarmFilterTaskList_THolder alarmFilterMaskList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmFilterMaskList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
