package extendedManagedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "EquipmentClockIterator_I"
 *	@author JacORB IDL compiler 
 */

public class EquipmentClockIterator_IPOATie
	extends EquipmentClockIterator_IPOA
{
	private EquipmentClockIterator_IOperations _delegate;

	private POA _poa;
	public EquipmentClockIterator_IPOATie(EquipmentClockIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EquipmentClockIterator_IPOATie(EquipmentClockIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedManagedElementManager.EquipmentClockIterator_I _this()
	{
		return extendedManagedElementManager.EquipmentClockIterator_IHelper.narrow(_this_object());
	}
	public extendedManagedElementManager.EquipmentClockIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedManagedElementManager.EquipmentClockIterator_IHelper.narrow(_this_object(orb));
	}
	public EquipmentClockIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EquipmentClockIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedManagedElementManager.EquipmentClockList_THolder equipmentClockList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,equipmentClockList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
