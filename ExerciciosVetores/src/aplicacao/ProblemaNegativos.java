package aplicacao;

import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int qtd = leia.nextInt();
		int [] negativos = new int[qtd];
		int posNeg = 0;
		for(int i = 0; i < qtd; i++) {
			System.out.println("Digite um número");
			int num = leia.nextInt();
			if(num < 0) {
				negativos[posNeg] = num;
				posNeg++;
			}
		}
		System.out.println("Números negativos: ");
		imprimirNumerosNegativos(negativos);
		leia.close();

	}
	public static void imprimirNumerosNegativos(int[] vetNegativos) {
		for(int i = 0; i < vetNegativos.length-1; i++) {
			System.out.println(vetNegativos[i]);
			
		}
	}

}
