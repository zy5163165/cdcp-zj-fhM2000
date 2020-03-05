package transmissionDescriptor;

/**
 *	Generated from IDL definition of struct "TransmissionDescriptor_T"
 *	@author JacORB IDL compiler 
 */

public final class TransmissionDescriptor_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TransmissionDescriptor_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T[] transmissionParams;
	public globaldefs.NameAndStringValue_T[] additionalTPInfo;
	public globaldefs.NameAndStringValue_T[] containingTMDName;
	public java.lang.String externalRepresentationReference = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TransmissionDescriptor_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, transmissionParameters.LayeredParameters_T[] transmissionParams, globaldefs.NameAndStringValue_T[] additionalTPInfo, globaldefs.NameAndStringValue_T[] containingTMDName, java.lang.String externalRepresentationReference, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.additionalTPInfo = additionalTPInfo;
		this.containingTMDName = containingTMDName;
		this.externalRepresentationReference = externalRepresentationReference;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TransmissionDescriptor_T");
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
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <transmissionParams.length; mem4++){
			textStruct.append(transmissionParams[mem4]);
			if(mem4 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalTPInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalTPInfo.length; mem5++){
			textStruct.append(additionalTPInfo[mem5]);
			if(mem5 < additionalTPInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("containingTMDName=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <containingTMDName.length; mem6++){
			textStruct.append(containingTMDName[mem6]);
			if(mem6 < containingTMDName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("externalRepresentationReference=");
		textStruct.append(externalRepresentationReference);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <additionalInfo.length; mem8++){
			textStruct.append(additionalInfo[mem8]);
			if(mem8 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
