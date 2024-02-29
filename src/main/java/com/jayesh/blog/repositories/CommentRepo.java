package com.jayesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayesh.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {
	

}
