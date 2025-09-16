package com.sekhar.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.StudentRest;

@Repository
public interface StudentRepo1 extends CrudRepository<StudentRest, Integer> {

}
