package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	
	/*
	 * Quando você usa o TreeSet, a sua classe do conjunto tem que ser uma implementação do Comparable, pra que seja possível
	 * que o treeSet compare os seus objetos
	 */

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		
		for(Product p: set) {
			System.out.println(p);
		}


	}

}
