package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;


public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.0);

		System.out.println(set.contains(prod)); 
		/*
		 * Falso em um primeiro momento porque como hashcode e equals não estão implementados,
		 * foi utilizado a referência de ponteiros. Iremos implementar as operações para evitar isso.
		 * Como agora os métodos foram implementados, o resultado foi true, porque agora a comparação foi por conteúdo 	
		 */
									

	}

}