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
				System.out.print("Digite n�mero: ");
				primeiroNum = teclado.nextDouble();
				System.out.print("Digite n�mero: ");
				segundoNum = teclado.nextDouble();
			}
			switch (opcao) {
				case 1: {
					double soma = somar(primeiroNum, segundoNum);
					System.out.println("O resultado da soma �: " + soma);
					break;
				}
				case 2: {
					double subtracao = subtrair(primeiroNum, segundoNum);
					System.out.println("O resultado da subtra��o �: " + subtracao);
					break;
				}
				case 3: {
					double multiplicacao = multiplicar(primeiroNum, segundoNum);
					System.out.println("O resultado da multiplica��o �: " + multiplicacao);
					break;
				}
				case 4: {
					double divisao = dividir(primeiroNum, segundoNum);
					System.out.println("O resultado da divis�o �: " + divisao);
					break;
				}
				default: {
					System.out.println("Opera��o inv�lida! Informe uma das op��es dispon�veis!");
				}
			}
			opcao = apresentarMenu(teclado);
		}
		teclado.close();
	}

	static int apresentarMenu(Scanner teclado) {
		System.out.println("Informe a express�o que deseja realizar:" + "\n1 - Soma" + "\n2 - Subtra��o"
				+ "\n3 - Multiplica��o" + "\n4 - Divis�o" + "\n5 - Encerrar o programa");
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
