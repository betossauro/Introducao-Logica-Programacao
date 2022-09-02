package lista_arrays;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] valores = new int[3][3];
		int[][] matrizResultado = new int[3][3];
		for (int i = 0; i < valores.length; i++) { 
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print("Informe o valor da matriz A [" + i + "][" + j + "]: ");
				valores[i][j] = teclado.nextInt();
			}
		}
		System.out.println("Informe um número: ");
		int numero = teclado.nextInt();
		System.out.println("Esta é a Matriz A");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nEsta é a Matriz Resultado");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				matrizResultado[i][j] = valores[i][j] * numero;
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
