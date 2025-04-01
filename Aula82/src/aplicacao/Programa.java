package aplicacao;

import java.util.Scanner;
import entidades.ContaBancaria;

public class Programa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double valor = 0;
		ContaBancaria contaBancaria;

		System.out.println("Entre com o número da conta");
		String numConta = leia.nextLine();
		System.out.println("Entre com o nome da conta");
		String nome = leia.nextLine();
		System.out.println("Você realizará um deposito inicial? (s ou n)?");
		char opcao = leia.next().charAt(0);
		do {
			if(opcao != 's' && opcao != 'n') {
				System.out.println("Digite uma opção válida");
				opcao = leia.next().charAt(0);
			}

		}while(opcao != 's' && opcao != 'n');
		if(opcao == 's') {
			System.out.println("Digite o valor a ser depositado: ");
			valor = leia.nextDouble();
			contaBancaria = new ContaBancaria(numConta, nome, valor); 
		}
		else {
			contaBancaria = new ContaBancaria(numConta, nome);
		}
		
		System.out.println("Dados da conta:\n" +contaBancaria);
		System.out.println("Digite um valor para deposito:");
		valor = leia.nextDouble();
		contaBancaria.realizarDeposito(valor);
		System.out.println("Dados atualizados da conta: \n" +contaBancaria);
		System.out.println("Digite um valor para sacar: ");
		valor = leia.nextDouble();
		contaBancaria.realizarSaque(valor);
		System.out.println("Dados atualizados da conta: \n" +contaBancaria);
		
		leia.close();



	}

}
