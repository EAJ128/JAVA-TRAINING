package com.ecommerce.Model;

public class Order {
	public User user;
	public Product product;
	public int quantity;
	public Order(User user,Product product,int quantity)
	{
		this.user=user;
		this.product=product;
		this.quantity=quantity;
	}
}
