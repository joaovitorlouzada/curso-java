package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int num = sc.nextInt();
		
		List <Employee> employees = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Employee #" +(i+1)+ " data");
			System.out.print("Outsourced (y/n)? ");
			char isEmployeeOutsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(isEmployeeOutsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name,hours, valuePerHour, additionalCharge); 
				employees.add(employee);
			}
			else {
				Employee employee = new Employee(name,hours, valuePerHour);
				employees.add(employee);
			}
		}
		System.out.println("PAYMENTS: ");
		for(Employee employee : employees) {
			System.out.print(employee.getName()+ " - " + "$ " + employee.payment());
			System.out.println();
		}
		
		sc.close();
	}

}
