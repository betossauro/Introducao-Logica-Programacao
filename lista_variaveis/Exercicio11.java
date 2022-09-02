package lista_variaveis;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		double nota1 = teclado.nextDouble();
		System.out.print("\n Digite a nota 2: ");
		double nota2 = teclado.nextDouble();
		System.out.print("\n Digite a nota 3: ");
		double nota3 = teclado.nextDouble();
		double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		System.out.print("\n A média é de: " + mediaPonderada);

		teclado.close();
	}

}
