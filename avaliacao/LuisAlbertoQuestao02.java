package avaliacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Informe a quantidade de garrafas de vinho: ");
		int quantidadeVinho = teclado.nextInt();
		System.out.print("Informe a quantidade de garrafas de refrigerante: ");
		int quantidadeRefrigerante = teclado.nextInt();
		System.out.print("Informe a quantidade de garrafas de água: ");
		int quantidadeAgua = teclado.nextInt();
		double valorVinho = quantidadeVinho * 50;
		double valorRefrigerante = quantidadeRefrigerante * 7;
		double valorAgua = quantidadeAgua * 3;
		if (valorVinho < 20000) {
			valorVinho = valorVinho * 0.95;
		} else {
			valorVinho = valorVinho * 0.90;
		}
		if (valorRefrigerante < 10000) {
			valorRefrigerante = valorRefrigerante * 0.96;
		} else {
			valorRefrigerante = valorRefrigerante * 0.94;
		}
		valorAgua = valorAgua * 0.97;
		System.out.println("O restaurante terá que pagar no total R$" + formatador.format(valorVinho + valorRefrigerante + valorAgua));
		
		
		teclado.close();
	}
}
