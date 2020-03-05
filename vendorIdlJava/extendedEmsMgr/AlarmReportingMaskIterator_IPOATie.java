package extendedEmsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "AlarmReportingMaskIterator_I"
 *	@author JacORB IDL compiler 
 */

public class AlarmReportingMaskIterator_IPOATie
	extends AlarmReportingMaskIterator_IPOA
{
	private AlarmReportingMaskIterator_IOperations _delegate;

	private POA _poa;
	public AlarmReportingMaskIterator_IPOATie(AlarmReportingMaskIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmReportingMaskIterator_IPOATie(AlarmReportingMaskIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedEmsMgr.AlarmReportingMaskIterator_I _this()
	{
		return extendedEmsMgr.AlarmReportingMaskIterator_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.AlarmReportingMaskIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.AlarmReportingMaskIterator_IHelper.narrow(_this_object(orb));
	}
	public AlarmReportingMaskIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmReportingMaskIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public boolean next_n(int how_many, extendedEmsMgr.AlarmReportingMaskList_THolder alarmReportingMaskList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmReportingMaskList);
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
