package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "ProfileAssignTask_T"
 *	@author JacORB IDL compiler 
 */

public final class ProfileAssignTask_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ProfileAssignTask_T(){}
	public globaldefs.NameAndStringValue_T[] profileName;
	public globaldefs.NameAndStringValue_T[][] entityNames;
	public short layer;
	public java.lang.String dataType = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public ProfileAssignTask_T(globaldefs.NameAndStringValue_T[] profileName, globaldefs.NameAndStringValue_T[][] entityNames, short layer, java.lang.String dataType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.profileName = profileName;
		this.entityNames = entityNames;
		this.layer = layer;
		this.dataType = dataType;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("ProfileAssignTask_T");
		textStruct.append("(");
		textStruct.append("profileName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <profileName.length; mem0++){
			textStruct.append(profileName[mem0]);
			if(mem0 < profileName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("entityNames=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <entityNames.length; mem1++){
			textStruct.append("[");
			for(int mem1_ =0; mem1_ <entityNames[mem1].length; mem1_++){
				textStruct.append(entityNames[mem1][mem1_]);
				if(mem1_ < entityNames[mem1].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem1 < entityNames.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("layer=");
		textStruct.append(layer);
		textStruct.append(","); 
		textStruct.append("dataType=");
		textStruct.append(dataType);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <additionalInfo.length; mem4++){
			textStruct.append(additionalInfo[mem4]);
			if(mem4 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
