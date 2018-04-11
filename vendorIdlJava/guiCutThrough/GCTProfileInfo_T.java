package guiCutThrough;

/**
 *	Generated from IDL definition of struct "GCTProfileInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class GCTProfileInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public GCTProfileInfo_T(){}
	public guiCutThrough.ServerLaunchCapability_T serverLaunchCapability;
	public java.lang.String gctHostname = "";
	public java.lang.String emsGctPlatform = "";
	public guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList;
	public GCTProfileInfo_T(guiCutThrough.ServerLaunchCapability_T serverLaunchCapability, java.lang.String gctHostname, java.lang.String emsGctPlatform, guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList)
	{
		this.serverLaunchCapability = serverLaunchCapability;
		this.gctHostname = gctHostname;
		this.emsGctPlatform = emsGctPlatform;
		this.guiCutThroughDataList = guiCutThroughDataList;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("GCTProfileInfo_T");
		textStruct.append("(");
		textStruct.append("serverLaunchCapability=");
		textStruct.append(serverLaunchCapability);
		textStruct.append(","); 
		textStruct.append("gctHostname=");
		textStruct.append(gctHostname);
		textStruct.append(","); 
		textStruct.append("emsGctPlatform=");
		textStruct.append(emsGctPlatform);
		textStruct.append(","); 
		textStruct.append("guiCutThroughDataList=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <guiCutThroughDataList.length; mem3++){
			textStruct.append(guiCutThroughDataList[mem3]);
			if(mem3 < guiCutThroughDataList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
