package lista_arrays;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Informe um valor: ");
			valores[i] = teclado.nextInt();
		}
		System.out.print("Informe um novo valor: ");
		int busca = teclado.nextInt();
		int aparece = 0;
		for (int i = 0; i < valores.length; i++) {
			if (busca == valores[i]) {
				aparece++;
			}
		}
			System.out.println("O número " + busca + " aparece " + aparece + " vezes.");
		teclado.close();
	}
}
