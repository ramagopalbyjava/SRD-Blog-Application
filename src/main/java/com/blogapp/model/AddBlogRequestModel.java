package com.blogapp.model;

import lombok.Data;

@Data
public class AddBlogRequestModel {

	private Integer userId;
	private String title;
	private String shortDescription;
	private String content;
	private Integer blogId;
}
