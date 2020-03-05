package extendedEmsMgr;

/**
 *	Generated from IDL definition of interface "AlarmFilterTaskIterator_I"
 *	@author JacORB IDL compiler 
 */


public abstract class AlarmFilterTaskIterator_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, extendedEmsMgr.AlarmFilterTaskIterator_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getLength", new java.lang.Integer(0));
		m_opsHash.put ( "next_n", new java.lang.Integer(1));
		m_opsHash.put ( "destroy", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org.fiberhome.extended/extendedEmsMgr/AlarmFilterTaskIterator_I:1.0","IDL:omg.org/CORBA/Object:1.0"};
	public extendedEmsMgr.AlarmFilterTaskIterator_I _this()
	{
		return extendedEmsMgr.AlarmFilterTaskIterator_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.AlarmFilterTaskIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.AlarmFilterTaskIterator_IHelper.narrow(_this_object(orb));
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
			case 0: // getLength
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(getLength());
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // next_n
			{
			try
			{
				int _arg0=_input.read_ulong();
				extendedEmsMgr.AlarmFilterTaskList_THolder _arg1= new extendedEmsMgr.AlarmFilterTaskList_THolder();
				_out = handler.createReply();
				_out.write_boolean(next_n(_arg0,_arg1));
				extendedEmsMgr.AlarmFilterTaskList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // destroy
			{
			try
			{
				_out = handler.createReply();
				destroy();
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
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
