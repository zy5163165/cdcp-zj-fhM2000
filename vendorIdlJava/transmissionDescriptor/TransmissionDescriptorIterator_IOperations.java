package transmissionDescriptor;

/**
 *	Generated from IDL definition of interface "TransmissionDescriptorIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TransmissionDescriptorIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
