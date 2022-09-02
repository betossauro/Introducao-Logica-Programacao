package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Informe o tipo de combustível: (1 -> Álcool e 2 -> Gasolina)");
		int combustivel = teclado.nextInt();
		System.out.println("Informe quantos litros foram vendidos: ");
		double litros = teclado.nextDouble();
		double valorTotal = 0;
		if (combustivel == 1) {
			if (litros <= 20) {
				valorTotal = ((6.20 * litros) * 0.97);
			} else {
				valorTotal = ((6.20 * litros) * 0.95);
			}
		} else {
			if (litros <= 20) {
				valorTotal = ((6.90 * litros) * 0.94);
			} else {
				valorTotal = ((6.90 * litros) * 0.96);
			}
		}
		System.out.println("O valor total do combustivel é de R$" + formatador.format(valorTotal));
		teclado.close();
	}

}
