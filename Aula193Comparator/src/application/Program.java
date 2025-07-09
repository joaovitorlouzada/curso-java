package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
		 * Declaração sem uso da expressão lambda
		 */
		
//		Comparator<Product> comp = new Comparator<>() {
//
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
		
		//Implementação com uso da expressão lambda
		
//		Comparator<Product> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
		
		//Como a função anonima só tem uma linha, podemos dispensar as chaves e o return
		
//		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//	
//		list.sort(comp);
		
		//Por fim, ao invés da declaração do comp para depois utilizar no sort, podemos já utilizar a expressão de maneira direta
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
