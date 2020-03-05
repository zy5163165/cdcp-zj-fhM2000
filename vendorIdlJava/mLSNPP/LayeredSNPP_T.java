package mLSNPP;

/**
 *	Generated from IDL definition of struct "LayeredSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredSNPP_T(){}
	public short layerRate;
	public mLSNPP.SNPP_T[] SNPPList;
	public LayeredSNPP_T(short layerRate, mLSNPP.SNPP_T[] SNPPList)
	{
		this.layerRate = layerRate;
		this.SNPPList = SNPPList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("LayeredSNPP_T");
		textStruct.append("(");
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("SNPPList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <SNPPList.length; mem1++){
			textStruct.append(SNPPList[mem1]);
			if(mem1 < SNPPList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
