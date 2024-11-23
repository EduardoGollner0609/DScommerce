package com.eduardo.dscommerce.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardo.dscommerce.dtos.OrderDTO;
import com.eduardo.dscommerce.dtos.OrderItemDTO;
import com.eduardo.dscommerce.entities.Order;
import com.eduardo.dscommerce.entities.OrderItem;
import com.eduardo.dscommerce.entities.OrderStatus;
import com.eduardo.dscommerce.entities.Product;
import com.eduardo.dscommerce.entities.User;
import com.eduardo.dscommerce.repositories.OrderItemRepository;
import com.eduardo.dscommerce.repositories.OrderRepository;
import com.eduardo.dscommerce.repositories.ProductRepository;
import com.eduardo.dscommerce.services.exceptions.ResourceNotFoundException;

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
