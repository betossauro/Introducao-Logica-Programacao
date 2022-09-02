package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07switchcase {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Informe o tipo de combustível: (A -> Álcool e G -> Gasolina)");
		String combustivel = teclado.nextLine();
		System.out.println("Informe quantos litros foram vendidos: ");
		double litros = teclado.nextDouble();
		double valorTotal = 0;
		switch(combustivel) {
		case "A": {
			if (litros <= 20) {
				valorTotal = ((6.20 * litros) * 0.97);
			} else {
				valorTotal = ((6.20 * litros) * 0.95);
			}
			break;
		} 
		case "G": {
			if (litros <= 20) {
				valorTotal = ((6.90 * litros) * 0.94);
			} else {
				valorTotal = ((6.90 * litros) * 0.96);
			}
			break;
			}
		}
		System.out.println("O valor total do combustível é de R$" + formatador.format(valorTotal));
		teclado.close();
	}
}

