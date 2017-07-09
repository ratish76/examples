package com.ratish.accounts.common;

public interface Resolver<S,T> {
	
	T  resolve(S source, T target);

}
