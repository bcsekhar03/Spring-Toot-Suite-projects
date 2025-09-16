package com.sekhar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekhar.model.Customer;
import com.sekhar.repo.CustomerRepo;

@Service
public class loginserviceIMP implements loginservice{

	@Autowired
	private CustomerRepo repo;
	public Customer saveCustomer(Customer customer)
	{
		Customer save=repo.save(customer);
		return save;
	}
	public Customer login(String cname,String password)
	{
		Customer login=repo.findByCnameAndPassword(cname,password);
		return login;
	}
}
