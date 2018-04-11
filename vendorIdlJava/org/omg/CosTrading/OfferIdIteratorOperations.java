package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "OfferIdIterator"
 *	@author JacORB IDL compiler 
 */


public interface OfferIdIteratorOperations
{
	/* constants */
	/* operations  */
	int max_left() throws org.omg.CosTrading.UnknownMaxLeft;
	boolean next_n(int n, org.omg.CosTrading.OfferIdSeqHolder ids);
	void destroy();
}
