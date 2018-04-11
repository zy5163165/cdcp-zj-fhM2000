package notifications;

/**
 *	Generated from IDL definition of union "AlarmOrTCAIdentifier_T"
 *	@author JacORB IDL compiler 
 */

public final class AlarmOrTCAIdentifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private notifications.AlarmTypeQualifier_T discriminator;
	private notifications.TCAId_T tcaId;
	private notifications.AlarmId_T alarmId;

	public AlarmOrTCAIdentifier_T ()
	{
	}

	public notifications.AlarmTypeQualifier_T discriminator ()
	{
		return discriminator;
	}

	public notifications.TCAId_T tcaId ()
	{
		if( discriminator != notifications.AlarmTypeQualifier_T.TCA)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tcaId;
	}

	public void tcaId (notifications.TCAId_T _x)
	{
		discriminator = notifications.AlarmTypeQualifier_T.TCA;
		tcaId = _x;
	}

	public notifications.AlarmId_T alarmId ()
	{
		if( discriminator != notifications.AlarmTypeQualifier_T.ALARM)
			throw new org.omg.CORBA.BAD_OPERATION();
		return alarmId;
	}

	public void alarmId (notifications.AlarmId_T _x)
	{
		discriminator = notifications.AlarmTypeQualifier_T.ALARM;
		alarmId = _x;
	}

	public String toString()
	{
		StringBuffer textUnion = new StringBuffer();
		textUnion.append("AlarmOrTCAIdentifier_T(");
		if( discriminator == notifications.AlarmTypeQualifier_T.TCA){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("tcaId");
			textUnion.append("(");
			textUnion.append(tcaId);
			textUnion.append(")");
		}
		else if( discriminator == notifications.AlarmTypeQualifier_T.ALARM){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("alarmId");
			textUnion.append("(");
			textUnion.append(alarmId);
			textUnion.append(")");
		}
		else
			textUnion.append("discriminator has not been set");
		textUnion.append(")");
		return textUnion.toString();
	}
}
