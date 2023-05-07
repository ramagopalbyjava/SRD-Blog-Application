package com.ashoikIt.report.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashoikIt.report.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
