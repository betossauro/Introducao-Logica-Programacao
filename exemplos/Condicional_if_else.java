package exemplos;

import java.util.Scanner;

public class Condicional_if_else {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numeroA = 10;
		System.out.print("Digite um n�mero inteiro: ");
		int numeroB = teclado.nextInt();
		if(numeroA > 0) {
			System.out.println("N�mero A � um n�mero positivo");
		}
		
		if (numeroA > numeroB) {
			System.out.println("N�mero A maior que n�mero B!");
		} else {
			if (numeroA == numeroB) {
				System.out.println("N�mero A igual n�mero B!");
			} else {
				System.out.println("N�mero B maior que n�mero A!");
			}
		}
		teclado.close();
	}

}
