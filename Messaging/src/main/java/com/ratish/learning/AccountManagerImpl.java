package com.ratish.learning;

public final class AccountManagerImpl implements AccountManager {

	private final AccountDao acountdao;

	public AccountManagerImpl(AccountDao acountdao) {
		if (acountdao == null) {
			throw new IllegalArgumentException("AccountDao is Null");
		}

		this.acountdao = acountdao;
	}

	@Override
	public void persist(Account account) {

		if (exists(account)) {
			update(account);
		} else {
			create(account);
		}

	}

	private boolean create(Account account) {
		boolean isInserted = acountdao.insert(account);
		return isInserted;

	}

	private boolean update(Account account) {
		boolean isUpdated = acountdao.update(account);
		return isUpdated;

	}

	private boolean exists(Account account) {
		return acountdao.exists(account);
	}

	@Override
	public Account getAccountById(long accountId) {
		return acountdao.findAccoundById(accountId);
	}

}
