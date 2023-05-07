package com.ashoikIt.report.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashoikIt.report.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
