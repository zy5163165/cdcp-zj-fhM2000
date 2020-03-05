package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "BusinessPath_T"
 *	@author JacORB IDL compiler 
 */

public final class BusinessPath_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BusinessPath_T(){}
	public globaldefs.NameAndStringValue_T[] tpname;
	public extendedManagedElementManager.CCorTPL_T[] ccOrTplList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BusinessPath_T(globaldefs.NameAndStringValue_T[] tpname, extendedManagedElementManager.CCorTPL_T[] ccOrTplList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tpname = tpname;
		this.ccOrTplList = ccOrTplList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BusinessPath_T");
		textStruct.append("(");
		textStruct.append("tpname=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <tpname.length; mem0++){
			textStruct.append(tpname[mem0]);
			if(mem0 < tpname.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("ccOrTplList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <ccOrTplList.length; mem1++){
			textStruct.append(ccOrTplList[mem1]);
			if(mem1 < ccOrTplList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <additionalInfo.length; mem2++){
			textStruct.append(additionalInfo[mem2]);
			if(mem2 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
