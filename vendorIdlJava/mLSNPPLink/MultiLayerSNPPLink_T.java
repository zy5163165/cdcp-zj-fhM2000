package mLSNPPLink;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSNPPLink_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public globaldefs.ConnectionDirection_T direction;
	public globaldefs.NameAndStringValue_T[] aMLRAName;
	public globaldefs.NameAndStringValue_T[] zMLRAName;
	public java.lang.String aTNAName = "";
	public java.lang.String zTNAName = "";
	public java.lang.String aTNAGroupName = "";
	public java.lang.String zTNAGroupName = "";
	public mLSNPPLink.LayeredSNPPLink_T[] sNPPLinkList;
	public java.lang.String interfaceType;
	public globaldefs.NameAndStringValue_T[] signallingParameters;
	public java.lang.String signallingControllerIdentifier = "";
	public java.lang.String signallingProtocol;
	public boolean signallingEnabled;
	public globaldefs.NameAndStringValue_T[] cost;
	public boolean discovered;
	public globaldefs.NameAndStringValue_T[] availability;
	public java.lang.String linkSRG = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSNPPLink_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, globaldefs.ConnectionDirection_T direction, globaldefs.NameAndStringValue_T[] aMLRAName, globaldefs.NameAndStringValue_T[] zMLRAName, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, mLSNPPLink.LayeredSNPPLink_T[] sNPPLinkList, java.lang.String interfaceType, globaldefs.NameAndStringValue_T[] signallingParameters, java.lang.String signallingControllerIdentifier, java.lang.String signallingProtocol, boolean signallingEnabled, globaldefs.NameAndStringValue_T[] cost, boolean discovered, globaldefs.NameAndStringValue_T[] availability, java.lang.String linkSRG, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.aMLRAName = aMLRAName;
		this.zMLRAName = zMLRAName;
		this.aTNAName = aTNAName;
		this.zTNAName = zTNAName;
		this.aTNAGroupName = aTNAGroupName;
		this.zTNAGroupName = zTNAGroupName;
		this.sNPPLinkList = sNPPLinkList;
		this.interfaceType = interfaceType;
		this.signallingParameters = signallingParameters;
		this.signallingControllerIdentifier = signallingControllerIdentifier;
		this.signallingProtocol = signallingProtocol;
		this.signallingEnabled = signallingEnabled;
		this.cost = cost;
		this.discovered = discovered;
		this.availability = availability;
		this.linkSRG = linkSRG;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MultiLayerSNPPLink_T");
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
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("nativeEMSName=");
		textStruct.append(nativeEMSName);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("aMLRAName=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <aMLRAName.length; mem5++){
			textStruct.append(aMLRAName[mem5]);
			if(mem5 < aMLRAName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zMLRAName=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <zMLRAName.length; mem6++){
			textStruct.append(zMLRAName[mem6]);
			if(mem6 < zMLRAName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("aTNAName=");
		textStruct.append(aTNAName);
		textStruct.append(","); 
		textStruct.append("zTNAName=");
		textStruct.append(zTNAName);
		textStruct.append(","); 
		textStruct.append("aTNAGroupName=");
		textStruct.append(aTNAGroupName);
		textStruct.append(","); 
		textStruct.append("zTNAGroupName=");
		textStruct.append(zTNAGroupName);
		textStruct.append(","); 
		textStruct.append("sNPPLinkList=");
		textStruct.append("[");
		for(int mem11 =0; mem11 <sNPPLinkList.length; mem11++){
			textStruct.append(sNPPLinkList[mem11]);
			if(mem11 < sNPPLinkList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("interfaceType=");
		textStruct.append(interfaceType);
		textStruct.append(","); 
		textStruct.append("signallingParameters=");
		textStruct.append("[");
		for(int mem13 =0; mem13 <signallingParameters.length; mem13++){
			textStruct.append(signallingParameters[mem13]);
			if(mem13 < signallingParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("signallingControllerIdentifier=");
		textStruct.append(signallingControllerIdentifier);
		textStruct.append(","); 
		textStruct.append("signallingProtocol=");
		textStruct.append(signallingProtocol);
		textStruct.append(","); 
		textStruct.append("signallingEnabled=");
		textStruct.append(signallingEnabled);
		textStruct.append(","); 
		textStruct.append("cost=");
		textStruct.append("[");
		for(int mem17 =0; mem17 <cost.length; mem17++){
			textStruct.append(cost[mem17]);
			if(mem17 < cost.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("discovered=");
		textStruct.append(discovered);
		textStruct.append(","); 
		textStruct.append("availability=");
		textStruct.append("[");
		for(int mem19 =0; mem19 <availability.length; mem19++){
			textStruct.append(availability[mem19]);
			if(mem19 < availability.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("linkSRG=");
		textStruct.append(linkSRG);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem21 =0; mem21 <additionalInfo.length; mem21++){
			textStruct.append(additionalInfo[mem21]);
			if(mem21 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
