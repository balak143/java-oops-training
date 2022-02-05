package com.ion.training.oops.coupling;

//Coupling is a measure of how much a class is dependent on other classes. 
//There should be minimal dependencies between classes.
//Consider the example below:

class LineItem {
	public float price;
	public int quantity;
	private String itemName;
}

class Cart {
	public LineItem [] items;

}

class Order {
	private Cart cart;
	private float salesTax;

	public Order(Cart cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	// This method know the internal details of LineItem and
	// Cart classes.
	public float orderTotalPrice() {
		float cartTotalPrice = 0;
		for (int i = 0; i < cart.items.length; i++) {
			cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
		}
		cartTotalPrice += cartTotalPrice * salesTax;
		return cartTotalPrice;
	}

}

class Test {

}
