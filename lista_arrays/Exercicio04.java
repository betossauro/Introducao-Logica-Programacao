package lista_arrays;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Insira um n�mero: ");
			valores[i] = teclado.nextInt();
			if (valores[i] < 0) {
				System.out.println("Informe apenas n�mero positivo!");
				i--;
			}
		}
		int maior = valores[0];
		int menor = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
				posicaoMaior = i;
			}
			if (valores[i] < menor) {
				menor = valores[i];
				posicaoMenor = i;
			}
		}
		System.out.print("O maior valor � " + maior + " e est� localizado na posi��o " + (posicaoMaior + 1)
				+ "\nO menor valor � " + menor + " e est� localizado na posi��o " + (posicaoMenor + 1));

		teclado.close();
	}
}
