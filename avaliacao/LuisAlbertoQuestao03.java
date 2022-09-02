package avaliacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		int i = 0;
		double contaMaisCara = 0;
		double contaMaisBarata = 0;
		while (i < 10) {
			System.out.print("Informe quanto o " + (i + 1) + "º cliente pagou: R$");
			double valorPago = teclado.nextDouble();
			if (contaMaisCara < valorPago) {
				contaMaisCara = valorPago;
			}
			if (contaMaisBarata > valorPago || i == 0) {
				contaMaisBarata = valorPago;
			}
			i++;
		}
		System.out.println("A maior conta paga foi de R$" + formatador.format(contaMaisCara) 
			+ "\nA menor conta paga foi de R$" + formatador.format(contaMaisBarata));
		
		teclado.close();
	}
}
