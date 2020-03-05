package org.omg.CosTrading;


/**
 *	Generated from IDL definition of interface "LinkAttributes"
 *	@author JacORB IDL compiler 
 */

public class _LinkAttributesStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosTrading.LinkAttributes
{
	private String[] ids = {"IDL:omg.org/CosTrading/LinkAttributes:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosTrading.LinkAttributesOperations.class;
	public org.omg.CosTrading.FollowOption max_link_follow_policy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_max_link_follow_policy",true);
				_is = _invoke(_os);
				return org.omg.CosTrading.FollowOptionHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_max_link_follow_policy", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
		LinkAttributesOperations _localServant = (LinkAttributesOperations)_so.servant;
			org.omg.CosTrading.FollowOption _result;
		try
		{
			_result = _localServant.max_link_follow_policy();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

}
