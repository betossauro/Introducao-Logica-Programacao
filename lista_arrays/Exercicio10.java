package lista_arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Insira o " + (i + 1) + "º número: ");
			valores[i] = teclado.nextInt();
		}
		
//		Método Arrays.sort
		
//		Arrays.sort(valores);   // -->  Método mais comum de ordenar de forma crescente.
//		System.out.println("Números Ordenados");
//		for (int i = 0; i < valores.length; i++) {
//			System.out.print(valores[i] + " ");
//		}

//		Método Bubble sort:

		System.out.println("Array");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
		System.out.println("Números Ordenados");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length - 1; j++) {
				if (valores[j] > valores[j + 1]) {
					int aux = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = aux;
				}

			}
		}
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
		System.out.println("Números Ordenados Decrescente");
		for (int i = (valores.length - 1); i >= 0; i--) {
			System.out.print(valores[i] + " ");
		}
		teclado.close();
	}
}
