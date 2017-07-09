package com.ratish.accounts.resolver;

import java.util.LinkedHashMap;
import java.util.Map;

import com.ratish.accounts.common.Resolver;
import com.ratish.accounts.common.ResolverFactory;
import com.ratish.accounts.domain.NewsMessage;
import com.ratish.learning.Account;

public class ResolverFactoryImpl implements ResolverFactory {
	
	
   //Stores  all the resolvers for accounts field.
   private Map<String,Resolver<Map,Account>> childResolverForAccount = new LinkedHashMap<String, Resolver<Map,Account>>();	


	@Override
	public Resolver getResolverByField(String accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resolver<Map<String, String>, NewsMessage> getNewsMessageResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resolver<Map<String, String>, Account> getAccountResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String,Resolver<Map,Account>> getChildResolverForAccount() {
		return childResolverForAccount;
	}

	public void setChildResolverForAccount(Map<String,Resolver<Map,Account>> childResolverForAccount) {
		this.childResolverForAccount = childResolverForAccount;
	}

}
