package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do produto: ");
		String nome = leia.nextLine();
		System.out.println("Digite o preço do produto: ");
		double preco = leia.nextDouble();
		System.out.println("Digite a quantidade do produto: ");
		int quantidade = leia.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);
		System.out.println();
		System.out.println("Dados do produto: " +produto);
		
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos a serem adicionados no estoque: ");
		quantidade = leia.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto atualizados: " +produto);
		System.out.println();
		
		System.out.println("Entre com a quantidade de produtos a serem removidos do estoque: ");
		quantidade = leia.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados do produto atualizados: " +produto);
		
		leia.close();
		

	}

}
