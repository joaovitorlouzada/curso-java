package apllication;


import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer > ps = new PrintService();
		
		System.out.print("How many values? ");
		int values = sc.nextInt();
		
		
		for(int i =0; i < values; i++) {
			ps.addValue(sc.nextInt());
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: " +ps.first());
		
		sc.close();


	}

}
