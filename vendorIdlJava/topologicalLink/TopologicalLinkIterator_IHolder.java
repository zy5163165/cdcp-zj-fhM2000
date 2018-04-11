package topologicalLink;

/**
 *	Generated from IDL definition of interface "TopologicalLinkIterator_I"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TopologicalLinkIterator_I value;
	public TopologicalLinkIterator_IHolder ()
	{
	}
	public TopologicalLinkIterator_IHolder (final TopologicalLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopologicalLinkIterator_IHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopologicalLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TopologicalLinkIterator_IHelper.write (_out,value);
	}
}
