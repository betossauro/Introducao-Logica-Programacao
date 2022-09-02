package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int [3][3];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Informe o valor da matrizA [" + i + "][" + j + "]: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		identificarMenorNumero(matrizA);
		teclado.close();
	}
	
	static void identificarMenorNumero(int[][] matrizA) {
		int menor = matrizA[0][0];
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j] < menor) {
					menor = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("O menor elemento da Matriz A é: " + menor
				+ "\nA posição do elemento na matriz é [" + (linha) + "][" + (coluna) + "]");
	}
}
