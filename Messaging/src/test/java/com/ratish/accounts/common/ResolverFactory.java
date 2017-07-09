package com.ratish.accounts.common;

import java.util.Map;

import com.ratish.accounts.domain.NewsMessage;
import com.ratish.accounts.resolver.ResolverFactoryImpl;
import com.ratish.learning.Account;

public interface ResolverFactory {
	
	public ResolverFactory  INSTANCE = new ResolverFactoryImpl();
	

	public final String ACCOUNT_ID = "ACCOUNT_ID";
	public final String NEWS_MESSAGE = "NEWS_MESSAGE";

	public Resolver getResolverByField(String accountId);

	public Resolver<Map<String, String>,NewsMessage> getNewsMessageResolver();

	public Resolver<Map<String, String>, Account> getAccountResolver();

	public  Map<String,Resolver<Map,Account>> getChildResolverForAccount();

}
