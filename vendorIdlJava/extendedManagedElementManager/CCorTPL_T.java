package extendedManagedElementManager;

/**
 *	Generated from IDL definition of union "CCorTPL_T"
 *	@author JacORB IDL compiler 
 */

public final class CCorTPL_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private extendedManagedElementManager.RouteTypeQualifier_T discriminator;
	private topologicalLink.TopologicalLink_T tplinfo;
	private subnetworkConnection.CrossConnect_T ccinfo;

	public CCorTPL_T ()
	{
	}

	public extendedManagedElementManager.RouteTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public topologicalLink.TopologicalLink_T tplinfo ()
	{
		if( discriminator != extendedManagedElementManager.RouteTypeQualifier_T.TPL)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tplinfo;
	}

	public void tplinfo (topologicalLink.TopologicalLink_T _x)
	{
		discriminator = extendedManagedElementManager.RouteTypeQualifier_T.TPL;
		tplinfo = _x;
	}

	public subnetworkConnection.CrossConnect_T ccinfo ()
	{
		if( discriminator != extendedManagedElementManager.RouteTypeQualifier_T.CC)
			throw new org.omg.CORBA.BAD_OPERATION();
		return ccinfo;
	}

	public void ccinfo (subnetworkConnection.CrossConnect_T _x)
	{
		discriminator = extendedManagedElementManager.RouteTypeQualifier_T.CC;
		ccinfo = _x;
	}

	public String toString()
	{
		StringBuffer textUnion = new StringBuffer();
		textUnion.append("CCorTPL_T(");
		if( discriminator == extendedManagedElementManager.RouteTypeQualifier_T.TPL){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("tplinfo");
			textUnion.append("(");
			textUnion.append(tplinfo);
			textUnion.append(")");
		}
		else if( discriminator == extendedManagedElementManager.RouteTypeQualifier_T.CC){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("ccinfo");
			textUnion.append("(");
			textUnion.append(ccinfo);
			textUnion.append(")");
		}
		else
			textUnion.append("discriminator has not been set");
		textUnion.append(")");
		return textUnion.toString();
	}
}
