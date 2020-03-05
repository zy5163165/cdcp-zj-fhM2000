package managedElement;

/**
 *	Generated from IDL definition of struct "ManagedElement_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ManagedElement_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String location = "";
	public java.lang.String version = "";
	public java.lang.String productName = "";
	public managedElement.CommunicationState_T communicationState;
	public boolean emsInSyncState;
	public short[] supportedRates;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ManagedElement_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String location, java.lang.String version, java.lang.String productName, managedElement.CommunicationState_T communicationState, boolean emsInSyncState, short[] supportedRates, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.location = location;
		this.version = version;
		this.productName = productName;
		this.communicationState = communicationState;
		this.emsInSyncState = emsInSyncState;
		this.supportedRates = supportedRates;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ManagedElement_T");
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
		textStruct.append("location=");
		textStruct.append(location);
		textStruct.append(","); 
		textStruct.append("version=");
		textStruct.append(version);
		textStruct.append(","); 
		textStruct.append("productName=");
		textStruct.append(productName);
		textStruct.append(","); 
		textStruct.append("communicationState=");
		textStruct.append(communicationState);
		textStruct.append(","); 
		textStruct.append("emsInSyncState=");
		textStruct.append(emsInSyncState);
		textStruct.append(","); 
		textStruct.append("supportedRates=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <supportedRates.length; mem9++){
			textStruct.append(supportedRates[mem9]);
			if(mem9 < supportedRates.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <additionalInfo.length; mem10++){
			textStruct.append(additionalInfo[mem10]);
			if(mem10 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
