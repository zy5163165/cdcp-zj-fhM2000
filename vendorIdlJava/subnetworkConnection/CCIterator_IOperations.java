package subnetworkConnection;

/**
 *	Generated from IDL definition of interface "CCIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface CCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, subnetworkConnection.CrossConnectList_THolder ccList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
