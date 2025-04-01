package aplicacao;

import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int qtd = leia.nextInt();
		int vet[] = new int[qtd];
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Digite um número: ");
			int num = leia.nextInt();
			vet[i] = num;
		}
		System.out.println("Soma: " +calcularSoma(vet));
		System.out.println("Média: " +calcularMedia(vet));
		leia.close();
		
				

	}
	public static int calcularSoma(int[] vet) {
		int soma = 0;
		for(int i = 0; i < vet.length; i++) {
			soma = soma + vet[i];
		}
		return soma;
	}
	public static int calcularMedia(int[] vet) {
		int soma = 0;
		for(int i = 0; i < vet.length ; i++) {
			soma += vet[i];
		}
		return soma / vet.length;
	}

}
