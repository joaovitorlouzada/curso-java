package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		int m = leia.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matriz[i][j] = leia.nextInt();
			}
		}
		System.out.println("Digite o número a ser buscado na matriz: ");
		n = leia.nextInt();
		encontrarIndexDeUmNumeroDaMatriz(matriz, n, leia);
		leia.close();

	}
	public static void encontrarIndexDeUmNumeroDaMatriz(int[][] matriz, int numero, Scanner leia) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numero) {
					imprimirDetalhesDeUmNumeroDaMatrizPeloSeuIndex(matriz, i, j);
//					System.out.println("Posição" +i+ "," +j);
//					System.out.println("Esquerda: " +matriz[i][j-1]);
//					System.out.println("Direita: " +matriz[i][j+1]);
//					System.out.println("Embaixo: " +matriz[i+1][j]);
				}
			}
		}
	}
	public static void imprimirDetalhesDeUmNumeroDaMatrizPeloSeuIndex(int[][] matriz, int i, int j) {
		System.out.println("Posição " +i+ "," +j);
		if(j > 0) {
			System.out.println("Esquerda: " +matriz[i][j-1]);
		}
		else {
			System.out.println("Esquerda: Não existe");
		}
		if(j < matriz[i].length - 1) {
			System.out.println("Direita: " +matriz[i][j+1]);
		}
		else {
            System.out.println("Direita: Não existe");
        }
        if (i < matriz.length - 1) {
            System.out.println("Embaixo: " + matriz[i + 1][j]);
        } else {
            System.out.println("Embaixo: Não existe");
        }
		
	}

}
