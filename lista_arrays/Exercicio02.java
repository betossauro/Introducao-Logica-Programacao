package lista_arrays;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Informe um valor: ");
			valores[i] = teclado.nextInt();
		}
		System.out.print("Informe um novo valor: ");
		int busca = teclado.nextInt();
		boolean localizado = false;
		for (int i = 0; i < valores.length; i++) {
			if (busca == valores[i]) {
				localizado = true;
			}
		}
		if (localizado) {
			System.out.println("Achei!");
		} else { 
			System.out.println("Não achei!");
		}
		teclado.close();
	}
}
