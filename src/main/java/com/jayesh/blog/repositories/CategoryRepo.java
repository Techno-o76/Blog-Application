package com.jayesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jayesh.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	

}
