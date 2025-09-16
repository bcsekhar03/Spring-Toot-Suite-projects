package com.sekhar.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.studentdetails;
@Repository
public interface studentRepo extends CrudRepository<studentdetails, Integer> {

	
}
