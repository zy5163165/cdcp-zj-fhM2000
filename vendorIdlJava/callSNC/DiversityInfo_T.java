package callSNC;

/**
 *	Generated from IDL definition of struct "DiversityInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class DiversityInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public DiversityInfo_T(){}
	public java.lang.String sRGType = "";
	public callSNC.SharedResource_T[] sharedResourceList;
	public DiversityInfo_T(java.lang.String sRGType, callSNC.SharedResource_T[] sharedResourceList)
	{
		this.sRGType = sRGType;
		this.sharedResourceList = sharedResourceList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("DiversityInfo_T");
		textStruct.append("(");
		textStruct.append("sRGType=");
		textStruct.append(sRGType);
		textStruct.append(","); 
		textStruct.append("sharedResourceList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <sharedResourceList.length; mem1++){
			textStruct.append(sharedResourceList[mem1]);
			if(mem1 < sharedResourceList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
