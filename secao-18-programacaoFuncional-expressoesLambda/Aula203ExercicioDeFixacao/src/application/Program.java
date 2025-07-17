package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		try(BufferedReader br = new BufferedReader(new FileReader(path))){

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();

			while(line != null) {
				
				String fields[] = line.split(",");
				//System.out.println(Arrays.toString(fields));
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
				
			}
			
			
			List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted((o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase())).collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than " +String.format("%.2f", salary));
			emails.forEach(System.out::println);
			
			double somaSalarios = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with M: "+String.format("%.2f", somaSalarios));

		}catch(IOException e) {
			System.out.println("Error: " +e.getMessage());
		}
		
		sc.close();

	}

}
