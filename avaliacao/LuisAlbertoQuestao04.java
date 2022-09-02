package avaliacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		int cliente = 0;
		int escolha = 0;
		double valorTotal = 0;
		double contaMaisCara = 0;
		double contaMaisBarata = 0;
		do {
			System.out.print("Informe o valor pago pelo cliente: R$");
			double valorPago = teclado.nextDouble();
			cliente++;
			valorTotal += valorPago;
			if (contaMaisCara < valorPago) {
				contaMaisCara = valorPago;
			}
			if (contaMaisBarata > valorPago || cliente == 0) {
				contaMaisBarata = valorPago;
			}
			System.out.println("Deseja informar a conta de mais um cliente? \n1 - SIM | 2 - N�O");
			escolha = teclado.nextInt();
		} while (escolha == 1);
		double media = valorTotal / cliente;
		System.out.println("Foram atendidos " + cliente + " clientes nesta noite. "
				+ "\nA média das contas pagas foi de R$" + formatador.format(media) 
				+ "\nA maior conta paga foi de R$" + formatador.format(contaMaisCara) 
				+ "\nA menor conta paga foi de R$" + formatador.format(contaMaisBarata));
		
		teclado.close();
	}
}
