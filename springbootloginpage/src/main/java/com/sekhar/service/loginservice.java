package com.sekhar.service;

import com.sekhar.model.Customer;

public interface loginservice {

	public Customer saveCustomer(Customer customer);
	public Customer login(String cname,String password);
}
