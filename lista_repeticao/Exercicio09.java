package lista_repeticao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int numero = 0;
		int maiorNumero = 0;
		int menorNumero = 0;
		int soma = 0;
		double media = 0;
		System.out.println("Defina a quantidade de n�meros: ");
		int numerosTotais = teclado.nextInt();
		while (numerosTotais > i) {
			System.out.println("Informe o n�mero: ");
			numero = teclado.nextInt();
			if (i == 0) {
				 maiorNumero = numero;
				 menorNumero = numero;
				}
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			if (numero < menorNumero) { // outro m�todo if (numero < menorNumero || menor == 0) {
				menorNumero = numero;
			}
			soma += numero;
			i++;
		}
		media = soma / numerosTotais;
		System.out.println("O maior n�mero �: " + maiorNumero + "\nO menor n�mero �: " + menorNumero + "\nA m�dia dos n�meros �: " + media);
		teclado.close();
	}
}
