package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		int matriz[][] = new int[n][n];
		int contadorNumerosNegativos = 0;
		
		for(int i=0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = leia.nextInt();
				if(matriz[i][j] < 0) {
					contadorNumerosNegativos++;
				}
			}
		}
		System.out.println();
		System.out.println("Diagonal Principal:");
		imprimirDiagonalPrincipal(matriz);
		System.out.println();
		System.out.println("Números Negativos: "+contadorNumerosNegativos);
		
		leia.close();

	}
	public static void imprimirDiagonalPrincipal(int matriz[][]) {
		for(int i=0; i< matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
	}

}
