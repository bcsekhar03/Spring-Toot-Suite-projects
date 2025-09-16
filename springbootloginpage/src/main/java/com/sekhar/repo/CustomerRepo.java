package com.sekhar.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	Customer findByCnameAndPassword(String cname, String password);

}
