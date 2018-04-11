package extendedEmsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL definition of interface "EXMegEntityDataIterator_I"
 *	@author JacORB IDL compiler 
 */

public class EXMegEntityDataIterator_IPOATie
	extends EXMegEntityDataIterator_IPOA
{
	private EXMegEntityDataIterator_IOperations _delegate;

	private POA _poa;
	public EXMegEntityDataIterator_IPOATie(EXMegEntityDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EXMegEntityDataIterator_IPOATie(EXMegEntityDataIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public extendedEmsMgr.EXMegEntityDataIterator_I _this()
	{
		return extendedEmsMgr.EXMegEntityDataIterator_IHelper.narrow(_this_object());
	}
	public extendedEmsMgr.EXMegEntityDataIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return extendedEmsMgr.EXMegEntityDataIterator_IHelper.narrow(_this_object(orb));
	}
	public EXMegEntityDataIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EXMegEntityDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public int getLength() throws globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, extendedEmsMgr.EXMegEntityDataList_THolder megList) throws globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,megList);
	}

	public void destroy() throws globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
