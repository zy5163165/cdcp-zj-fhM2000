package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPPLink_T(){}
	public java.lang.String SNPPLinkId = "";
	public mLSNPP.SNPP_T aEnd;
	public mLSNPP.SNPP_T zEnd;
	public SNPPLink_T(java.lang.String SNPPLinkId, mLSNPP.SNPP_T aEnd, mLSNPP.SNPP_T zEnd)
	{
		this.SNPPLinkId = SNPPLinkId;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNPPLink_T");
		textStruct.append("(");
		textStruct.append("SNPPLinkId=");
		textStruct.append(SNPPLinkId);
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append(aEnd);
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append(zEnd);
		textStruct.append(")");
		return textStruct.toString();
	}
}
