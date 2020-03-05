package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPTNAPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPPTNAPair_T(){}
	public java.lang.String sNPPId = "";
	public short layerRate;
	public java.lang.String rAId = "";
	public java.lang.String tNAName;
	public java.lang.String groupTNAName;
	public SNPPTNAPair_T(java.lang.String sNPPId, short layerRate, java.lang.String rAId, java.lang.String tNAName, java.lang.String groupTNAName)
	{
		this.sNPPId = sNPPId;
		this.layerRate = layerRate;
		this.rAId = rAId;
		this.tNAName = tNAName;
		this.groupTNAName = groupTNAName;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNPPTNAPair_T");
		textStruct.append("(");
		textStruct.append("sNPPId=");
		textStruct.append(sNPPId);
		textStruct.append(","); 
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("rAId=");
		textStruct.append(rAId);
		textStruct.append(","); 
		textStruct.append("tNAName=");
		textStruct.append(tNAName);
		textStruct.append(","); 
		textStruct.append("groupTNAName=");
		textStruct.append(groupTNAName);
		textStruct.append(")");
		return textStruct.toString();
	}
}
