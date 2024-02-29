package com.jayesh.blog.services;

import java.util.List;

import com.jayesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//Add
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(int categoryId,CategoryDto categoryDto);
	
	//getById
	
	CategoryDto getCategory(int categoryId);
	
	//get
	List<CategoryDto> getCategory();
	
	//delete
	void deleteCategory(int categoryId);
	

}
