package com.eduardo.ecommerce.entities.pk;

import com.eduardo.ecommerce.entities.Order;
import com.eduardo.ecommerce.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk {

	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	public OrderItemPk() {
	}

	public OrderItemPk(Product product, Order order) {
		this.product = product;
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
