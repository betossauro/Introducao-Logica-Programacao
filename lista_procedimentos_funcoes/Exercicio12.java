package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = apresentarMenu(teclado);
		double primeiroNum = 0;
		double segundoNum = 0;
		while (opcao != 5) {
			if (opcao > 0 && opcao < 5) {
				System.out.print("Digite número: ");
				primeiroNum = teclado.nextDouble();
				System.out.print("Digite número: ");
				segundoNum = teclado.nextDouble();
			}
			switch (opcao) {
				case 1: {
					double soma = somar(primeiroNum, segundoNum);
					System.out.println("O resultado da soma é: " + soma);
					break;
				}
				case 2: {
					double subtracao = subtrair(primeiroNum, segundoNum);
					System.out.println("O resultado da subtração é: " + subtracao);
					break;
				}
				case 3: {
					double multiplicacao = multiplicar(primeiroNum, segundoNum);
					System.out.println("O resultado da multiplicação é: " + multiplicacao);
					break;
				}
				case 4: {
					double divisao = dividir(primeiroNum, segundoNum);
					System.out.println("O resultado da divisão é: " + divisao);
					break;
				}
				default: {
					System.out.println("Operação inválida! Informe uma das opções disponíveis!");
				}
			}
			opcao = apresentarMenu(teclado);
		}
		teclado.close();
	}

	static int apresentarMenu(Scanner teclado) {
		System.out.println("Informe a expressão que deseja realizar:" + "\n1 - Soma" + "\n2 - Subtração"
				+ "\n3 - Multiplicação" + "\n4 - Divisão" + "\n5 - Encerrar o programa");
		int escolha = teclado.nextInt();
		return escolha;
	}

	static double somar(double primeiroNum, double segundoNum) {
		double total = primeiroNum + segundoNum;
		return total;
	}

	static double subtrair(double primeiroNum, double segundoNum) {
		double total = primeiroNum - segundoNum;
		return total;
	}

	static double multiplicar(double primeiroNum, double segundoNum) {
		double total = primeiroNum * segundoNum;
		return total;
	}

	static double dividir(double primeiroNum, double segundoNum) {
		double total = primeiroNum / segundoNum;
		return total;
	}
}
