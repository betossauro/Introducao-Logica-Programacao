package lista_variaveis;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero:  ");
		int numero = teclado.nextInt();
		int numeroAntecessor = numero - 1;
		int numeroSucessor = numero +1;
		System.out.print("O n�mero antecessor de " + numero + " � " + 
		numeroAntecessor + " e o n�mero sucessor � " + numeroSucessor);

		teclado.close();
	}

}
