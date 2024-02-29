package com.jayesh.blog.services;

import java.util.List;

import com.jayesh.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto userDto);
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,int id);
	
	UserDto getUserById(int id);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(int id);
	

}
