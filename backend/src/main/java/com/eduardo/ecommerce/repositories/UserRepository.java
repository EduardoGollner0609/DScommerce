package com.eduardo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
