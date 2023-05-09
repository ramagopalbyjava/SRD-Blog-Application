package com.blogapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blogapp.entity.CommentEntity;
import com.blogapp.entity.PostEntity;

public interface CommentRepository extends CrudRepository<CommentEntity, Serializable> {

	List<CommentEntity> findByPostAndDeletedIsFalse(PostEntity post);

	List<CommentEntity> findByPostInAndDeletedIsFalse(List<PostEntity> postId);

}
