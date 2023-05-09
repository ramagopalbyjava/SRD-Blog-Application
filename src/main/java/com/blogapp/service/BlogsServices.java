package com.blogapp.service;

import java.util.List;

import com.blogapp.model.AddBlogRequestModel;
import com.blogapp.model.BlogsDataResp;
import com.blogapp.model.CommentRequestAndResp;

public interface BlogsServices {

	public String addBlog(AddBlogRequestModel addBlogRequest);

	public String editBlog(AddBlogRequestModel addBlogRequest);

	public String deleteBlog(Integer blogId);

	public List<BlogsDataResp> getAllBlogs();

	public BlogsDataResp getBlogsByBlogId(Integer blogId);

	public List<BlogsDataResp> getBlogsByUserId();

	public String addCommentToBlog(CommentRequestAndResp commentRequest);

	public List<CommentRequestAndResp> getAllCommentsByBlogId(Integer blogId);

	public List<CommentRequestAndResp> getAllCommentsByUserId();
	
	public String deleteComment(Integer commentId);
	
	public List<BlogsDataResp> searchBlogs(String keyWord);
}
