package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		int i = 0;
		double valorTotal = 0;
		System.out.print("Insira a quantidade (tipo) de mercadorias em estoque: ");
		int mercadoriaEstoque = teclado.nextInt();
		while (mercadoriaEstoque > i) {
			System.out.print("Informe o valor de cada mercadoria: ");
			double valorMercadoria = teclado.nextDouble();
			i++;
			valorTotal += valorMercadoria;
		}
		double valorMedio = valorTotal / mercadoriaEstoque;
		System.out.println("O valor total em estoque é de: R$" + formatador.format(valorTotal) + "\nO valor médio das mercadorias é de: R$" + formatador.format(valorMedio));
		teclado.close();
	}
}
