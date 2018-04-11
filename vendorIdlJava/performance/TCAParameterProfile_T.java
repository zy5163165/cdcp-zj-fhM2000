package performance;

/**
 *	Generated from IDL definition of struct "TCAParameterProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class TCAParameterProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAParameterProfile_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public short layerRate;
	public performance.TCAParameter_T[] tcaParameterList;
	public TCAParameterProfile_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.NameAndStringValue_T[] additionalInfo, short layerRate, performance.TCAParameter_T[] tcaParameterList)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.additionalInfo = additionalInfo;
		this.layerRate = layerRate;
		this.tcaParameterList = tcaParameterList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TCAParameterProfile_T");
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
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <additionalInfo.length; mem4++){
			textStruct.append(additionalInfo[mem4]);
			if(mem4 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("tcaParameterList=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <tcaParameterList.length; mem6++){
			textStruct.append(tcaParameterList[mem6]);
			if(mem6 < tcaParameterList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
