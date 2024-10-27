package com.eduardo.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.ecommerce.entities.Category;
import com.eduardo.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	// Create
	public Category save(Category category) {
		return 	repository.save(category);
	}	
	
	// Read/Retrieve
	public Category findById(Long id) {
		return repository.getReferenceById(id);
	}
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	// Update
	public Category update(Long id, Category category) {
		Category obj = repository.getReferenceById(id);
		obj.setName(category.getName());
		return repository.save(obj);
	}
	
	// Delete
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
