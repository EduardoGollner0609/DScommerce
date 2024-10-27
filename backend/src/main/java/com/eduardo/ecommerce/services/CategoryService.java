package com.eduardo.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.ecommerce.entities.Category;
import com.eduardo.ecommerce.repositories.CategoryRepository;
import com.eduardo.ecommerce.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	// Create
	public Category save(Category category) {
		return repository.save(category);
	}

	// Read/Retrieve
	public Category findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado."));
	}

	public List<Category> findAll() {
		return repository.findAll();
	}

	// Update
	public Category update(Long id, Category category) {

		try {
			Category obj = repository.getReferenceById(id);
			obj.setName(category.getName());
			return repository.save(obj);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Recurso não encontrado.");
		}
	}

	// Delete
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			throw new ResourceNotFoundException("Recurso não encontrado.");
		}
		repository.deleteById(id);
	}

}
