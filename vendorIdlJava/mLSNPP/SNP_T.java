package mLSNPP;

/**
 *	Generated from IDL definition of struct "SNP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNP_T(){}
	public java.lang.String sNPId = "";
	public globaldefs.NameAndStringValue_T[] tPName;
	public java.lang.String tNAName;
	public SNP_T(java.lang.String sNPId, globaldefs.NameAndStringValue_T[] tPName, java.lang.String tNAName)
	{
		this.sNPId = sNPId;
		this.tPName = tPName;
		this.tNAName = tNAName;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SNP_T");
		textStruct.append("(");
		textStruct.append("sNPId=");
		textStruct.append(sNPId);
		textStruct.append(","); 
		textStruct.append("tPName=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <tPName.length; mem1++){
			textStruct.append(tPName[mem1]);
			if(mem1 < tPName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("tNAName=");
		textStruct.append(tNAName);
		textStruct.append(")");
		return textStruct.toString();
	}
}
