package com.eduardo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
