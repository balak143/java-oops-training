package com.ion.training.oops.coupling.z_exercise;

class LineItem {
	private float price;
	private int quantity;
	public float getTotalPrice() {
		return price * quantity;
	}
}

class Cart {
	private LineItem[] items;
	public float getTotalPrice() {
		float totalPrice = 0;
		for (LineItem item : items) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}

class Order {
	private Cart cart;
	private float salesTax;

	public Order(Cart cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public float totalPrice() {
		return cart.getTotalPrice() * (1.0f + salesTax);
	}
}


