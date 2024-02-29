package com.jayesh.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayesh.blog.entities.Category;
import com.jayesh.blog.entities.Post;
import com.jayesh.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
	List<Post> findByCategory(Category category);
	
	List<Post> findByUser(User user);
	
	List<Post> findByTitleContaining(String title);

}
