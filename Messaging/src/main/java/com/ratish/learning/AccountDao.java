package com.ratish.learning;

public interface AccountDao {

	boolean update(Account account);

	boolean insert(Account account);

	boolean exists(Account account);

	Account findAccoundById(long accountId);

}
