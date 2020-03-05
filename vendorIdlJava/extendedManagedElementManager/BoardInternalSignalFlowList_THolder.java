package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "BoardInternalSignalFlowList_T"
 *	@author JacORB IDL compiler 
 */

public final class BoardInternalSignalFlowList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedManagedElementManager.BoardInternalSignalFlow_T[] value;

	public BoardInternalSignalFlowList_THolder ()
	{
	}
	public BoardInternalSignalFlowList_THolder (final extendedManagedElementManager.BoardInternalSignalFlow_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BoardInternalSignalFlowList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BoardInternalSignalFlowList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BoardInternalSignalFlowList_THelper.write (out,value);
	}
}
