package callSNC;

/**
 *	Generated from IDL definition of struct "Diversity_T"
 *	@author JacORB IDL compiler 
 */

public final class Diversity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Diversity_T(){}
	public java.lang.String coroutingLevelOfEffort;
	public java.lang.String nodeDiversityLevelOfEffort;
	public java.lang.String linkDiversityLevelOfEffort;
	public java.lang.String nodeSRGType = "";
	public java.lang.String linkSRGType = "";
	public Diversity_T(java.lang.String coroutingLevelOfEffort, java.lang.String nodeDiversityLevelOfEffort, java.lang.String linkDiversityLevelOfEffort, java.lang.String nodeSRGType, java.lang.String linkSRGType)
	{
		this.coroutingLevelOfEffort = coroutingLevelOfEffort;
		this.nodeDiversityLevelOfEffort = nodeDiversityLevelOfEffort;
		this.linkDiversityLevelOfEffort = linkDiversityLevelOfEffort;
		this.nodeSRGType = nodeSRGType;
		this.linkSRGType = linkSRGType;
	}
	public String toString()
	{
		StringBuffer textStruct = new StringBuffer();
		textStruct.append("Diversity_T");
		textStruct.append("(");
		textStruct.append("coroutingLevelOfEffort=");
		textStruct.append(coroutingLevelOfEffort);
		textStruct.append(","); 
		textStruct.append("nodeDiversityLevelOfEffort=");
		textStruct.append(nodeDiversityLevelOfEffort);
		textStruct.append(","); 
		textStruct.append("linkDiversityLevelOfEffort=");
		textStruct.append(linkDiversityLevelOfEffort);
		textStruct.append(","); 
		textStruct.append("nodeSRGType=");
		textStruct.append(nodeSRGType);
		textStruct.append(","); 
		textStruct.append("linkSRGType=");
		textStruct.append(linkSRGType);
		textStruct.append(")");
		return textStruct.toString();
	}
}
