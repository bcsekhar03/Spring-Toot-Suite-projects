package com.sekhar.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.personal;

@Repository
public interface PersonalRepo extends CrudRepository< personal, Integer>{

	
}
