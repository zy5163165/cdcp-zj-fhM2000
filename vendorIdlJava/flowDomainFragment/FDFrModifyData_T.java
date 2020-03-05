package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public performance.AdministrativeState_T administrativeState;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[][] tpNamesToRemove;
	public globaldefs.NameAndStringValue_T[][] aEndTPNames;
	public globaldefs.NameAndStringValue_T[][] zEndTPNames;
	public globaldefs.NameAndStringValue_T[][] internalTPNames;
	public globaldefs.NameAndStringValue_T[] additionalModificationInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, performance.AdministrativeState_T administrativeState, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[][] tpNamesToRemove, globaldefs.NameAndStringValue_T[][] aEndTPNames, globaldefs.NameAndStringValue_T[][] zEndTPNames, globaldefs.NameAndStringValue_T[][] internalTPNames, globaldefs.NameAndStringValue_T[] additionalModificationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.administrativeState = administrativeState;
		this.transmissionParams = transmissionParams;
		this.tpNamesToRemove = tpNamesToRemove;
		this.aEndTPNames = aEndTPNames;
		this.zEndTPNames = zEndTPNames;
		this.internalTPNames = internalTPNames;
		this.additionalModificationInfo = additionalModificationInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("FDFrModifyData_T");
		textStruct.append("(");
		textStruct.append("userLabel=");
		textStruct.append(userLabel);
		textStruct.append(","); 
		textStruct.append("forceUniqueness=");
		textStruct.append(forceUniqueness);
		textStruct.append(","); 
		textStruct.append("owner=");
		textStruct.append(owner);
		textStruct.append(","); 
		textStruct.append("networkAccessDomain=");
		textStruct.append(networkAccessDomain);
		textStruct.append(","); 
		textStruct.append("administrativeState=");
		textStruct.append(administrativeState);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append(transmissionParams);
		textStruct.append(","); 
		textStruct.append("tpNamesToRemove=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <tpNamesToRemove.length; mem6++){
			textStruct.append("[");
			for(int mem6_ =0; mem6_ <tpNamesToRemove[mem6].length; mem6_++){
				textStruct.append(tpNamesToRemove[mem6][mem6_]);
				if(mem6_ < tpNamesToRemove[mem6].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem6 < tpNamesToRemove.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("aEndTPNames=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <aEndTPNames.length; mem7++){
			textStruct.append("[");
			for(int mem7_ =0; mem7_ <aEndTPNames[mem7].length; mem7_++){
				textStruct.append(aEndTPNames[mem7][mem7_]);
				if(mem7_ < aEndTPNames[mem7].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem7 < aEndTPNames.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEndTPNames=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <zEndTPNames.length; mem8++){
			textStruct.append("[");
			for(int mem8_ =0; mem8_ <zEndTPNames[mem8].length; mem8_++){
				textStruct.append(zEndTPNames[mem8][mem8_]);
				if(mem8_ < zEndTPNames[mem8].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem8 < zEndTPNames.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("internalTPNames=");
		textStruct.append("[");
		for(int mem9 =0; mem9 <internalTPNames.length; mem9++){
			textStruct.append("[");
			for(int mem9_ =0; mem9_ <internalTPNames[mem9].length; mem9_++){
				textStruct.append(internalTPNames[mem9][mem9_]);
				if(mem9_ < internalTPNames[mem9].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem9 < internalTPNames.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalModificationInfo=");
		textStruct.append("[");
		for(int mem10 =0; mem10 <additionalModificationInfo.length; mem10++){
			textStruct.append(additionalModificationInfo[mem10]);
			if(mem10 < additionalModificationInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
