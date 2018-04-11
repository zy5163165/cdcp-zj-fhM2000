package org.omg.CosTrading;

/**
 *	Generated from IDL definition of interface "OfferIterator"
 *	@author JacORB IDL compiler 
 */


public interface OfferIteratorOperations
{
	/* constants */
	/* operations  */
	int max_left() throws org.omg.CosTrading.UnknownMaxLeft;
	boolean next_n(int n, org.omg.CosTrading.OfferSeqHolder offers);
	void destroy();
}
