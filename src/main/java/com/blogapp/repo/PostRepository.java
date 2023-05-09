package com.blogapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blogapp.entity.PostEntity;
import com.blogapp.entity.UserEntity;

public interface PostRepository extends CrudRepository<PostEntity, Serializable>{

	public List<PostEntity> findByUserAndDeletedIsFalse(UserEntity user);
	
	public List<PostEntity> findByDeletedIsFalse();
	
	public List<PostEntity> findByDeletedIsFalseAndTitleContainsOrDescriptionContains(String keyword,String word);
}
