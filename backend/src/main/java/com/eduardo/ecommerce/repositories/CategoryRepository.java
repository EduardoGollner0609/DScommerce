package com.eduardo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.ecommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
