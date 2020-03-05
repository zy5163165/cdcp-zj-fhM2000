package org.omg.CosTrading.LookupPackage;

/**
 *	Generated from IDL definition of union "SpecifiedProps"
 *	@author JacORB IDL compiler 
 */

public final class SpecifiedProps
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.CosTrading.LookupPackage.HowManyProps discriminator;
	private java.lang.String[] prop_names;

	public SpecifiedProps ()
	{
	}

	public org.omg.CosTrading.LookupPackage.HowManyProps discriminator ()
	{
		return discriminator;
	}

	public java.lang.String[] prop_names ()
	{
		if( discriminator != org.omg.CosTrading.LookupPackage.HowManyProps.some)
			throw new org.omg.CORBA.BAD_OPERATION();
		return prop_names;
	}

	public void prop_names (java.lang.String[] _x)
	{
		discriminator = org.omg.CosTrading.LookupPackage.HowManyProps.some;
		prop_names = _x;
	}

	public void __default ()
	{
		discriminator = org.omg.CosTrading.LookupPackage.HowManyProps.none;
	}
	public void __default (org.omg.CosTrading.LookupPackage.HowManyProps _discriminator)
	{
		discriminator = _discriminator;
	}
	public String toString()
	{
		StringBuffer textUnion = new StringBuffer();
		textUnion.append("SpecifiedProps(");
		if( discriminator == org.omg.CosTrading.LookupPackage.HowManyProps.some){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("prop_names");
			textUnion.append("(");
			textUnion.append("[");
			for(int prop_namesindex =0; prop_namesindex <prop_names.length; prop_namesindex++){
				textUnion.append(prop_names[prop_namesindex]);
				if(prop_namesindex < prop_names.length-1)
					textUnion.append(",");
			}
			textUnion.append("]");
			textUnion.append(")");
		}
		else
			textUnion.append("discriminator has not been set");
		textUnion.append(")");
		return textUnion.toString();
	}
}
