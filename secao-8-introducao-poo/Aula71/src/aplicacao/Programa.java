package aplicacao;

import java.util.Scanner;

import util.Calculadora;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do raio: ");
		double raio = leia.nextDouble();
		
		double c = Calculadora.circumferencia(raio);
		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculadora.PI);

	}

}
