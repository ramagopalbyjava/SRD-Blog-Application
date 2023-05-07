package com.ashoikIt.report.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "USER_TAB")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String pwd;
	
	/**
	 * If we want implements Bi-direactionl that only we need to write other wise ignore it
	 */
	//@OneToMany(mappedBy= "user",cascade=CascadeType.REMOVE)
	//private List<Post> post;

}
