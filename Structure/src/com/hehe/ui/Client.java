package com.hehe.ui;

import com.hehe.factory.BeanFactory;
import com.hehe.service.ICustomerService;

public class Client {
	public static void main(String args[]) {
		ICustomerService customerService = (ICustomerService) BeanFactory.getBean("CUSTOMERSERVICE");
		customerService.saveCustomer();
		
	}
}
