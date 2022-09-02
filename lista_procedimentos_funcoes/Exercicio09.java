package lista_procedimentos_funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Informe um número: ");
			num[i] = teclado.nextInt();
		}
		System.out.println("Array Original");
		System.out.println("---------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		num = ordernarCrescente(num);
		System.out.println("\nArray Ordenado");
		System.out.println("---------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		teclado.close();
	}

	static int[] ordernarCrescente(int[] num) {
		int contador = 0;
		int[] valoresOrdenados = new int[num.length];
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				valoresOrdenados[contador] = num[i];
				contador++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				valoresOrdenados[contador] = num[i];
				contador++;
			}
		}
		return valoresOrdenados;
	}
}
