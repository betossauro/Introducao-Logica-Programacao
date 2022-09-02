package lista_procedimentos_funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			array[i] = teclado.nextInt();
		}
		System.out.print("Deseja ordernar de forma crescente ou decrescente:"
				+ "\n1 - Ordem Crescente | 2 - Ordem Decrescente  : ");
		int escolha = teclado.nextInt();
		if (escolha == 1) {
			ordenarCrescente(array);
		} else {
			ordenarDecrescente(array);
		}
		teclado.close();
	}

	static void ordenarCrescente(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	static void ordenarDecrescente(int[] array) {
		Arrays.sort(array);
		for (int i = (array.length - 1); i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
