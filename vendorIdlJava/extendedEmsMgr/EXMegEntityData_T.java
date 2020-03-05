package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "EXMegEntityData_T"
 *	@author JacORB IDL compiler 
 */

public final class EXMegEntityData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EXMegEntityData_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public subnetworkConnection.TPData_T[] mepTPList;
	public subnetworkConnection.TPData_T[] mipTPList;
	public globaldefs.NameAndStringValue_T[][] associatePathNames;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public EXMegEntityData_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, transmissionParameters.LayeredParameters_T transmissionParams, subnetworkConnection.TPData_T[] mepTPList, subnetworkConnection.TPData_T[] mipTPList, globaldefs.NameAndStringValue_T[][] associatePathNames, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.mepTPList = mepTPList;
		this.mipTPList = mipTPList;
		this.associatePathNames = associatePathNames;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("EXMegEntityData_T");
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
		textStruct.append(transmissionParams);
		textStruct.append(","); 
		textStruct.append("mepTPList=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <mepTPList.length; mem5++){
			textStruct.append(mepTPList[mem5]);
			if(mem5 < mepTPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("mipTPList=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <mipTPList.length; mem6++){
			textStruct.append(mipTPList[mem6]);
			if(mem6 < mipTPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("associatePathNames=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <associatePathNames.length; mem7++){
			textStruct.append("[");
			for(int mem7_ =0; mem7_ <associatePathNames[mem7].length; mem7_++){
				textStruct.append(associatePathNames[mem7][mem7_]);
				if(mem7_ < associatePathNames[mem7].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem7 < associatePathNames.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
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
