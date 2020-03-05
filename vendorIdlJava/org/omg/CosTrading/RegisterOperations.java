package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Register"
 *	@author JacORB IDL compiler 
 */


public interface RegisterOperations
	extends org.omg.CosTrading.TraderComponentsOperations, org.omg.CosTrading.SupportAttributesOperations
{
	/* constants */
	/* operations  */
	java.lang.String export(org.omg.CORBA.Object reference, java.lang.String type, org.omg.CosTrading.Property[] properties) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.MissingMandatoryProperty,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.RegisterPackage.InterfaceTypeMismatch,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.InvalidObjectRef,org.omg.CosTrading.UnknownServiceType;
	void withdraw(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId;
	org.omg.CosTrading.RegisterPackage.OfferInfo describe(java.lang.String id) throws org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.UnknownOfferId;
	void modify(java.lang.String id, java.lang.String[] del_list, org.omg.CosTrading.Property[] modify_list) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.RegisterPackage.ProxyOfferId,org.omg.CosTrading.NotImplemented,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.UnknownOfferId,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.RegisterPackage.ReadonlyProperty,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.RegisterPackage.UnknownPropertyName,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.RegisterPackage.MandatoryProperty;
	void withdraw_using_constraint(java.lang.String type, java.lang.String constr) throws org.omg.CosTrading.RegisterPackage.NoMatchingOffers,org.omg.CosTrading.UnknownServiceType,org.omg.CosTrading.IllegalConstraint,org.omg.CosTrading.IllegalServiceType;
	org.omg.CosTrading.Register resolve(java.lang.String[] name) throws org.omg.CosTrading.RegisterPackage.UnknownTraderName,org.omg.CosTrading.RegisterPackage.RegisterNotSupported,org.omg.CosTrading.RegisterPackage.IllegalTraderName;
}
