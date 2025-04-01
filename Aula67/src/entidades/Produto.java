package entidades;

import java.util.Scanner;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome; 
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome; 
		this.preco = preco;
	}

	Scanner leia = new Scanner(System.in);

	public double calcularValorTotalEmEstoque() {
		return preco * quantidade;

	}
	public void adicionarProdutos(int quantidade) {
		//System.out.println("Digite a quantidade de produtos a serem adicionados no estoque: ");
		//int quantidadeASerAdicionada = leia.nextInt();
		this.quantidade += quantidade;

	}
	public void removerProdutos(int quantidade) {
		//		System.out.println("Digite a quantidade de produtos a serem removidos do estoque: ");
		//		int quantidadeASerRemovida = leia.nextInt();
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco) 
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", calcularValorTotalEmEstoque());
	}

}



