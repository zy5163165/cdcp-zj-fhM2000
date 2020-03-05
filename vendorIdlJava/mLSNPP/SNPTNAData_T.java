package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPTNAData_T(){}
	public java.lang.String sNPPId = "";
	public short layerRate;
	public java.lang.String rAId = "";
	public mLSNPP.SNPTNAPair_T[] sNPTNAPairList;
	public SNPTNAData_T(java.lang.String sNPPId, short layerRate, java.lang.String rAId, mLSNPP.SNPTNAPair_T[] sNPTNAPairList)
	{
		this.sNPPId = sNPPId;
		this.layerRate = layerRate;
		this.rAId = rAId;
		this.sNPTNAPairList = sNPTNAPairList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNPTNAData_T");
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
		textStruct.append("sNPTNAPairList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <sNPTNAPairList.length; mem3++){
			textStruct.append(sNPTNAPairList[mem3]);
			if(mem3 < sNPTNAPairList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
