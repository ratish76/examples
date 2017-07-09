package com.ratish.accounts.resolver;

import com.ratish.accounts.common.Resolver;
import com.ratish.accounts.common.ResolverFactory;
import com.ratish.learning.Account;

import java.util.Iterator;
import java.util.Map;

public   class AccountResolver<Map, Account> implements Resolver<Map, Account> {
	
	// 

	@Override
	public Account resolve(Map source, Account target) {
		 java.util.Map<String, Resolver<java.util.Map, com.ratish.learning.Account>> resolvers =  ResolverFactory.INSTANCE.getChildResolverForAccount();
		//Iterator<E> resolvers.values().iterator();
		
		
				// accountResolvers= ResolverFactory.INSTANCE.getChildResolverForAccount();
		return null;
	}

}
