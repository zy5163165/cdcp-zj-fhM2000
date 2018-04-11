package topologicalLink;

/**
 *	Generated from IDL definition of struct "TLCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TLCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TLCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public short rate;
	public globaldefs.NameAndStringValue_T[] aEndTP;
	public globaldefs.NameAndStringValue_T[] zEndTP;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public TLCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, globaldefs.ConnectionDirection_T direction, short rate, globaldefs.NameAndStringValue_T[] aEndTP, globaldefs.NameAndStringValue_T[] zEndTP, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.direction = direction;
		this.rate = rate;
		this.aEndTP = aEndTP;
		this.zEndTP = zEndTP;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TLCreateData_T");
		textStruct.append("(");
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
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
		for(int mem5 =0; mem5 <aEndTP.length; mem5++){
			textStruct.append(aEndTP[mem5]);
			if(mem5 < aEndTP.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEndTP=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <zEndTP.length; mem6++){
			textStruct.append(zEndTP[mem6]);
			if(mem6 < zEndTP.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalCreationInfo.length; mem7++){
			textStruct.append(additionalCreationInfo[mem7]);
			if(mem7 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
