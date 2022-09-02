package lista_repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double numero = 0;
		int pares = 0;
		while (i <= 10) {
			System.out.print("Informe o " + i + "º número: ");
			numero = teclado.nextDouble();
			i++;
			if (numero % 2 == 0) {
				pares++;
			}
		}
		System.out.println();
		System.out.print("A quantidade de números pares é: " + pares);
		teclado.close();
	}
}
