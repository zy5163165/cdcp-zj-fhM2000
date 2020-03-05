package transmissionDescriptor;
/**
 *	Generated from IDL definition of enum "TPorMFDorFDFrQualifier_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFrQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _aTP = 0;
	public static final TPorMFDorFDFrQualifier_T aTP = new TPorMFDorFDFrQualifier_T(_aTP);
	public static final int _aMFD = 1;
	public static final TPorMFDorFDFrQualifier_T aMFD = new TPorMFDorFDFrQualifier_T(_aMFD);
	public static final int _aFDFr = 2;
	public static final TPorMFDorFDFrQualifier_T aFDFr = new TPorMFDorFDFrQualifier_T(_aFDFr);
	public int value()
	{
		return value;
	}
	public static TPorMFDorFDFrQualifier_T from_int(int value)
	{
		switch (value) {
			case _aTP: return aTP;
			case _aMFD: return aMFD;
			case _aFDFr: return aFDFr;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPorMFDorFDFrQualifier_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int( value() );
	}
	public String toString()
	{
		StringBuffer textEnum = new StringBuffer();
		textEnum.append("TPorMFDorFDFrQualifier_T");
		textEnum.append(".");
		switch(value())
		{
		case _aTP:
			textEnum.append("aTP");
			break;
		case _aMFD:
			textEnum.append("aMFD");
			break;
		case _aFDFr:
			textEnum.append("aFDFr");
			break;
		}
		return textEnum.toString();
	}
}
