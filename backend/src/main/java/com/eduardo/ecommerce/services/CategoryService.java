package com.eduardo.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.ecommerce.dtos.CategoryDTO;
import com.eduardo.ecommerce.entities.Category;
import com.eduardo.ecommerce.repositories.CategoryRepository;
import com.eduardo.ecommerce.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	// Create
	public CategoryDTO save(CategoryDTO dto) {
		Category category = new Category();
		copyDtoToEntity(dto, category);
		category = repository.save(category);
		return new CategoryDTO(category);
	}

	// Read/Retrieve
	public CategoryDTO findById(Long id) {
		Category category = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado."));
		return new CategoryDTO(category);
	}

	public List<CategoryDTO> findAll() {
		List<Category> categories = repository.findAll();
		return categories.stream().map(x -> new CategoryDTO(x)).toList();
	}

	// Update
	public CategoryDTO update(Long id, CategoryDTO dto) {

		try {
			Category category = repository.getReferenceById(id);
			copyDtoToEntity(dto, category);
			category = repository.save(category);
			return new CategoryDTO(category);
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

	private void copyDtoToEntity(CategoryDTO dto, Category category) {
		category.setName(dto.getName());
	}
}
