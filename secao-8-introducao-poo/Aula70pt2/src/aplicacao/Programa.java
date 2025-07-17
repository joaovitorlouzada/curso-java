package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("----------Entrada de Dados do Funcionário----------");
		System.out.println();
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nome = leia.nextLine();
		System.out.println("Digite o salário bruto do funcionário:" );
		funcionario.salarioBruto = leia.nextDouble();
		System.out.println("Digite o imposto sobre o salário do funcionário: ");
		funcionario.imposto = leia.nextDouble();
		
		System.out.println();
		System.out.println("----------Impressão de Dados do Funcionário----------");
		System.out.println("Funcionário: " +funcionario);
		
		System.out.println("\nQual a porcentagem de aumento salárial? ");
		double porcentagem = leia.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("\nDados atualizados do funcionário: " +funcionario);
		
		leia.close();

	}

}
