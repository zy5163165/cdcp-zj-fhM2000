package topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalLink_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public short rate;
	public globaldefs.NameAndStringValue_T[] aEndTP;
	public globaldefs.NameAndStringValue_T[] zEndTP;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalLink_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, short rate, globaldefs.NameAndStringValue_T[] aEndTP, globaldefs.NameAndStringValue_T[] zEndTP, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TopologicalLink_T");
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
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("rate=");
		textStruct.append(rate);
		textStruct.append(","); 
		textStruct.append("aEndTP=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <aEndTP.length; mem6++){
			textStruct.append(aEndTP[mem6]);
			if(mem6 < aEndTP.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEndTP=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <zEndTP.length; mem7++){
			textStruct.append(zEndTP[mem7]);
			if(mem7 < zEndTP.length-1)
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
