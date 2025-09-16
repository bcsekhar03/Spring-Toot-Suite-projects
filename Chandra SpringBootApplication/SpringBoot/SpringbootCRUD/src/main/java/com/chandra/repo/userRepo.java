package com.chandra.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chandra.model.user;
@Repository
public interface userRepo extends CrudRepository<user, Integer> {

}
