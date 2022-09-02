package exemplos;

import java.util.Scanner;

public class Passagem_Parametros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int valor1 = teclado.nextInt();
		System.out.print("Informe um número inteiro: ");
		int valor2 = teclado.nextInt();
		int soma = somar(valor1, valor2);
		System.out.println("Valor 1: " + valor1 
				+ "\nValor 2: " + valor2
				+ "\nSoma: " + soma);
		teclado.close();
	}
	
	static int somar(int valor1, int numeroB) {
		int total = valor1 + numeroB;
		valor1 = valor1 * 10;
		return total;
	}
}
