package aplicacao;

import java.util.Scanner;

import util.Conversor;


public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a cotação atual do dólar: ");
		double cotacao = leia.nextDouble();
		System.out.println("Digite quantos dólares seram comprados: ");
		double dolaresASeremComprados = leia.nextDouble();
		System.out.printf("Valor a ser pago em reais: %.2f%n",Conversor.calcularValorASerPago(cotacao, dolaresASeremComprados) );
		
		leia.close();
		

	}

}
