package com.jayesh.blog.exceptions;

public class AppException extends RuntimeException {
	
	public AppException(String message) {
		super(message);
	}
	public AppException() {
		super();
	}
}
