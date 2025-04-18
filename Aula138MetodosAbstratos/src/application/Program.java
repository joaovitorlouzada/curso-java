package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int num = sc.nextInt();
		List <Shape> shapes = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Shape #" +(i+1)+ " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeOfShape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			if(typeOfShape == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				Shape shape = new Rectangle(Color.valueOf(color), width, height);
				shapes.add(shape);
			}
			else {
				System.out.println("Radius: ");
				Double radius = sc.nextDouble();
				Shape shape = new Circle(Color.valueOf(color), radius);
				shapes.add(shape);
			}
		}
		System.out.println("SHAPE AREAS: ");
		
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}

	}

}
