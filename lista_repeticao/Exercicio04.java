package lista_repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double numero = 0;
		double soma = 0;
		while (i <= 10) {
			System.out.print("Informe o " + i + "� n�mero: ");
			numero = teclado.nextDouble();
			soma += numero;
			i++;
		}
		System.out.println();
		double media = soma / 10;
		System.out.print("A m�dia dos n�meros �: " + media);
		teclado.close();
	}
}
