package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "]: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		int somaDiagonal = somarDiagonalPrincipal(matrizA);
		System.out.println("A soma da diagonal principal da matriz A é: " + somaDiagonal);
		teclado.close();
	}

	static int somarDiagonalPrincipal(int[][] matrizA) {
		int soma = 0;
//		for (int i = 0; i < matrizA.length; i++) {
//			for (int j = 0; j < matrizA[i].length; j++) {
//				if (i == j) {
//					soma += matrizA[i][j];
//				}
//			}
//		}
		
		for (int i = 0; i < matrizA.length; i++) {
			soma += matrizA[i][i];
		}
		
		return soma;
	}
}
