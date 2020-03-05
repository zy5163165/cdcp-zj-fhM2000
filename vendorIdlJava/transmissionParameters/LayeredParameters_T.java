package transmissionParameters;

/**
 *	Generated from IDL definition of struct "LayeredParameters_T"
 *	@author JacORB IDL compiler 
 */

public final class LayeredParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LayeredParameters_T(){}
	public short layer;
	public globaldefs.NameAndStringValue_T[] transmissionParams;
	public LayeredParameters_T(short layer, globaldefs.NameAndStringValue_T[] transmissionParams)
	{
		this.layer = layer;
		this.transmissionParams = transmissionParams;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("LayeredParameters_T");
		textStruct.append("(");
		textStruct.append("layer=");
		textStruct.append(layer);
		textStruct.append(","); 
		textStruct.append("transmissionParams=");
		textStruct.append("[");
		for(int mem1 =0; mem1 <transmissionParams.length; mem1++){
			textStruct.append(transmissionParams[mem1]);
			if(mem1 < transmissionParams.length-1)
				textStruct.append(",");
		}
		textStruct.append("]");
		textStruct.append(")");
		return textStruct.toString();
	}
}
