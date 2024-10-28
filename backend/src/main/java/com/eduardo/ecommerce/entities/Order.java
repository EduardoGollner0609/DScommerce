package com.eduardo.ecommerce.entities;

import java.time.Instant;

public class Order {

	private Long id;
	private Instant moment;

	public Order() {

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

}
