package exemplos;

import java.util.Scanner;

public class Condicional_switch_case {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Boas vindas semestral!");
		System.out.println("1- Primeiro Semestre");
		System.out.println("2- Segundo Semestre");
		System.out.print("Digite um valor: ");
		int opcao = teclado.nextInt();
		switch(opcao) {
			case 1: {
				System.out.println("Bem vindo ao primeiro semestre do ano!");
				break;
			}
			case 2: {
				System.out.println("Bem vindo ao segundo semestre do ano!");
				break;
			}
			default: {
				System.out.println("Opção inválida!");
			}
		}
		teclado.close();
	}

}
