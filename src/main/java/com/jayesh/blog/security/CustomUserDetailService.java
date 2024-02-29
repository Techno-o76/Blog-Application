package com.jayesh.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jayesh.blog.exceptions.ResourceNotFoundException;
import com.jayesh.blog.repositories.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// load user from DB using the user name (here email)
		return this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User","Email "+username,0));
	}
}
