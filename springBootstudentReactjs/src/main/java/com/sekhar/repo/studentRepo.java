package com.sekhar.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.studentreact;
@Repository
public interface studentRepo extends CrudRepository<studentreact, Integer> {

}
