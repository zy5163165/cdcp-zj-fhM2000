package org.omg.CosNotifyFilter;


/**
 *	Generated from IDL definition of interface "FilterFactory"
 *	@author JacORB IDL compiler 
 */

public class _FilterFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosNotifyFilter.FilterFactory
{
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/FilterFactory:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosNotifyFilter.FilterFactoryOperations.class;
	public org.omg.CosNotifyFilter.MappingFilter create_mapping_filter(java.lang.String constraint_grammar, org.omg.CORBA.Any default_value) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "create_mapping_filter", true);
				_os.write_string(constraint_grammar);
				_os.write_any(default_value);
				_is = _invoke(_os);
				org.omg.CosNotifyFilter.MappingFilter _result = org.omg.CosNotifyFilter.MappingFilterHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidGrammar:1.0"))
				{
					throw org.omg.CosNotifyFilter.InvalidGrammarHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_mapping_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterFactoryOperations _localServant = (FilterFactoryOperations)_so.servant;
			org.omg.CosNotifyFilter.MappingFilter _result;			try
			{
			_result = _localServant.create_mapping_filter(constraint_grammar,default_value);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.CosNotifyFilter.Filter create_filter(java.lang.String constraint_grammar) throws org.omg.CosNotifyFilter.InvalidGrammar
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "create_filter", true);
				_os.write_string(constraint_grammar);
				_is = _invoke(_os);
				org.omg.CosNotifyFilter.Filter _result = org.omg.CosNotifyFilter.FilterHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/InvalidGrammar:1.0"))
				{
					throw org.omg.CosNotifyFilter.InvalidGrammarHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "create_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FilterFactoryOperations _localServant = (FilterFactoryOperations)_so.servant;
			org.omg.CosNotifyFilter.Filter _result;			try
			{
			_result = _localServant.create_filter(constraint_grammar);
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
