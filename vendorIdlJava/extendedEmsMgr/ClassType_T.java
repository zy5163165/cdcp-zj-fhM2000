package extendedEmsMgr;
/**
 *	Generated from IDL definition of enum "ClassType_T"
 *	@author JacORB IDL compiler 
 */

public final class ClassType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EMS = 0;
	public static final ClassType_T EMS = new ClassType_T(_EMS);
	public static final int _ME = 1;
	public static final ClassType_T ME = new ClassType_T(_ME);
	public static final int _EQUIPMENT = 2;
	public static final ClassType_T EQUIPMENT = new ClassType_T(_EQUIPMENT);
	public static final int _PTP = 3;
	public static final ClassType_T PTP = new ClassType_T(_PTP);
	public static final int _CTP = 4;
	public static final ClassType_T CTP = new ClassType_T(_CTP);
	public static final int _TOPOLOGICALLINK = 5;
	public static final ClassType_T TOPOLOGICALLINK = new ClassType_T(_TOPOLOGICALLINK);
	public static final int _SUBNETWORK = 6;
	public static final ClassType_T SUBNETWORK = new ClassType_T(_SUBNETWORK);
	public static final int _SNC = 7;
	public static final ClassType_T SNC = new ClassType_T(_SNC);
	public static final int _CROSSCONNECT = 8;
	public static final ClassType_T CROSSCONNECT = new ClassType_T(_CROSSCONNECT);
	public static final int _FDFR = 9;
	public static final ClassType_T FDFR = new ClassType_T(_FDFR);
	public static final int _MFDFR = 10;
	public static final ClassType_T MFDFR = new ClassType_T(_MFDFR);
	public static final int _PROTECTIONGROUP = 11;
	public static final ClassType_T PROTECTIONGROUP = new ClassType_T(_PROTECTIONGROUP);
	public static final int _RACK = 12;
	public static final ClassType_T RACK = new ClassType_T(_RACK);
	public static final int _SHELF = 13;
	public static final ClassType_T SHELF = new ClassType_T(_SHELF);
	public static final int _SLOT = 14;
	public static final ClassType_T SLOT = new ClassType_T(_SLOT);
	public static final int _OTHER = 15;
	public static final ClassType_T OTHER = new ClassType_T(_OTHER);
	public int value()
	{
		return value;
	}
	public static ClassType_T from_int(int value)
	{
		switch (value) {
			case _EMS: return EMS;
			case _ME: return ME;
			case _EQUIPMENT: return EQUIPMENT;
			case _PTP: return PTP;
			case _CTP: return CTP;
			case _TOPOLOGICALLINK: return TOPOLOGICALLINK;
			case _SUBNETWORK: return SUBNETWORK;
			case _SNC: return SNC;
			case _CROSSCONNECT: return CROSSCONNECT;
			case _FDFR: return FDFR;
			case _MFDFR: return MFDFR;
			case _PROTECTIONGROUP: return PROTECTIONGROUP;
			case _RACK: return RACK;
			case _SHELF: return SHELF;
			case _SLOT: return SLOT;
			case _OTHER: return OTHER;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ClassType_T(int i)
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
		textEnum.append("ClassType_T");
		textEnum.append(".");
		switch(value())
		{
		case _EMS:
			textEnum.append("EMS");
			break;
		case _ME:
			textEnum.append("ME");
			break;
		case _EQUIPMENT:
			textEnum.append("EQUIPMENT");
			break;
		case _PTP:
			textEnum.append("PTP");
			break;
		case _CTP:
			textEnum.append("CTP");
			break;
		case _TOPOLOGICALLINK:
			textEnum.append("TOPOLOGICALLINK");
			break;
		case _SUBNETWORK:
			textEnum.append("SUBNETWORK");
			break;
		case _SNC:
			textEnum.append("SNC");
			break;
		case _CROSSCONNECT:
			textEnum.append("CROSSCONNECT");
			break;
		case _FDFR:
			textEnum.append("FDFR");
			break;
		case _MFDFR:
			textEnum.append("MFDFR");
			break;
		case _PROTECTIONGROUP:
			textEnum.append("PROTECTIONGROUP");
			break;
		case _RACK:
			textEnum.append("RACK");
			break;
		case _SHELF:
			textEnum.append("SHELF");
			break;
		case _SLOT:
			textEnum.append("SLOT");
			break;
		case _OTHER:
			textEnum.append("OTHER");
			break;
		}
		return textEnum.toString();
	}
}
