package aplicacao;

import java.util.Scanner;

import entidades.Estudante;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o nome do estudante: ");
		estudante.nome = leia.nextLine();
		System.out.println("Digite as três notas do aluno, respectivamente: ");
		estudante.nota1 = leia.nextInt();
		estudante.nota2 = leia.nextInt();
		estudante.nota3 = leia.nextInt();
		
		System.out.println();
		System.out.println(estudante);
		
		leia.close();

	}

}
