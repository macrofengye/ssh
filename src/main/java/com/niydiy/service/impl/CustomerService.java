package com.niydiy.service.impl;

import com.niydiy.dao.CustomerDao;
import com.niydiy.domain.Customer;

public class CustomerService implements com.niydiy.service.CustomerService {
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void save(Customer customer) {
		customerDao.save(customer);
	}
}
