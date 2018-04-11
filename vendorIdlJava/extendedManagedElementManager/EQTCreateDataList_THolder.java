package extendedManagedElementManager;

/**
 *	Generated from IDL definition of alias "EQTCreateDataList_T"
 *	@author JacORB IDL compiler 
 */

public final class EQTCreateDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public equipment.EQTCreateData_T[] value;

	public EQTCreateDataList_THolder ()
	{
	}
	public EQTCreateDataList_THolder (final equipment.EQTCreateData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EQTCreateDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EQTCreateDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EQTCreateDataList_THelper.write (out,value);
	}
}
