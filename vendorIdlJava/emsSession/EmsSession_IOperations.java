package emsSession;

/**
 *	Generated from IDL definition of interface "EmsSession_I"
 *	@author JacORB IDL compiler 
 */


public interface EmsSession_IOperations
	extends session.Session_IOperations
{
	/* constants */
	/* operations  */
	void getSupportedManagers(emsSession.EmsSession_IPackage.managerNames_THolder supportedManagerList) throws globaldefs.ProcessingFailureException;
	void getManager(java.lang.String managerName, common.Common_IHolder managerInterface) throws globaldefs.ProcessingFailureException;
	void getEventChannel(org.omg.CosNotifyChannelAdmin.EventChannelHolder eventChannel) throws globaldefs.ProcessingFailureException;
}
