package guiCutThrough;

/**
 *	Generated from IDL definition of struct "GuiCutThroughData_T"
 *	@author JacORB IDL compiler 
 */

public final class GuiCutThroughData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GuiCutThroughData_T(){}
	public java.lang.String gctScope = "";
	public java.lang.String gctContext = "";
	public java.lang.String gctCommand = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public GuiCutThroughData_T(java.lang.String gctScope, java.lang.String gctContext, java.lang.String gctCommand, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.gctScope = gctScope;
		this.gctContext = gctContext;
		this.gctCommand = gctCommand;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("GuiCutThroughData_T");
		textStruct.append("(");
		textStruct.append("gctScope=");
		textStruct.append(gctScope);
		textStruct.append(","); 
		textStruct.append("gctContext=");
		textStruct.append(gctContext);
		textStruct.append(","); 
		textStruct.append("gctCommand=");
		textStruct.append(gctCommand);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <additionalInfo.length; mem3++){
			textStruct.append(additionalInfo[mem3]);
			if(mem3 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
