package com.blogapp.service;

import com.blogapp.model.LoginRequestModel;
import com.blogapp.model.SignUpRequestModel;

public interface UserServices {
	
	public String login(LoginRequestModel loginRequest);
	public String signUp(SignUpRequestModel signUpRequest);
}
