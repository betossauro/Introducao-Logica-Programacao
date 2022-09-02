package lista_arrays;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		for (int i = 0; i < matrizA.length;i++) {
			for (int j = 0; j < matrizA.length;j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "]: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		int menor = matrizA[0][0];
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < matrizA.length;i++) {
			for (int j = 0; j < matrizA.length;j++) {
				if (matrizA[i][j] < menor) {
					menor = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("Essa é matrizA");
		for (int i = 0; i < matrizA.length;i++) {
			for (int j = 0; j < matrizA.length;j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("O menor valor é " + menor + " e está localizado na linha " 
		+ (linha+1) + " e na coluna " + (coluna+1));
		teclado.close();
	}
}
