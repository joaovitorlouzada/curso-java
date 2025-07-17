package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos empregados seram registrados?");
		int n = leia.nextInt();
		List <Funcionario> listaFuncionarios = new ArrayList<>() ;

		for(int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Funcionário #" +(i+1)+ ":");
			System.out.print("Id:");
			leia.nextLine();
			String id = leia.nextLine();

			System.out.print("Nome:");
			String nome = leia.nextLine();

			System.out.print("Salario: ");
			Double salario = leia.nextDouble();

			Funcionario funcionario = new Funcionario(id,nome,salario);

			listaFuncionarios.add(funcionario);
		}
		System.out.print("Entre com o id do funcionário que receberá o aumenta salarial: ");
		leia.nextLine();
		String id = leia.nextLine();
		Funcionario funcionarioAReceberAumento = encontrarFuncionarioPorId(listaFuncionarios, id);
		System.out.println("Entre com a Porcentagem: ");
		double porcentagem = leia.nextDouble();
		funcionarioAReceberAumento.aumentarSalario(porcentagem);
		imprimirListaDeFuncionarios(listaFuncionarios);
		
		leia.close();

	}
	public static Funcionario encontrarFuncionarioPorId(List<Funcionario> listaFuncionarios, String id) {
		for(Funcionario funcionario : listaFuncionarios) {
			if(funcionario.getId().equals(id)) {
				return funcionario;
			}
		}
		return null;
	}
	public static void imprimirListaDeFuncionarios(List<Funcionario> listaFuncionarios) {
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}

	}

}
