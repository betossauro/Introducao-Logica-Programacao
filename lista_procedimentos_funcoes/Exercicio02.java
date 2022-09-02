package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a pontua��o do aluno: ");
		int nota = teclado.nextInt();
		calcularConceito(nota);
		teclado.close();
	}

	static void calcularConceito(int nota) {
		if (nota <= 60) {
			System.out.println("O conceito do aluno �: Insatisfat�rio");
		} else {
			if (nota >= 61 && nota <= 75) {
				System.out.println("O conceito do aluno �: Satisfat�rio");
			} else {
				if (nota >= 76 && nota <= 90) {
					System.out.println("O conceito do aluno �: Bom");
				} else {
					System.out.println("O conceito do aluno �: �timo");
				}
			}
		}
	}
}