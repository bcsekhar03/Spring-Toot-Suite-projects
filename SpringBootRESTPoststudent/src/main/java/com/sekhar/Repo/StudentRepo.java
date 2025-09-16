package com.sekhar.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.StudentDetails;
@Repository
public interface StudentRepo extends JpaRepository<StudentDetails,Integer> {

}
