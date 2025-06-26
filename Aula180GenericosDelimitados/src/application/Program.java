package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		List <Product> list = new ArrayList<>();
		
		try {
			File caminho = new File("C:\\Users\\joaov\\Desktop\\produtos.txt");
			Scanner sc = new Scanner(caminho);
			
			while(sc.hasNextLine()) {
				String linha = sc.nextLine();
				String [] partes = linha.split(",");
				
				String nome = partes[0].trim();
				double preco = Double.parseDouble(partes[1].trim());
				list.add(new Product(nome, preco));
			}
			Product product = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(product);
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}

	}

}
