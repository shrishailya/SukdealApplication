package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	public Optional<User> findByUsernameIgnoreCase(String userName);
	public List<User> findByUsername(String userName);
	public long countByUsername(String userName);
	public Long deleteByUsername(String userName);
}
