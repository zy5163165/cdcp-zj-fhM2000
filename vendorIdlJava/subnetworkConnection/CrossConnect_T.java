package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "CrossConnect_T"
 *	@author JacORB IDL compiler 
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CrossConnect_T(){}
	public boolean active;
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.SNCType_T ccType;
	public globaldefs.NameAndStringValue_T[][] aEndNameList;
	public globaldefs.NameAndStringValue_T[][] zEndNameList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, globaldefs.ConnectionDirection_T direction, subnetworkConnection.SNCType_T ccType, globaldefs.NameAndStringValue_T[][] aEndNameList, globaldefs.NameAndStringValue_T[][] zEndNameList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("CrossConnect_T");
		textStruct.append("(");
		textStruct.append("active=");
		textStruct.append(active);
		textStruct.append(","); 
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("ccType=");
		textStruct.append(ccType);
		textStruct.append(","); 
		textStruct.append("aEndNameList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <aEndNameList.length; mem3++){
			textStruct.append("[");
			for(int mem3_ =0; mem3_ <aEndNameList[mem3].length; mem3_++){
				textStruct.append(aEndNameList[mem3][mem3_]);
				if(mem3_ < aEndNameList[mem3].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem3 < aEndNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEndNameList=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <zEndNameList.length; mem4++){
			textStruct.append("[");
			for(int mem4_ =0; mem4_ <zEndNameList[mem4].length; mem4_++){
				textStruct.append(zEndNameList[mem4][mem4_]);
				if(mem4_ < zEndNameList[mem4].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem4 < zEndNameList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalInfo.length; mem5++){
			textStruct.append(additionalInfo[mem5]);
			if(mem5 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
