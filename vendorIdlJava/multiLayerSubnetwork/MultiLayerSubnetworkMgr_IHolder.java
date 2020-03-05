package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSubnetworkMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MultiLayerSubnetworkMgr_I value;
	public MultiLayerSubnetworkMgr_IHolder ()
	{
	}
	public MultiLayerSubnetworkMgr_IHolder (final MultiLayerSubnetworkMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MultiLayerSubnetworkMgr_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MultiLayerSubnetworkMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MultiLayerSubnetworkMgr_IHelper.write (_out,value);
	}
}
