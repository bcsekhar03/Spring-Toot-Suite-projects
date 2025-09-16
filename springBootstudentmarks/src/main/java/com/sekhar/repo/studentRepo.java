package com.sekhar.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.studentclass;
@Repository
public interface studentRepo extends CrudRepository<studentclass, Integer> {

}
