package lista_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double[] temperaturas = new double[12];
		double somaTemperaturas = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Informe a m�dia de temperatuda do " + (i + 1) + "� m�s: ");
			temperaturas[i] = teclado.nextDouble();
			somaTemperaturas += temperaturas[i];
		}
		int contadorTemperaturasInferior = 0;
		double maiorTemperatura = temperaturas[0];
		double menorTemperatura = temperaturas[0];
		double mediaTemperatura = somaTemperaturas / temperaturas.length;
		for (int i = 0; i < temperaturas.length; i++) {
			if (maiorTemperatura < temperaturas[i]) {
				maiorTemperatura = temperaturas[i];
			}
			if (menorTemperatura > temperaturas[i]) {
				menorTemperatura = temperaturas[i];
			}
			if (mediaTemperatura > temperaturas[i]) {
				contadorTemperaturasInferior++;
			}
		}
		System.out.println("A m�dia de temperatura do ano foi de " + formatador.format(mediaTemperatura) + "�C"
				+ "\nA menor temperatura m�dia foi de " + menorTemperatura + "�C"
				+ "\nA maior temperatura m�dia foi de " + maiorTemperatura + "�C"
				+ "\nA quantidade de meses em que a temperatura foi inferior � m�dia anual foi de "
				+ contadorTemperaturasInferior + " meses");
		teclado.close();
	}
}
