package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "OfferIterator"
 *	@author JacORB IDL compiler 
 */


public abstract class OfferIteratorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.CosTrading.OfferIteratorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "max_left", new java.lang.Integer(0));
		m_opsHash.put ( "destroy", new java.lang.Integer(1));
		m_opsHash.put ( "next_n", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosTrading/OfferIterator:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public org.omg.CosTrading.OfferIterator _this()
	{
		return org.omg.CosTrading.OfferIteratorHelper.narrow(_this_object());
	}
	public org.omg.CosTrading.OfferIterator _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.CosTrading.OfferIteratorHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // max_left
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(max_left());
			}
			catch(org.omg.CosTrading.UnknownMaxLeft _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.CosTrading.UnknownMaxLeftHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 2: // next_n
			{
				int _arg0=_input.read_ulong();
				org.omg.CosTrading.OfferSeqHolder _arg1= new org.omg.CosTrading.OfferSeqHolder();
				_out = handler.createReply();
				_out.write_boolean(next_n(_arg0,_arg1));
				org.omg.CosTrading.OfferSeqHelper.write(_out,_arg1.value);
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
