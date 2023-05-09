package com.blogapp.model;

import lombok.Data;

@Data
public class SignUpRequestModel {
	
	String firstName;
	String lastName;
	String email;
	String password;

}
