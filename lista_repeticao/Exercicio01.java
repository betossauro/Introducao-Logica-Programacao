package lista_repeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o primeiro n�mero: ");
		double numeroA = teclado.nextDouble();
		double numeroB = 0;
		do {
			System.out.print("Insira o segundo n�mero: ");
			numeroB = teclado.nextDouble();
			if (numeroB == 0) {
				System.out.println("Valor Inv�lido!");
			}
		} while (numeroB == 0);
		double divisao = numeroA / numeroB;
		System.out.print("O resultado da divis�o �: " + divisao);
		teclado.close();
	}
}
