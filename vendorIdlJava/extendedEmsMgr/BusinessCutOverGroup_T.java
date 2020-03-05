package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "BusinessCutOverGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessCutOverGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BusinessCutOverGroup_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public java.lang.String userLabel = "";
	public extendedEmsMgr.NamePair_T[] businessCutOverSncList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BusinessCutOverGroup_T(globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, java.lang.String userLabel, extendedEmsMgr.NamePair_T[] businessCutOverSncList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.userLabel = userLabel;
		this.businessCutOverSncList = businessCutOverSncList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BusinessCutOverGroup_T");
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
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("businessCutOverSncList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <businessCutOverSncList.length; mem3++){
			textStruct.append(businessCutOverSncList[mem3]);
			if(mem3 < businessCutOverSncList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
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
