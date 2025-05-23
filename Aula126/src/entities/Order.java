package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.*;

public class Order {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus orderStatus;
	Client client;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	List <OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}
	public Order(Date moment, OrderStatus orderStatus) {
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Order(Date moment, OrderStatus orderStatus, List<OrderItem> items) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.items = items;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.getPrice() * item.getQuantity();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdfMoment.format(moment)+ "\n");
		sb.append("Order status: " +orderStatus+ "\n");
		sb.append("Client: " +client.getName()+ " ("+ sdf.format(client.getBirthDate())+")" + " - " +client.getEmail()+ "\n");
		sb.append("Order items:" + "\n");
		for(OrderItem orderItem : items) {
			sb.append(orderItem+ "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}

}
