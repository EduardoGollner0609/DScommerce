package com.eduardo.ecommerce.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);
	
	private int code;
	
	OrderStatus(int code) {
		this.code = code;
	}
	
	public OrderStatus valueOf(int code) {
		for(OrderStatus orderStatus : OrderStatus.values()) {
			if (code == orderStatus.code) {
				return orderStatus;
			}
		}
		throw new IllegalArgumentException("Código não existe");
	}
}
