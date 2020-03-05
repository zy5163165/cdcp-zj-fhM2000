package ipMgr;

/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public StaticRouting_T(){}
	public java.lang.String destIP = "";
	public java.lang.String destMask = "";
	public java.lang.String nextHopIP = "";
	public globaldefs.NameAndStringValue_T[] outPort;
	public java.lang.String priority = "";
	public globaldefs.NameAndStringValue_T[] bindingObject;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public StaticRouting_T(java.lang.String destIP, java.lang.String destMask, java.lang.String nextHopIP, globaldefs.NameAndStringValue_T[] outPort, java.lang.String priority, globaldefs.NameAndStringValue_T[] bindingObject, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.destIP = destIP;
		this.destMask = destMask;
		this.nextHopIP = nextHopIP;
		this.outPort = outPort;
		this.priority = priority;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("StaticRouting_T");
		textStruct.append("(");
		textStruct.append("destIP=");
		textStruct.append(destIP);
		textStruct.append(","); 
		textStruct.append("destMask=");
		textStruct.append(destMask);
		textStruct.append(","); 
		textStruct.append("nextHopIP=");
		textStruct.append(nextHopIP);
		textStruct.append(","); 
		textStruct.append("outPort=");
		textStruct.append("[");
		for(int mem3 =0; mem3 <outPort.length; mem3++){
			textStruct.append(outPort[mem3]);
			if(mem3 < outPort.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("priority=");
		textStruct.append(priority);
		textStruct.append(","); 
		textStruct.append("bindingObject=");
		textStruct.append("[");
		for(int mem5 =0; mem5 <bindingObject.length; mem5++){
			textStruct.append(bindingObject[mem5]);
			if(mem5 < bindingObject.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(","); 
		textStruct.append("additionalInfo=");
		textStruct.append("[");
		for(int mem6 =0; mem6 <additionalInfo.length; mem6++){
			textStruct.append(additionalInfo[mem6]);
			if(mem6 < additionalInfo.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
