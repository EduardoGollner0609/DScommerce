package com.eduardo.ecommerce.dtos;

import com.eduardo.ecommerce.entities.Category;

public class CategoryDTO {

	private Long id;
	private String name;
	
	public CategoryDTO() {
	}
	
	public CategoryDTO(Category category) {
		this.id = category.getId();
		this.name = category.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
