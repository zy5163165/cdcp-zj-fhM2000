package extendedEmsMgr;

/**
 *	Generated from IDL definition of struct "NamePair_T"
 *	@author JacORB IDL compiler 
 */

public final class NamePair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public NamePair_T(){}
	public globaldefs.NameAndStringValue_T[][] preName;
	public globaldefs.NameAndStringValue_T[][] afterName;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public NamePair_T(globaldefs.NameAndStringValue_T[][] preName, globaldefs.NameAndStringValue_T[][] afterName, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.preName = preName;
		this.afterName = afterName;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("NamePair_T");
		textStruct.append("(");
		textStruct.append("preName=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <preName.length; mem0++){
			textStruct.append("[");
			for(int mem0_ =0; mem0_ <preName[mem0].length; mem0_++){
				textStruct.append(preName[mem0][mem0_]);
				if(mem0_ < preName[mem0].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem0 < preName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("afterName=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <afterName.length; mem1++){
			textStruct.append("[");
			for(int mem1_ =0; mem1_ <afterName[mem1].length; mem1_++){
				textStruct.append(afterName[mem1][mem1_]);
				if(mem1_ < afterName[mem1].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem1 < afterName.length-1)
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
