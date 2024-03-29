package com.jayesh.blog.services;

import java.util.List;

import com.jayesh.blog.entities.Post;
import com.jayesh.blog.payloads.PostDto;
import com.jayesh.blog.payloads.PostResponse;


public interface PostService {
	
//	 create post
	PostDto createPost(PostDto postDto,Integer userId,Integer cateogryId);
	
//	update post
	PostDto updatePost(PostDto postDto,Integer postId);
	
//	get all post
	PostResponse getAllPost(Integer pageNumber,Integer pageSize, String sortBy, String sortDir);

// get single post
	PostDto getPostById(Integer postId); 
	
//	get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
//	get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
//	delete post
	void deletePost(Integer postId);
	
//	search post
	List<PostDto> searchPost(String title);
	

}
