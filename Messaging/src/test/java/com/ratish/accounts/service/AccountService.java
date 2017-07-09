package com.ratish.accounts.service;

import java.util.Map;

import com.ratish.accounts.common.Resolver;
import com.ratish.accounts.common.ResolverFactory;
import com.ratish.accounts.domain.NewsMessage;
import com.ratish.learning.Account;

public class AccountService {

	private ResolverFactory resolverContext;
	private DAO dao;

	public void service(Map<String, String> request) {
		handleNewsMessage(request);
		handleAccount(request);
	}

	private void handleAccount(Map<String, String> request) {
		Account account = new Account();
		resolverContext.getResolverByField(ResolverFactory.ACCOUNT_ID).resolve(	request, account);
		long id = account.getAccountId();
		boolean exists = isAccountExists(id);
		if (exists) {
			handleAccountUpdate(request, account);
		} else {
			handleAccountInsert(request, account);
		}
	}

	private void handleAccountInsert(Map<String, String> request,Account account) {
		Resolver<Map<String, String>, Account> accountResolver = resolverContext.getAccountResolver();
		accountResolver.resolve(request, account);
		dao.createAccount(account);
		
	}

	private void handleAccountUpdate(Map<String, String> request,
			Account account) {
		Resolver<Map<String, String>, Account> accountResolver = resolverContext.getAccountResolver();
		accountResolver.resolve(request, account);
		dao.updateAccount(account);

	}

	private void handleNewsMessage(Map<String, String> request) {
		NewsMessage newsMessage = new NewsMessage();
		Resolver<Map<String, String>, NewsMessage> newsResolver = resolverContext
				.getNewsMessageResolver();
		newsResolver.resolve(request, newsMessage);
		dao.createNews(newsMessage);
	}

	private boolean isAccountExists(long id) {
		return dao.isAccountExist(id);
	}

}
