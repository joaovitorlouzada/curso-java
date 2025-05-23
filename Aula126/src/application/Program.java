package application;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.*;
import entities.Client;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner read = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = read.nextLine();
		System.out.print("Email: ");
		String email = read.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = read.nextLine();
		
		Client client = new Client(name, email, sdf.parse(birthDate));
		
//		Client client = new Client();
//		client.setName(name);
//		client.setEmail(email);
//		client.setBirthDate(sdf.parse(birthDate));
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = read.nextLine();
		Order order = new Order(new Date(), OrderStatus.valueOf(status));
		order.setClient(client);
		System.out.print("How many items to this order? ");
		int quantity = read.nextInt();
		
		
		
		for(int i = 0; i < quantity; i++) {
		    System.out.println("Enter #" +(i+1)+ " item data:" );
		    read.nextLine();
		    System.out.print("Product name: ");
		    String productName = read.nextLine();
		    System.out.print("Product price: ");
		    Double productPrice = read.nextDouble();
		    System.out.print("Quantity: ");
		    int itemQuantity = read.nextInt();
		    
		    Product product = new Product(productName, productPrice);
		    
		    OrderItem orderItem = new OrderItem(itemQuantity, productPrice, product);
		    
		    order.addItem(orderItem);
		}
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		read.close();

	}

}
