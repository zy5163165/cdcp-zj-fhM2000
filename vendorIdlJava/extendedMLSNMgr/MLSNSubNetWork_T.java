package extendedMLSNMgr;

/**
 *	Generated from IDL definition of struct "MLSNSubNetWork_T"
 *	@author JacORB IDL compiler 
 */

public final class MLSNSubNetWork_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MLSNSubNetWork_T(){}
	public globaldefs.NameAndStringValue_T[] MLSNname;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String MLSN_ProtectType = "";
	public java.lang.String MaxCapability = "";
	public topologicalLink.TopologicalLink_T[] mainList;
	public topologicalLink.TopologicalLink_T[] backupList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MLSNSubNetWork_T(globaldefs.NameAndStringValue_T[] MLSNname, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String MLSN_ProtectType, java.lang.String MaxCapability, topologicalLink.TopologicalLink_T[] mainList, topologicalLink.TopologicalLink_T[] backupList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.MLSNname = MLSNname;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.MLSN_ProtectType = MLSN_ProtectType;
		this.MaxCapability = MaxCapability;
		this.mainList = mainList;
		this.backupList = backupList;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MLSNSubNetWork_T");
		textStruct.append("(");
		textStruct.append("MLSNname=");
		textStruct.append("[");
		for(int mem0 =0; mem0 <MLSNname.length; mem0++){
			textStruct.append(MLSNname[mem0]);
			if(mem0 < MLSNname.length-1)
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
		textStruct.append("MLSN_ProtectType=");
		textStruct.append(MLSN_ProtectType);
		textStruct.append(","); 
		textStruct.append("MaxCapability=");
		textStruct.append(MaxCapability);
		textStruct.append(","); 
		textStruct.append("mainList=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <mainList.length; mem6++){
			textStruct.append(mainList[mem6]);
			if(mem6 < mainList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("backupList=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <backupList.length; mem7++){
			textStruct.append(backupList[mem7]);
			if(mem7 < backupList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem8 =0; mem8 <additionalInfo.length; mem8++){
			textStruct.append(additionalInfo[mem8]);
			if(mem8 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
