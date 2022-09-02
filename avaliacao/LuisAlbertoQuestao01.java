package avaliacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Informe o valor do prato de entrada: R$");
		double valorEntrada = teclado.nextDouble();
		System.out.print("Informe o valor do prato principal: R$");
		double valorPrincipal = teclado.nextDouble();
		System.out.print("Informe o valor da sobremesa: R$");
		double valorSobremesa = teclado.nextDouble();
		System.out.print("Informe o valor da bebida: R$");
		double valorBebida = teclado.nextDouble();
		System.out.println("O cliente deverá pagar o total de R$" 
				+ formatador.format((valorEntrada + valorPrincipal + valorSobremesa + valorBebida) * 1.1) 
				+ "\nA taxa do garçom está inclusa.");
		
		teclado.close();
	}
}
