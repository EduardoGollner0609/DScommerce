package com.eduardo.ecommerce.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardo.ecommerce.dtos.OrderDTO;
import com.eduardo.ecommerce.dtos.OrderItemDTO;
import com.eduardo.ecommerce.entities.Order;
import com.eduardo.ecommerce.entities.OrderItem;
import com.eduardo.ecommerce.entities.Product;
import com.eduardo.ecommerce.entities.User;
import com.eduardo.ecommerce.entities.enums.OrderStatus;
import com.eduardo.ecommerce.repositories.OrderItemRepository;
import com.eduardo.ecommerce.repositories.OrderRepository;
import com.eduardo.ecommerce.repositories.ProductRepository;
import com.eduardo.ecommerce.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthService authService;

	@Transactional(readOnly = true)
	public OrderDTO findById(Long id) {
		Order order = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		authService.validateSelfOrAdmin(order.getClient().getId());
		return new OrderDTO(order);
	}

	@Transactional
	public OrderDTO insert(OrderDTO dto) {

		Order order = new Order();

		order.setMoment(Instant.now());
		order.setStatus(OrderStatus.WAITING_PAYMENT);

		User user = userService.authenticated();
		order.setClient(user);

		for (OrderItemDTO itemDto : dto.getItems()) {
			Product product = productRepository.getReferenceById(itemDto.getProductId());
			OrderItem item = new OrderItem(order, product, itemDto.getQuantity(), product.getPrice());
			order.getItems().add(item);
		}

		repository.save(order);
		orderItemRepository.saveAll(order.getItems());

		return new OrderDTO(order);
	}
}