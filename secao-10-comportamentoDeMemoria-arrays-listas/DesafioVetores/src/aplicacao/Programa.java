package aplicacao;

import java.util.Scanner;
import entidades.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aluguel[] alugueis = new Aluguel[10];
		iniciarQuartosComoVazios(alugueis);
		
		System.out.println("Digite o número de quartos que seram alugados: ");
		int numQuartos = leia.nextInt();
		
		realizarAlugueis(alugueis, numQuartos, leia);
		System.out.println("Quartos ocupados: ");
		imprimirQuartosOcupados(alugueis);
		
		leia.close();
	}
	public static void iniciarQuartosComoVazios(Aluguel[] alugueis) {
		
		for(int i= 0; i < alugueis.length; i++) {
			alugueis[i] = new Aluguel();
			alugueis[i].setNome(null);
			alugueis[i].setEmail(null);
			alugueis[i].setNumQuarto(0);
			alugueis[i].setVago(true);
		}
	}
	public static void realizarAlugueis(Aluguel[] alugueis, int numQuartos, Scanner leia) {
		
		for(int i = 0; i < numQuartos; i++) {
			
			System.out.println("Aluguel #" +(i+1));
			leia.nextLine();
			System.out.println("Nome:");
			String nome = leia.nextLine();
			
			System.out.println("Email:");
			String email = leia.nextLine();
			
			System.out.println("Quarto:");
			int quarto = leia.nextInt();
			
			alugueis[quarto].setNome(nome);
			alugueis[quarto].setEmail(email);
			alugueis[quarto].setNumQuarto(quarto);
			alugueis[quarto].setVago(false);
		}
		
	}
	public static void imprimirQuartosOcupados(Aluguel[] alugueis) {
		
		for(int i = 0; i < alugueis.length; i++) {
			if(alugueis[i].isVago() == false) {
				System.out.println(alugueis[i]);
			}
		}
	}

}
