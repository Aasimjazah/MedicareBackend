package com.example.medicare.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.medicare.entities.User;

@Repository
public interface UserRepo  extends CrudRepository<User, Integer>{

	User findByEmail(String email);

}
