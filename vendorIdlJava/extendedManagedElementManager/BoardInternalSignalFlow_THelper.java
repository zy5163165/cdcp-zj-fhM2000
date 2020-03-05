package extendedManagedElementManager;


/**
 *	Generated from IDL definition of struct "BoardInternalSignalFlow_T"
 *	@author JacORB IDL compiler 
 */

public final class BoardInternalSignalFlow_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if( _type == null )
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc( extendedManagedElementManager.BoardInternalSignalFlow_THelper.id(),"BoardInternalSignalFlow_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("boardname", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ccList", subnetworkConnection.CrossConnectList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final extendedManagedElementManager.BoardInternalSignalFlow_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static extendedManagedElementManager.BoardInternalSignalFlow_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org.fiberhome.extended/extendedManagedElementManager/BoardInternalSignalFlow_T:1.0";
	}
	public static extendedManagedElementManager.BoardInternalSignalFlow_T read (final org.omg.CORBA.portable.InputStream in)
	{
		extendedManagedElementManager.BoardInternalSignalFlow_T result = new extendedManagedElementManager.BoardInternalSignalFlow_T();
		result.boardname=in.read_string();
		result.ccList = subnetworkConnection.CrossConnectList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final extendedManagedElementManager.BoardInternalSignalFlow_T s)
	{
		out.write_string(s.boardname);
		subnetworkConnection.CrossConnectList_THelper.write(out,s.ccList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
