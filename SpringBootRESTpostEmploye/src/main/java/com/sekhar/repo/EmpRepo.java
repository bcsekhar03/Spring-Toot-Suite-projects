package com.sekhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository <Employee, Integer> {

}
