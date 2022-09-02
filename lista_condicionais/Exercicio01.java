package lista_condicionais;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Insira a quantidade de maçãs que deseja comprar: ");
		int quantidadeComprada = teclado.nextInt();
		if (quantidadeComprada < 12) {
			double valorMacaInd = 1.30;
			System.out.println("O valor da compra será de: R$" + 
					formatador.format(valorMacaInd * quantidadeComprada));
		} else {
			if (quantidadeComprada >= 12) {
				double valorMacaDuzia = 1.00;
				System.out.println("O valor da compra será de: R$" + 
						formatador.format(valorMacaDuzia * quantidadeComprada));
			}
		}
		teclado.close();		
	}

}
