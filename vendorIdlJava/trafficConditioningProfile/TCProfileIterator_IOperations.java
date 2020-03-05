package trafficConditioningProfile;

/**
 *	Generated from IDL definition of interface "TCProfileIterator_I"
 *	@author JacORB IDL compiler 
 */


public interface TCProfileIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, trafficConditioningProfile.TCProfileList_THolder tcProfileList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
