package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Em um portal de cursos online, cada usuário possui um código único, representado por
   um número inteiro.
   Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
   matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
   é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
   alunos repetidos em mais de um curso.
   O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
   Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
   quantidade total e alunos dele, conforme exemplo.
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int qtdCourseA = sc.nextInt();
		Set<Integer> courseA = new HashSet<>();
		
		for(int i = 0 ; i < qtdCourseA; i++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int qtdCourseB = sc.nextInt();
		Set<Integer> courseB = new HashSet<>();
		
		for(int i = 0 ; i < qtdCourseB; i++) {
			courseB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int qtdCourseC = sc.nextInt();
		Set<Integer> courseC = new HashSet<>();
		
		for(int i = 0 ; i < qtdCourseC; i++) {
			courseC.add(sc.nextInt());
		}
		
		courseA.addAll(courseC);
		courseA.addAll(courseB);
		System.out.println("Total students: " +courseA.size());
		
	}

}
