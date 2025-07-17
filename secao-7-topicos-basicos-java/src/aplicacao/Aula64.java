package aplicacao;

import java.util.Scanner;
import entidades.Triangulo;

public class Aula64 {

	public static void main(String[] args) {
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre o valor do lados do Triângulo X ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		System.out.println("Entre o valor do lados do Triângulo Y ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.calcularAreaTriangulo();
		double areaY = y.calcularAreaTriangulo();
		
		System.out.printf("A área do triângulo X é :  %.4f%n", areaX);
		System.out.printf("A área do triângulo Y é :  %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do triângulo X é maior que a área do triângulo Y");
		}
		else {
			System.out.println("A área do triângulo Y é maior que a área do triângulo X");
		}
		
		leia.close();

	}

}
