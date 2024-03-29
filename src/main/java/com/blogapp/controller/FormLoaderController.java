package com.blogapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogapp.model.BlogsDataResp;
import com.blogapp.service.BlogsServices;
import com.blogapp.utils.AppUtils;

@Controller
public class FormLoaderController {

	@Autowired
	BlogsServices blogsServices;
	
	@GetMapping(value = "/")
	public String index(Model model) {
		List<BlogsDataResp> allBlogs = blogsServices.getAllBlogs();
		model.addAttribute("all_blog", allBlogs);
		return AppUtils.INDEX;
	}
	
	
	@GetMapping(value = "/search")
	public String searchBlog(@RequestParam String keyword, Model model) {
		List<BlogsDataResp> allBlogs = blogsServices.searchBlogs(keyword);
		System.out.println("All Blogs"+allBlogs.size());
		model.addAttribute("all_blog", allBlogs);
		return AppUtils.INDEX_TABLE;
	}
}
