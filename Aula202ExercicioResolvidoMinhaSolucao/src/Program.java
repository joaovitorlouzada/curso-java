import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.Collectors;


import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		double total = 0.0;
		int numProdutos = 0;
		
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			 String line = br.readLine();

			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				numProdutos++;
				total += Double.parseDouble(fields[1]);
				line = br.readLine();
			}
			double media = total/numProdutos;
			System.out.println("Média de preço " +String.format("%.2f",total/numProdutos));
			
			List<Product> newList = list.stream().filter(x -> x.getPrice() <= media).sorted(Comparator.comparing(Product::getName).reversed()).collect(Collectors.toList());
			for(Product p : newList) {
				System.out.println(p);
			}
			
		}catch(IOException e) {
			System.out.println("Error: " +e.getMessage());
		}

	}

}
