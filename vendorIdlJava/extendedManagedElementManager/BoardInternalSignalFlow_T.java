package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "BoardInternalSignalFlow_T"
 *	@author JacORB IDL compiler 
 */

public final class BoardInternalSignalFlow_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public BoardInternalSignalFlow_T(){}
	public java.lang.String boardname = "";
	public subnetworkConnection.CrossConnect_T[] ccList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public BoardInternalSignalFlow_T(java.lang.String boardname, subnetworkConnection.CrossConnect_T[] ccList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.boardname = boardname;
		this.ccList = ccList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("BoardInternalSignalFlow_T");
		textStruct.append("(");
		textStruct.append("boardname=");
		textStruct.append(boardname);
		textStruct.append(","); 
		textStruct.append("ccList=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <ccList.length; mem1++){
			textStruct.append(ccList[mem1]);
			if(mem1 < ccList.length-1)
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
