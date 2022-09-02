package simulado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Informe a quantidade de caixas de Cura Tudo vendidos: ");
		int caixasVendidas = teclado.nextInt();
		double valorVendas = caixasVendidas * 50;
		if (valorVendas < 20000) {
			System.out.println("O valor a ser pago pelo cliente ser� de: R$" + formatador.format(valorVendas * 0.95));
		} else {
			if (valorVendas >= 20000 && valorVendas <= 50000) {
				System.out.println("O valor a ser pago pelo cliente ser� de: R$" + formatador.format(valorVendas * 0.9));
			} else {
				System.out.println("O valor a ser pago pelo cliente ser� de: R$" + formatador.format(valorVendas * 0.85));
			}
		}
		
		teclado.close();
	}
}
