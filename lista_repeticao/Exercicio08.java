package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double valorMercadoria = 0;
		double valorTotal = 0;
		int escolha = 0;
		int totalEstoque = 0;
		do {
			System.out.print("Informe o valor da mercadoria: ");
			valorMercadoria = teclado.nextDouble();
			valorTotal += valorMercadoria;
			totalEstoque++;
			System.out.println("Deseja informar uma mercadoria? \n1- Sim | 2- N�o");
			escolha = teclado.nextInt();
		} while (escolha == 1);
		double valorMedio = valorTotal / totalEstoque;
		System.out.println("O valor total em estoque � de: R$" + formatador.format(valorTotal)
				+ "\nO valor m�dio das mercadorias � de: R$" + formatador.format(valorMedio));
		teclado.close();
	}
}
