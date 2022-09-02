package exemplos;

import java.util.Scanner;

public class Condicional_if_else {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numeroA = 10;
		System.out.print("Digite um número inteiro: ");
		int numeroB = teclado.nextInt();
		if(numeroA > 0) {
			System.out.println("Número A é um número positivo");
		}
		
		if (numeroA > numeroB) {
			System.out.println("Número A maior que número B!");
		} else {
			if (numeroA == numeroB) {
				System.out.println("Número A igual número B!");
			} else {
				System.out.println("Número B maior que número A!");
			}
		}
		teclado.close();
	}

}
