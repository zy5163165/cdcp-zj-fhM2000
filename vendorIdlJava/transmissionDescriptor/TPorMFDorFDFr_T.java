package transmissionDescriptor;

/**
 *	Generated from IDL definition of union "TPorMFDorFDFr_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator;
	private flowDomainFragment.FlowDomainFragment_T fdfr;
	private flowDomain.MatrixFlowDomain_T mfd;
	private terminationPoint.TerminationPoint_T tp;

	public TPorMFDorFDFr_T ()
	{
	}

	public transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator ()
	{
		return discriminator;
	}

	public flowDomainFragment.FlowDomainFragment_T fdfr ()
	{
		if( discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr)
			throw new org.omg.CORBA.BAD_OPERATION();
		return fdfr;
	}

	public void fdfr (flowDomainFragment.FlowDomainFragment_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr;
		fdfr = _x;
	}

	public flowDomain.MatrixFlowDomain_T mfd ()
	{
		if( discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD)
			throw new org.omg.CORBA.BAD_OPERATION();
		return mfd;
	}

	public void mfd (flowDomain.MatrixFlowDomain_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD;
		mfd = _x;
	}

	public terminationPoint.TerminationPoint_T tp ()
	{
		if( discriminator != transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tp;
	}

	public void tp (terminationPoint.TerminationPoint_T _x)
	{
		discriminator = transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP;
		tp = _x;
	}

	public String toString()
	{
		StringBuffer textUnion = new StringBuffer();
		textUnion.append("TPorMFDorFDFr_T(");
		if( discriminator == transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("fdfr");
			textUnion.append("(");
			textUnion.append(fdfr);
			textUnion.append(")");
		}
		else if( discriminator == transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("mfd");
			textUnion.append("(");
			textUnion.append(mfd);
			textUnion.append(")");
		}
		else if( discriminator == transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP){
			textUnion.append(discriminator);
			textUnion.append(",");
			textUnion.append("tp");
			textUnion.append("(");
			textUnion.append(tp);
			textUnion.append(")");
		}
		else
			textUnion.append("discriminator has not been set");
		textUnion.append(")");
		return textUnion.toString();
	}
}
