package com.blogapp.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.blogapp.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable> {

	public Optional<UserEntity> findByEmailAndPwd(String email, String pwd);
	
	public Optional<UserEntity> findByEmail(String email);
}
