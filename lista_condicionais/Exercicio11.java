package lista_condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Insira a segunda nota: ");
		double nota2 = teclado.nextDouble();
		System.out.println("Insira a terceira nota: ");
		double nota3 = teclado.nextDouble();
		System.out.println("Insira a média dos exercícios: ");
		double notaExercicios = teclado.nextDouble();
		double mediaAproveitamento = ((nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicios) / 7);
		if (mediaAproveitamento >= 9.0) {
			System.out.println("O conceito do aluno é A");
		} else {
			if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
				System.out.println("O conceito do aluno é B");
			} else {
				if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
					System.out.println("O conceito do aluno é C");
				} else {
					System.out.println("O conceito do aluno é D");
				}
			}
		}
		teclado.close();
	}

}
