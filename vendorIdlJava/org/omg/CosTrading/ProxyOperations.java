package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "Proxy"
 *	@author JacORB IDL compiler 
 */


public interface ProxyOperations
	extends org.omg.CosTrading.TraderComponentsOperations, org.omg.CosTrading.SupportAttributesOperations
{
	/* constants */
	/* operations  */
	java.lang.String export_proxy(org.omg.CosTrading.Lookup target, java.lang.String type, org.omg.CosTrading.Property[] properties, boolean if_match_all, java.lang.String recipe, org.omg.CosTrading.Policy[] policies_to_pass_on) throws org.omg.CosTrading.DuplicatePropertyName,org.omg.CosTrading.MissingMandatoryProperty,org.omg.CosTrading.IllegalServiceType,org.omg.CosTrading.ProxyPackage.IllegalRecipe,org.omg.CosTrading.ReadonlyDynamicProperty,org.omg.CosTrading.DuplicatePolicyName,org.omg.CosTrading.PropertyTypeMismatch,org.omg.CosTrading.IllegalPropertyName,org.omg.CosTrading.UnknownServiceType,org.omg.CosTrading.InvalidLookupRef;
	void withdraw_proxy(java.lang.String id) throws org.omg.CosTrading.ProxyPackage.NotProxyOfferId,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.UnknownOfferId;
	org.omg.CosTrading.ProxyPackage.ProxyInfo describe_proxy(java.lang.String id) throws org.omg.CosTrading.ProxyPackage.NotProxyOfferId,org.omg.CosTrading.IllegalOfferId,org.omg.CosTrading.UnknownOfferId;
}
