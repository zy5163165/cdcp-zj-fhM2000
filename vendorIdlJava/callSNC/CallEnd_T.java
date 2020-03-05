package callSNC;

/**
 *	Generated from IDL definition of struct "CallEnd_T"
 *	@author JacORB IDL compiler 
 */

public final class CallEnd_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallEnd_T(){}
	public java.lang.String tNANameOrGroupTNAName;
	public java.lang.String sNPPid = "";
	public java.lang.String sNPid = "";
	public globaldefs.NameAndStringValue_T[] tpName;
	public CallEnd_T(java.lang.String tNANameOrGroupTNAName, java.lang.String sNPPid, java.lang.String sNPid, globaldefs.NameAndStringValue_T[] tpName)
	{
		this.tNANameOrGroupTNAName = tNANameOrGroupTNAName;
		this.sNPPid = sNPPid;
		this.sNPid = sNPid;
		this.tpName = tpName;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CallEnd_T");
		textStruct.append("(");
		textStruct.append("tNANameOrGroupTNAName=");
		textStruct.append(tNANameOrGroupTNAName);
		textStruct.append(","); 
		textStruct.append("sNPPid=");
		textStruct.append(sNPPid);
		textStruct.append(","); 
		textStruct.append("sNPid=");
		textStruct.append(sNPid);
		textStruct.append(","); 
		textStruct.append("tpName=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <tpName.length; mem3++){
			textStruct.append(tpName[mem3]);
			if(mem3 < tpName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
