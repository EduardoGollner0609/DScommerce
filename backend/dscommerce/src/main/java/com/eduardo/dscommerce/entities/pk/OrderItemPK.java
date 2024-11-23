package com.eduardo.dscommerce.entities.pk;

import com.eduardo.dscommerce.entities.Order;
import com.eduardo.dscommerce.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {

	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

	public OrderItemPK() {
	}

	public OrderItemPK(Product product, Order order) {
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
