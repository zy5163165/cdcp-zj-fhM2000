package terminationPoint;

/**
 *	Generated from IDL definition of struct "GTP_T"
 *	@author JacORB IDL compiler 
 */

public final class GTP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GTP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean alarmReportingIndicator;
	public globaldefs.NameAndStringValue_T[][] listOfTPs;
	public terminationPoint.TPConnectionState_T gtpConnectionState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public GTP_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean alarmReportingIndicator, globaldefs.NameAndStringValue_T[][] listOfTPs, terminationPoint.TPConnectionState_T gtpConnectionState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.alarmReportingIndicator = alarmReportingIndicator;
		this.listOfTPs = listOfTPs;
		this.gtpConnectionState = gtpConnectionState;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("GTP_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("alarmReportingIndicator=");
		textStruct.append(alarmReportingIndicator);
		textStruct.append(","); 
		textStruct.append("listOfTPs=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <listOfTPs.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <listOfTPs[mem5].length; mem5_++){
				textStruct.append(listOfTPs[mem5][mem5_]);
				if(mem5_ < listOfTPs[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < listOfTPs.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("gtpConnectionState=");
		textStruct.append(gtpConnectionState);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalInfo.length; mem7++){
			textStruct.append(additionalInfo[mem7]);
			if(mem7 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
