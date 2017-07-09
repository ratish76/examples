package com.ratish.learning;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public final class AccountDaoImpl implements AccountDao {
	
	
	private final SimpleJdbcTemplate simpleJdbcTemplate;

	public AccountDaoImpl(SimpleJdbcTemplate simpleJdbcTemplate){
		this.simpleJdbcTemplate=simpleJdbcTemplate;
		
	}

	@Override
	public boolean update(Account account) {	
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exists(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findAccoundById(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
