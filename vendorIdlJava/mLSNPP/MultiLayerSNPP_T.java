package mLSNPP;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSNPP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public terminationPoint.Directionality_T direction;
	public mLSNPP.LayeredSNPP_T[] layeredSNPPList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSNPP_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, terminationPoint.Directionality_T direction, mLSNPP.LayeredSNPP_T[] layeredSNPPList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.layeredSNPPList = layeredSNPPList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MultiLayerSNPP_T");
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
		textStruct.append("layeredSNPPList=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <layeredSNPPList.length; mem5++){
			textStruct.append(layeredSNPPList[mem5]);
			if(mem5 < layeredSNPPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalInfo.length; mem6++){
			textStruct.append(additionalInfo[mem6]);
			if(mem6 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
