package com.eduardo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entities.OrderItem;
import com.eduardo.ecommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
