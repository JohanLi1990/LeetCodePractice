package com.challenge.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.challenge.model.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
	List<User> findByName(String name);
	
}
