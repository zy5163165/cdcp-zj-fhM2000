package trafficDescriptor;

/**
 *	Generated from IDL definition of interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler 
 */


public interface TrafficDescriptorMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrafficDescriptors(int how_many, trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws globaldefs.ProcessingFailureException;
	void getAllTrafficDescriptorNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
	void getTrafficDescriptor(globaldefs.NameAndStringValue_T[] tdName, trafficDescriptor.TrafficDescriptor_THolder td) throws globaldefs.ProcessingFailureException;
	void getAssociatedCTPs(globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;
	void createTrafficDescriptor(trafficDescriptor.TDCreateData_T newTDCreateData, trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws globaldefs.ProcessingFailureException;
	void deleteTrafficDescriptor(globaldefs.NameAndStringValue_T[] descriptorName) throws globaldefs.ProcessingFailureException;
}
