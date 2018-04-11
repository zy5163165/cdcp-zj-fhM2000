package callSNC;

/**
 *	Generated from IDL definition of struct "SharedResource_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResource_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SharedResource_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public globaldefs.NameAndStringValue_T[][] connectionNameList;
	public SharedResource_T(globaldefs.NameAndStringValue_T[] name, globaldefs.NameAndStringValue_T[][] connectionNameList)
	{
		this.name = name;
		this.connectionNameList = connectionNameList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("SharedResource_T");
		textStruct.append("(");
		textStruct.append("name=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <name.length; mem0++){
			textStruct.append(name[mem0]);
			if(mem0 < name.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("connectionNameList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <connectionNameList.length; mem1++){
			textStruct.append("[");
			for(int mem1_ =0; mem1_ <connectionNameList[mem1].length; mem1_++){
				textStruct.append(connectionNameList[mem1][mem1_]);
				if(mem1_ < connectionNameList[mem1].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem1 < connectionNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
