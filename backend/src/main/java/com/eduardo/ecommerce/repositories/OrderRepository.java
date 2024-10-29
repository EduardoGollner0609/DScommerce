package com.eduardo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
