package lista_repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor = 0;
		do {
			System.out.print("Insira um valor de 1 a 10: ");
			valor = teclado.nextInt();
			if (valor < 1 || valor > 10) {
				System.out.println("Valor Inválido!");
			}
		} while (valor < 1 || valor > 10);
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));
		}
		teclado.close();
	}
}
