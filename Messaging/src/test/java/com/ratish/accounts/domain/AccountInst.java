package com.ratish.accounts.domain;

import java.util.List;

public class AccountInst {

	private int accountInstId = 0;
	private String productCode = null;
	private List<SearchCriteria> listSearchCritera = null;

	public int getAccountInstId() {
		return accountInstId;
	}

	public void setAccountInstId(int accountInstId) {
		this.accountInstId = accountInstId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<SearchCriteria> getListSearchCritera() {
		return listSearchCritera;
	}

	public void setListSearchCritera(List<SearchCriteria> listSearchCritera) {
		this.listSearchCritera = listSearchCritera;
	}

}
