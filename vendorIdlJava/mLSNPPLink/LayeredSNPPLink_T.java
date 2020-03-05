package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "LayeredSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredSNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredSNPPLink_T(){}
	public short layerRate;
	public mLSNPPLink.SNPPLink_T[] sNPPLinkList;
	public LayeredSNPPLink_T(short layerRate, mLSNPPLink.SNPPLink_T[] sNPPLinkList)
	{
		this.layerRate = layerRate;
		this.sNPPLinkList = sNPPLinkList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("LayeredSNPPLink_T");
		textStruct.append("(");
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("sNPPLinkList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <sNPPLinkList.length; mem1++){
			textStruct.append(sNPPLinkList[mem1]);
			if(mem1 < sNPPLinkList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
