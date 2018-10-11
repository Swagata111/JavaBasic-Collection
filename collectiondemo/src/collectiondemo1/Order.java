package collectiondemo1;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable
{
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDetails=" + orderDetails + ", orderDate=" + orderDate + "]";
	}
	private String orderId;
	private String orderDetails;
	private Date orderDate;
	public Order(String orderId, String orderDetails, Date orderDate) throws OrderNotValidException 
	{
		this.setOrderId(orderId);
		this.setOrderDetails(orderDetails);
		this.setOrderDate(orderDate);
		try
		{
		if(orderId.charAt(0)=='O' && orderId.length()>=3)
			System.out.println("Valid");
		else
		throw new OrderNotValidException();
		}
		catch(OrderNotValidException on)
		{
			System.out.println("Order Id not Valid");
		}
			
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
}
