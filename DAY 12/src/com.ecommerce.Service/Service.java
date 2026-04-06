package com.ecommerce.Service;
import com.ecommerce.Model.*;
public class Service {
	public void PlaceOrder(Order order)
	{
		order.product.stock-=order.quantity;
		System.out.println("The Order Placed By "+order.user.name+" was Delivered to "+order.user.address+" of Quantity "+order.quantity+" Where the Total Price Is "+order.quantity*order.product.price+" Remaining Stock Is "+order.product.stock);
	}
}
