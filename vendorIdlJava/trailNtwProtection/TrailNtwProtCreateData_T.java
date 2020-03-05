package trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtCreateData_T(){}
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public globaldefs.NameAndStringValue_T[][] protectionTrail;
	public globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes;
	public TrailNtwProtCreateData_T(short rate, java.lang.String trailNtwProtectionType, globaldefs.NameAndStringValue_T[][][] workerTrailList, globaldefs.NameAndStringValue_T[][] protectionTrail, globaldefs.NameAndStringValue_T[] protectionGroupAName, globaldefs.NameAndStringValue_T[] protectionGroupZName, trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes)
	{
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.modifiableAttributes = modifiableAttributes;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("TrailNtwProtCreateData_T");
		textStruct.append("(");
		textStruct.append("rate=");
		textStruct.append(rate);
		textStruct.append(","); 
		textStruct.append("trailNtwProtectionType=");
		textStruct.append(trailNtwProtectionType);
		textStruct.append(","); 
		textStruct.append("workerTrailList=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <workerTrailList.length; mem2++){
			textStruct.append("[");
			for(int mem2_ =0; mem2_ <workerTrailList[mem2].length; mem2_++){
				textStruct.append("[");
				for(int mem2__ =0; mem2__ <workerTrailList[mem2][mem2_].length; mem2__++){
					textStruct.append(workerTrailList[mem2][mem2_][mem2__]);
					if(mem2__ < workerTrailList[mem2][mem2_].length-1)
						textStruct.append(",");
				}
				textStruct.append("]");
				if(mem2_ < workerTrailList[mem2].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem2 < workerTrailList.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectionTrail=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <protectionTrail.length; mem3++){
			textStruct.append("[");
			for(int mem3_ =0; mem3_ <protectionTrail[mem3].length; mem3_++){
				textStruct.append(protectionTrail[mem3][mem3_]);
				if(mem3_ < protectionTrail[mem3].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem3 < protectionTrail.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectionGroupAName=");
		textStruct.append("[");
		for(int mem4 =0; mem4 <protectionGroupAName.length; mem4++){
			textStruct.append(protectionGroupAName[mem4]);
			if(mem4 < protectionGroupAName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("protectionGroupZName=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <protectionGroupZName.length; mem5++){
			textStruct.append(protectionGroupZName[mem5]);
			if(mem5 < protectionGroupZName.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("modifiableAttributes=");
		textStruct.append(modifiableAttributes);
		textStruct.append(")");
		return textStruct.toString();
	}
}
