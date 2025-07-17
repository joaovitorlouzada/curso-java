package aplicacao;

import java.util.Scanner;

import entidades.Pessoa;

public class ProblemaAlturas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int numPessoas = leia.nextInt();
		Pessoa[] vetPessoas = new Pessoa[numPessoas];
		registrarPessoas(vetPessoas, leia);
		System.out.println("Altura média: " +calcularAlturaMedia(vetPessoas));
		System.out.println("Pessoas com menos de 16 anos: " +calcularPorcentagemPessoasComMenosDe16(vetPessoas));
		imprimirNomeDasPessoasComMenosDe16(vetPessoas);
		leia.close();
	}
	public static void registrarPessoas(Pessoa[] vetPessoas, Scanner leia) {
		
		for(int i = 0 ; i < vetPessoas.length; i++) {
			
			vetPessoas[i] = new Pessoa();
			System.out.println("Dados da " + (i+1) +"a pessoa:");
			System.out.println("Nome:");
			leia.nextLine();
			String nome = leia.nextLine();
			vetPessoas[i].setNome(nome);
			
			System.out.println("Idade:");
			int idade = leia.nextInt();
			vetPessoas[i].setIdade(idade);
			
			System.out.println("Altura:");
			double altura = leia.nextDouble();
			vetPessoas[i].setAltura(altura);
		}
	}
	public static double calcularAlturaMedia(Pessoa[] vetPessoas) {
		double somaAltura = 0;
		for(int i = 0; i < vetPessoas.length ; i++) {
			somaAltura += vetPessoas[i].getAltura();
		}
		return somaAltura / vetPessoas.length;
		
	}
	public static double calcularPorcentagemPessoasComMenosDe16(Pessoa[] vetPessoas) {
	    double numPessoasComMenosDe16 = 0;
	    
	    
	    for (int i = 0; i < vetPessoas.length; i++) {
	        if (vetPessoas[i].getIdade() < 16) {
	            numPessoasComMenosDe16++;
	        }
	    }
	    double porcentagem = (numPessoasComMenosDe16 / vetPessoas.length) * 100;
	    
	    return porcentagem;
	}
	public static void imprimirNomeDasPessoasComMenosDe16(Pessoa[] vetPessoas) {
		 for (int i = 0; i < vetPessoas.length; i++) {
		        if (vetPessoas[i].getIdade() < 16) {
		            System.out.println(vetPessoas[i].getNome());
		        }
		    }
	}
}

