package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Implementação de Interface
		//list.forEach(new PriceUpdate());
		
		//Reference Method com método estático
		//list.forEach(Product::staticPriceUpdate);
		
		//Reference method com método não estático
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//Expressão Lambda declarada
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * 1.1);
//		};
//		list.forEach(cons);
		
		//Expressão Lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.10));
		
		list.forEach(System.out::println);
		
	}

}
