package extendedManagedElementManager;

/**
 *	Generated from IDL definition of struct "LayeredCCCapacity_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredCCCapacity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredCCCapacity_T(){}
	public short layerRate;
	public short ingressPortsNum;
	public short egressPortsNum;
	public short totalPortdNum;
	public java.lang.String portsType = "";
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public LayeredCCCapacity_T(short layerRate, short ingressPortsNum, short egressPortsNum, short totalPortdNum, java.lang.String portsType, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.layerRate = layerRate;
		this.ingressPortsNum = ingressPortsNum;
		this.egressPortsNum = egressPortsNum;
		this.totalPortdNum = totalPortdNum;
		this.portsType = portsType;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("LayeredCCCapacity_T");
		textStruct.append("(");
		textStruct.append("layerRate=");
		textStruct.append(layerRate);
		textStruct.append(","); 
		textStruct.append("ingressPortsNum=");
		textStruct.append(ingressPortsNum);
		textStruct.append(","); 
		textStruct.append("egressPortsNum=");
		textStruct.append(egressPortsNum);
		textStruct.append(","); 
		textStruct.append("totalPortdNum=");
		textStruct.append(totalPortdNum);
		textStruct.append(","); 
		textStruct.append("portsType=");
		textStruct.append(portsType);
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <additionalInfo.length; mem5++){
			textStruct.append(additionalInfo[mem5]);
			if(mem5 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
