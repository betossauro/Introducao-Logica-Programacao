package lista_arrays;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Insira um nome: ");
			nomes[i] = teclado.nextLine();
		}
		System.out.println("Ordem digitada");
		for (int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i] + " ");
		}
		System.out.println("\nOrdem inversa digitada");
		for (int i = (nomes.length -1); i >= 0; i--) {
			System.out.print(nomes[i] + " ");
		}
		teclado.close();
	}
}
