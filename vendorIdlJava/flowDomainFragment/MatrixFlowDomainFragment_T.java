package flowDomainFragment;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomainFragment_T(){}
	public globaldefs.ConnectionDirection_T direction;
	public transmissionParameters.LayeredParameters_T transmissionParams;
	public globaldefs.NameAndStringValue_T[][] aEnd;
	public globaldefs.NameAndStringValue_T[][] zEnd;
	public boolean flexible;
	public boolean active;
	public java.lang.String mfdfrType;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(globaldefs.ConnectionDirection_T direction, transmissionParameters.LayeredParameters_T transmissionParams, globaldefs.NameAndStringValue_T[][] aEnd, globaldefs.NameAndStringValue_T[][] zEnd, boolean flexible, boolean active, java.lang.String mfdfrType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.flexible = flexible;
		this.active = active;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("MatrixFlowDomainFragment_T");
		textStruct.append("(");
		textStruct.append("direction=");
		textStruct.append(direction);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append(transmissionParams);
		textStruct.append(","); 
		textStruct.append("aEnd=");
		textStruct.append("[");
		for(int mem2 =0; mem2 <aEnd.length; mem2++){
			textStruct.append("[");
			for(int mem2_ =0; mem2_ <aEnd[mem2].length; mem2_++){
				textStruct.append(aEnd[mem2][mem2_]);
				if(mem2_ < aEnd[mem2].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem2 < aEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("zEnd=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <zEnd.length; mem3++){
			textStruct.append("[");
			for(int mem3_ =0; mem3_ <zEnd[mem3].length; mem3_++){
				textStruct.append(zEnd[mem3][mem3_]);
				if(mem3_ < zEnd[mem3].length-1)
					textStruct.append(",");
			}
			textStruct.append("]");
			if(mem3 < zEnd.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("flexible=");
		textStruct.append(flexible);
		textStruct.append(","); 
		textStruct.append("active=");
		textStruct.append(active);
		textStruct.append(","); 
		textStruct.append("mfdfrType=");
		textStruct.append(mfdfrType);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem7 =0; mem7 <additionalInfo.length; mem7++){
			textStruct.append(additionalInfo[mem7]);
			if(mem7 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
