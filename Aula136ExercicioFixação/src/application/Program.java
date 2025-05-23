package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Product #" +(i+1)+ " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeOfProduct = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(typeOfProduct == 'i') {
				System.out.print("Custom Fee: ");
				Double customFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customFee);
				products.add(product);
			}
			else if(typeOfProduct == 'u') {
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String Stringdate = sc.nextLine();
				Product product = new UsedProduct(name, price, sdf.parse(Stringdate));
				products.add(product);
			}
			else {
				Product product = new Product(name, price);
				products.add(product);
			}
		}
		for(Product product: products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
		
	}

}
