package com.hehe.dao.impl;

import com.hehe.dao.ICustomerDao;

public class CustomerDao implements ICustomerDao {
	
	@Override
	public void saveCustomer() {
		System.out.println("持久层保存了客户");
	}
}
