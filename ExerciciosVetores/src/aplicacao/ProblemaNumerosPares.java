package aplicacao;

import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos números você quer digitar?");
		int qtd = leia.nextInt();
		int[] vet = new int[qtd];
		
		for(int i = 0 ; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			int num = leia.nextInt();
			vet[i] = num;
		}
		obterNumerosParesDoVetor(vet);

	}
	public static void obterNumerosParesDoVetor(int[] vet) {
		int qtdPares = 0;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				System.out.printf("%d " ,vet[i]);
				qtdPares++;
			}
		}
		System.out.println("\nQuantidade de pares = " +qtdPares);
	}

}
