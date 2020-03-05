package subnetworkConnection;

/**
 *	Generated from IDL definition of interface "SNCIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface SNCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
