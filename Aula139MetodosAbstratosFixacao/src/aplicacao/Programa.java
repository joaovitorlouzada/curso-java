package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.*;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com o número de contribuintes: ");
		int num = leia.nextInt();
		
		List <Contribuinte> contribuintes = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Dados do contribuinte #" +(i+1));
			System.out.print("Pessoa fisica ou Pessoa Juridica (f/j):  ");
			char tipoDeContribuinte = leia.next().charAt(0);
			leia.nextLine();
			System.out.print("Nome:");
			String nome = leia.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = leia.nextDouble();
			if(tipoDeContribuinte == 'f') {
				System.out.print("Gastos de Saúde: ");
				Double gastosDeSaude = leia.nextDouble();
				Contribuinte countribuinte = new PessoaFisica(nome, rendaAnual, gastosDeSaude);
				contribuintes.add(countribuinte);
			}
			else {
				System.out.print("Número de empregados: ");
				int numeroDeEmpregados = leia.nextInt();
				Contribuinte contribuinte = new PessoaJuridica(nome,rendaAnual, numeroDeEmpregados);
				contribuintes.add(contribuinte);
			}
		}
		System.out.println();
		System.out.println("Impostos Pagos: ");
		Double soma = 0.0;
		
		for(Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte.getNome()+ ": $ " + String.format("%.2f", contribuinte.calcularImposto()));
			soma += contribuinte.calcularImposto();
		}
		
		System.out.println();
		System.out.println("Impostos Totais: $ " +String.format("%.2f",soma));
		
		leia.close();

	}

}
