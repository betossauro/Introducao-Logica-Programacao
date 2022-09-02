package exemplos;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [][] valores = new int [2][3];
		for (int i = 0; i < valores.length; i++) { // Acessar a informação de quantas linhas tem a Matriz
			for (int j = 0; j < valores[i].length; j++) { 
				System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
				valores[i][j] = teclado.nextInt();
			}
		}
		System.out.println("-----------------------");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) { // Acessar a informação de quantas colunas tem a Matriz
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
