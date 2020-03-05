package extendedFlowDomainMgr;

/**
 *	Generated from IDL definition of alias "ExMatrixFlowDomainFragmentList_T"
 *	@author JacORB IDL compiler 
 */

public final class ExMatrixFlowDomainFragmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] value;

	public ExMatrixFlowDomainFragmentList_THolder ()
	{
	}
	public ExMatrixFlowDomainFragmentList_THolder (final extendedFlowDomainMgr.ExMatrixFlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ExMatrixFlowDomainFragmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ExMatrixFlowDomainFragmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ExMatrixFlowDomainFragmentList_THelper.write (out,value);
	}
}
