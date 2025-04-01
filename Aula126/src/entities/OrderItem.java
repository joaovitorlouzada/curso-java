package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;

	public Integer getQuantity() {
		return quantity;
	}
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity; 
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", $"  +product.getPrice() + ", Quantity: " + quantity+ ", " + "Subtotal: $" + subTotal() + "\n");
		return sb.toString();
	}

	

}
