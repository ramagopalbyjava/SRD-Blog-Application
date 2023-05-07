package com.ashoikIt.report.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashoikIt.report.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
