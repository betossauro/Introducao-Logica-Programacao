package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Informe a quantidade de quilos de morango: ");
		double kgMorango = teclado.nextDouble();
		System.out.println("Informe a quantidade de quilos de maças: ");
		double kgMaca = teclado.nextDouble();
		double totalPagar = 0;
		if (kgMorango <= 5) {
			totalPagar = totalPagar + (kgMorango * 2.50);
		} else { 
			totalPagar = totalPagar + (kgMorango * 2.20);
		}
		if (kgMaca <= 5) {
			totalPagar = totalPagar + (kgMaca * 1.80);
		} else {
			totalPagar = totalPagar + (kgMaca * 1.50);
		}
		if (totalPagar > 25.00 || (kgMorango + kgMaca) > 8.0) {
			totalPagar = (totalPagar * 0.90);
		}
		System.out.print("O valor total será de R$" + formatador.format(totalPagar));
		teclado.close();
	}
}
