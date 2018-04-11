package subnetworkConnection;

/**
 *	Generated from IDL definition of struct "RouteCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteCreateData_T(){}
	public java.lang.String intended = "";
	public java.lang.String exclusive = "";
	public subnetworkConnection.CrossConnect_T[] ccInclusions;
	public globaldefs.NameAndStringValue_T[][] neTpInclusions;
	public boolean fullRoute;
	public globaldefs.NameAndStringValue_T[][] neTpSncExclusions;
	public globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public RouteCreateData_T(java.lang.String intended, java.lang.String exclusive, subnetworkConnection.CrossConnect_T[] ccInclusions, globaldefs.NameAndStringValue_T[][] neTpInclusions, boolean fullRoute, globaldefs.NameAndStringValue_T[][] neTpSncExclusions, globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.intended = intended;
		this.exclusive = exclusive;
		this.ccInclusions = ccInclusions;
		this.neTpInclusions = neTpInclusions;
		this.fullRoute = fullRoute;
		this.neTpSncExclusions = neTpSncExclusions;
		this.additionalCreationInfo = additionalCreationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("RouteCreateData_T");
		textStruct.append("(");
		textStruct.append("intended=");
		textStruct.append(intended);
		textStruct.append(","); 
		textStruct.append("exclusive=");
		textStruct.append(exclusive);
		textStruct.append(","); 
		textStruct.append("ccInclusions=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <ccInclusions.length; mem2++){
			textStruct.append(ccInclusions[mem2]);
			if(mem2 < ccInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("neTpInclusions=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <neTpInclusions.length; mem3++){
			textStruct.append("[");
			for(int mem3_ =0; mem3_ <neTpInclusions[mem3].length; mem3_++){
				textStruct.append(neTpInclusions[mem3][mem3_]);
				if(mem3_ < neTpInclusions[mem3].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem3 < neTpInclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("fullRoute=");
		textStruct.append(fullRoute);
		textStruct.append(","); 
		textStruct.append("neTpSncExclusions=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <neTpSncExclusions.length; mem5++){
			textStruct.append("[");
			for(int mem5_ =0; mem5_ <neTpSncExclusions[mem5].length; mem5_++){
				textStruct.append(neTpSncExclusions[mem5][mem5_]);
				if(mem5_ < neTpSncExclusions[mem5].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem5 < neTpSncExclusions.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalCreationInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalCreationInfo.length; mem6++){
			textStruct.append(additionalCreationInfo[mem6]);
			if(mem6 < additionalCreationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
