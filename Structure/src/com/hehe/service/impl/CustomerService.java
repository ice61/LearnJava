package com.hehe.service.impl;

import com.hehe.dao.ICustomerDao;
import com.hehe.dao.impl.CustomerDao;
import com.hehe.factory.BeanFactory;
import com.hehe.service.ICustomerService;

public class CustomerService implements ICustomerService {

	private ICustomerDao customerDao = (ICustomerDao) BeanFactory.getBean("CUSTOMERDAO");
	
	@Override
	public void saveCustomer() {
		System.out.println("业务层调用持久层");
		customerDao.saveCustomer();
	}
	
	
}
