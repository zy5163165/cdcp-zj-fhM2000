package multiLayerSubnetwork;

/**
 *	Generated from IDL definition of interface "SubnetworkIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface SubnetworkIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, multiLayerSubnetwork.SubnetworkList_THolder subnetworkList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
