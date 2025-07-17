package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a largura e a altura do retângulo respectivamente");
		retangulo.largura = leia.nextDouble();
		retangulo.altura = leia.nextDouble();
		
		System.out.println("\n" +retangulo);
		

	}

}
