/**
 * 
 */
package com.ratish.learning;

/**
 * @author Ratish
 *
 */
public interface AccountManager {	
	public void persist(Account account);
	public Account getAccountById(long accountId);
}
