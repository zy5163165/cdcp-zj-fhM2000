package multiLayerSubnetwork;
/**
 *	Generated from IDL definition of enum "EMSFreedomLevel_T"
 *	@author JacORB IDL compiler 
 */

public final class EMSFreedomLevel_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EMSFL_CC_AT_SNC_LAYER = 0;
	public static final EMSFreedomLevel_T EMSFL_CC_AT_SNC_LAYER = new EMSFreedomLevel_T(_EMSFL_CC_AT_SNC_LAYER);
	public static final int _EMSFL_TERMINATE_AND_MAP = 1;
	public static final EMSFreedomLevel_T EMSFL_TERMINATE_AND_MAP = new EMSFreedomLevel_T(_EMSFL_TERMINATE_AND_MAP);
	public static final int _EMSFL_HIGHER_ORDER_SNCS = 2;
	public static final EMSFreedomLevel_T EMSFL_HIGHER_ORDER_SNCS = new EMSFreedomLevel_T(_EMSFL_HIGHER_ORDER_SNCS);
	public static final int _EMSFL_RECONFIGURATION = 3;
	public static final EMSFreedomLevel_T EMSFL_RECONFIGURATION = new EMSFreedomLevel_T(_EMSFL_RECONFIGURATION);
	public int value()
	{
		return value;
	}
	public static EMSFreedomLevel_T from_int(int value)
	{
		switch (value) {
			case _EMSFL_CC_AT_SNC_LAYER: return EMSFL_CC_AT_SNC_LAYER;
			case _EMSFL_TERMINATE_AND_MAP: return EMSFL_TERMINATE_AND_MAP;
			case _EMSFL_HIGHER_ORDER_SNCS: return EMSFL_HIGHER_ORDER_SNCS;
			case _EMSFL_RECONFIGURATION: return EMSFL_RECONFIGURATION;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EMSFreedomLevel_T(int i)
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
		textEnum.append("EMSFreedomLevel_T");
		textEnum.append(".");
		switch(value())
		{
		case _EMSFL_CC_AT_SNC_LAYER:
			textEnum.append("EMSFL_CC_AT_SNC_LAYER");
			break;
		case _EMSFL_TERMINATE_AND_MAP:
			textEnum.append("EMSFL_TERMINATE_AND_MAP");
			break;
		case _EMSFL_HIGHER_ORDER_SNCS:
			textEnum.append("EMSFL_HIGHER_ORDER_SNCS");
			break;
		case _EMSFL_RECONFIGURATION:
			textEnum.append("EMSFL_RECONFIGURATION");
			break;
		}
		return textEnum.toString();
	}
}
