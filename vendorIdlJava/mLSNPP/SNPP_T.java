package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPP_T(){}
	public java.lang.String sNPPId = "";
	public mLSNPP.SNP_T[] sNPList;
	public java.lang.String tNAName;
	public java.lang.String groupTNAName;
	public java.lang.String rAId = "";
	public SNPP_T(java.lang.String sNPPId, mLSNPP.SNP_T[] sNPList, java.lang.String tNAName, java.lang.String groupTNAName, java.lang.String rAId)
	{
		this.sNPPId = sNPPId;
		this.sNPList = sNPList;
		this.tNAName = tNAName;
		this.groupTNAName = groupTNAName;
		this.rAId = rAId;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNPP_T");
		textStruct.append("(");
		textStruct.append("sNPPId=");
		textStruct.append(sNPPId);
		textStruct.append(","); 
		textStruct.append("sNPList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <sNPList.length; mem1++){
			textStruct.append(sNPList[mem1]);
			if(mem1 < sNPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tNAName=");
		textStruct.append(tNAName);
		textStruct.append(","); 
		textStruct.append("groupTNAName=");
		textStruct.append(groupTNAName);
		textStruct.append(","); 
		textStruct.append("rAId=");
		textStruct.append(rAId);
		textStruct.append(")");
		return textStruct.toString();
	}
}
