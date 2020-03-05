package aSAP;

/**
 *	Generated from IDL definition of struct "AlarmSeverityAssignment_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmSeverityAssignment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmSeverityAssignment_T(){}
	public java.lang.String probableCause = "";
	public java.lang.String probableCauseQualifier = "";
	public java.lang.String nativeProbableCause = "";
	public aSAP.AssignedSeverity_T serviceAffecting;
	public aSAP.AssignedSeverity_T serviceNonAffecting;
	public aSAP.AssignedSeverity_T serviceIndependentOrUnknown;
	public AlarmSeverityAssignment_T(java.lang.String probableCause, java.lang.String probableCauseQualifier, java.lang.String nativeProbableCause, aSAP.AssignedSeverity_T serviceAffecting, aSAP.AssignedSeverity_T serviceNonAffecting, aSAP.AssignedSeverity_T serviceIndependentOrUnknown)
	{
		this.probableCause = probableCause;
		this.probableCauseQualifier = probableCauseQualifier;
		this.nativeProbableCause = nativeProbableCause;
		this.serviceAffecting = serviceAffecting;
		this.serviceNonAffecting = serviceNonAffecting;
		this.serviceIndependentOrUnknown = serviceIndependentOrUnknown;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("AlarmSeverityAssignment_T");
		textStruct.append("(");
		textStruct.append("probableCause=");
		textStruct.append(probableCause);
		textStruct.append(","); 
		textStruct.append("probableCauseQualifier=");
		textStruct.append(probableCauseQualifier);
		textStruct.append(","); 
		textStruct.append("nativeProbableCause=");
		textStruct.append(nativeProbableCause);
		textStruct.append(","); 
		textStruct.append("serviceAffecting=");
		textStruct.append(serviceAffecting);
		textStruct.append(","); 
		textStruct.append("serviceNonAffecting=");
		textStruct.append(serviceNonAffecting);
		textStruct.append(","); 
		textStruct.append("serviceIndependentOrUnknown=");
		textStruct.append(serviceIndependentOrUnknown);
		textStruct.append(")");
		return textStruct.toString();
	}
}
