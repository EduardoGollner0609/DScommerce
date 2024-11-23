package com.eduardo.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
