package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Insira o nome do produto: ");
		String produto = teclado.nextLine();
		System.out.println("Insira a quantidade adquirida: ");
		int quantidade = teclado.nextInt();
		System.out.println("Insira o valor unitário: ");
		double valorUnitario = teclado.nextDouble();
		double valorTotal = (quantidade * valorUnitario);
		if (quantidade <= 5) {
			System.out.print("O valor total com desconto do " + produto + " será de R$" 
						+ formatador.format(valorTotal * 0.98) + " \nO valor do desconto foi de R$" 
					+ formatador.format(valorTotal * 0.02));
		} else {
			if (quantidade > 5 && quantidade <= 10) {
				System.out.print("O valor total do produto " + produto + " será de R$" 
						+ formatador.format(valorTotal) + " \nO desconto foi de R$" 
						+ formatador.format(valorTotal * 0.03) + " \nTotalizando R$" 
						+ formatador.format(valorTotal * 0.97));
			} else {
				System.out.print("O valor total do " + produto + " será de R$" 
						+ formatador.format(valorTotal) + " \nO desconto foi de R$" 
						+ formatador.format(valorTotal * 0.05) + " \nTotalizando R$" 
						+ formatador.format(valorTotal * 0.95));
			}
		}
		teclado.close();
	}
}
