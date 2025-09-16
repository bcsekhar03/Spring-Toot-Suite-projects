package com.sekhar.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekhar.model.user;
@Repository
public interface userRepo extends JpaRepository<user, Integer> {

}
