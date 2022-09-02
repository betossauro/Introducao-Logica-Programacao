package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio07_verificador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("N�meros primos");
		for(int i = 2; i <= 100; i++) {
			if (verificarNumeroPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.print("\nInforme um n�mero para verificar se � primo: ");
		int num = teclado.nextInt();
		boolean verificador = verificarNumeroPrimo(num);
		if (verificador) {
			System.out.println("O n�mero " + num + " � primo!");
		} else {
			System.out.println("O n�mero " + num + " n�o � primo!");
		}
		teclado.close();
	}

	static boolean verificarNumeroPrimo(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}