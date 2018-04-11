package org.omg.CosNotification;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "QoSAdmin"
 *	@author JacORB IDL compiler 
 */

public class QoSAdminPOATie
	extends QoSAdminPOA
{
	private QoSAdminOperations _delegate;

	private POA _poa;
	public QoSAdminPOATie(QoSAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public QoSAdminPOATie(QoSAdminOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.CosNotification.QoSAdmin _this()
	{
		return org.omg.CosNotification.QoSAdminHelper.narrow(_this_object());
	}
	public org.omg.CosNotification.QoSAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosNotification.QoSAdminHelper.narrow(_this_object(orb));
	}
	public QoSAdminOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QoSAdminOperations delegate)
	{
		_delegate = delegate;
	}
	public void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.validate_qos(required_qos,available_qos);
	}

	public org.omg.CosNotification.Property[] get_qos()
	{
		return _delegate.get_qos();
	}

	public void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS
	{
_delegate.set_qos(qos);
	}

}
