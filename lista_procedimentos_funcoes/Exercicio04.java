package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[3][4];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "]: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		int numerosPares = contarNumerosPares(matrizA);
		System.out.println("A Matriz A possui " + numerosPares + " números pares.");
		teclado.close();
	}

	static int contarNumerosPares(int[][] matrizA) {
		int pares = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j] % 2 == 0) {
					pares++;
				}
			}
		}
		return pares;
	}
}