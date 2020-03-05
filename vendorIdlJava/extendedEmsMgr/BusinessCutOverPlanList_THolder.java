package extendedEmsMgr;

/**
 *	Generated from IDL definition of alias "BusinessCutOverPlanList_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverPlanList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedEmsMgr.BusinessCutOverPlan_T[] value;

	public BusinessCutOverPlanList_THolder ()
	{
	}
	public BusinessCutOverPlanList_THolder (final extendedEmsMgr.BusinessCutOverPlan_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BusinessCutOverPlanList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BusinessCutOverPlanList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BusinessCutOverPlanList_THelper.write (out,value);
	}
}
