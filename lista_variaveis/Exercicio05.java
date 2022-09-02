package lista_variaveis;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número:  ");
		int numero = teclado.nextInt();
		int numeroAntecessor = numero - 1;
		int numeroSucessor = numero +1;
		System.out.print("O número antecessor de " + numero + " é " + 
		numeroAntecessor + " e o número sucessor é " + numeroSucessor);

		teclado.close();
	}

}
