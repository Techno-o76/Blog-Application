package com.jayesh.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayesh.blog.entities.Comment;
import com.jayesh.blog.entities.Post;
import com.jayesh.blog.exceptions.ResourceNotFoundException;
import com.jayesh.blog.payloads.CommentDto;
import com.jayesh.blog.repositories.CommentRepo;
import com.jayesh.blog.repositories.PostRepo;
import com.jayesh.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper moddelMapper;


	@Override
	public void deleteComment(Integer commentId) {
		Comment comment= this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment","commentId",commentId));
		this.commentRepo.delete(comment);
	}


	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","PostId",postId));
		Comment comment = this.moddelMapper.map(commentDto,Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment); 
		return this.moddelMapper.map(savedComment, CommentDto.class);
	
	}
	
	

}
