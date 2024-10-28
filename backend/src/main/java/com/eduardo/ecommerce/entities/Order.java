package com.eduardo.ecommerce.entities;

import java.time.Instant;

import com.eduardo.ecommerce.entities.enums.OrderStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	private OrderStatus orderStatus;
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;

	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, Payment payment) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.payment = payment;
	}

	public Order(Long id, Instant moment) {
		this.id = id;
		this.moment = moment;
	}

	public Long getId() {
		return id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public void setOrderStatus() {

	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	

}
