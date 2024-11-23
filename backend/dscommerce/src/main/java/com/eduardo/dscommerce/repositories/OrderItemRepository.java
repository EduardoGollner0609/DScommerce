package com.eduardo.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.dscommerce.entities.OrderItem;
import com.eduardo.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
