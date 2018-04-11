package ipMgrCMCC;

/**
 *	Generated from IDL definition of struct "FRRProtection_T"
 *	@author JacORB IDL compiler 
 */

public final class FRRProtection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FRRProtection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String protectionType = "";
	public short rate;
	public globaldefs.NameAndStringValue_T[][] tpList;
	public globaldefs.NameAndStringValue_T[] frrParameters;
	public globaldefs.NameAndStringValue_T[] bindingObject;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public FRRProtection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String protectionType, short rate, globaldefs.NameAndStringValue_T[][] tpList, globaldefs.NameAndStringValue_T[] frrParameters, globaldefs.NameAndStringValue_T[] bindingObject, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.protectionType = protectionType;
		this.rate = rate;
		this.tpList = tpList;
		this.frrParameters = frrParameters;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FRRProtection_T");
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
		textStruct.append("protectionType=");
		textStruct.append(protectionType);
		textStruct.append(","); 
		textStruct.append("rate=");
		textStruct.append(rate);
		textStruct.append(","); 
		textStruct.append("tpList=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <tpList.length; mem6++){
			textStruct.append("[");
			for(int mem6_ =0; mem6_ <tpList[mem6].length; mem6_++){
				textStruct.append(tpList[mem6][mem6_]);
				if(mem6_ < tpList[mem6].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem6 < tpList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("frrParameters=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <frrParameters.length; mem7++){
			textStruct.append(frrParameters[mem7]);
			if(mem7 < frrParameters.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("bindingObject=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <bindingObject.length; mem8++){
			textStruct.append(bindingObject[mem8]);
			if(mem8 < bindingObject.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <additionalInfo.length; mem9++){
			textStruct.append(additionalInfo[mem9]);
			if(mem9 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
