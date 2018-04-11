package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "ClockLinkNet_T"
 *	@author JacORB IDL compiler 
 */

public final class ClockLinkNet_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ClockLinkNet_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[][] aEndMENameList;
	public globaldefs.NameAndStringValue_T[][] zEndMENameList;
	public java.lang.String synchroProtocol = "";
	public topologicalLink.TopologicalLink_T[] topoList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ClockLinkNet_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[][] aEndMENameList, globaldefs.NameAndStringValue_T[][] zEndMENameList, java.lang.String synchroProtocol, topologicalLink.TopologicalLink_T[] topoList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.aEndMENameList = aEndMENameList;
		this.zEndMENameList = zEndMENameList;
		this.synchroProtocol = synchroProtocol;
		this.topoList = topoList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ClockLinkNet_T");
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
		textStruct.append("aEndMENameList=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <aEndMENameList.length; mem4++){
			textStruct.append("[");
			for(int mem4_ =0; mem4_ <aEndMENameList[mem4].length; mem4_++){
				textStruct.append(aEndMENameList[mem4][mem4_]);
				if(mem4_ < aEndMENameList[mem4].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem4 < aEndMENameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEndMENameList=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <zEndMENameList.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <zEndMENameList[mem5].length; mem5_++){
				textStruct.append(zEndMENameList[mem5][mem5_]);
				if(mem5_ < zEndMENameList[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < zEndMENameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("synchroProtocol=");
		textStruct.append(synchroProtocol);
		textStruct.append(","); 
		textStruct.append("topoList=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <topoList.length; mem7++){
			textStruct.append(topoList[mem7]);
			if(mem7 < topoList.length-1)
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
