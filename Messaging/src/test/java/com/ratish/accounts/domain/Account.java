package com.ratish.accounts.domain;

import java.util.List;

public class Account {

	private int accountId;
	private AccountType accountype;
	private List<AccountInst> accountInsts;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public AccountType getAccountype() {
		return accountype;
	}

	public void setAccountype(AccountType accountype) {
		this.accountype = accountype;
	}

	public List<AccountInst> getAccountInsts() {
		return accountInsts;
	}

	public void setAccountInsts(List<AccountInst> accountInsts) {
		this.accountInsts = accountInsts;
	}

}
