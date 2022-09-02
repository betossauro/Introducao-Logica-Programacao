package lista_arrays;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		//ex matriz sem interação: int[][] matrizA = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrizResultado = new int[3][3];
		for (int i = 0; i < matrizA.length; i++) { 
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "]: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		System.out.println("-----------------------");
		for (int i = 0; i < matrizB.length; i++) { 
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print("Informe o valor da matrizB [" + i + "][" + j + "]: ");
				matrizB[i][j] = teclado.nextInt();
			}
		}
		System.out.println();
		System.out.println("Essa é a matrizA");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Essa é a matrizB");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Essa é a matrizResultado");
		for (int i = 0; i < matrizB.length; i++) { 
			for (int j = 0; j < matrizB[i].length; j++) {
				matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
