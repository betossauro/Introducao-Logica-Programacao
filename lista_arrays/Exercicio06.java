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
			System.out.print("Informe a média de temperatuda do " + (i + 1) + "º mês: ");
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
		System.out.println("A média de temperatura do ano foi de " + formatador.format(mediaTemperatura) + "ºC"
				+ "\nA menor temperatura média foi de " + menorTemperatura + "ºC"
				+ "\nA maior temperatura média foi de " + maiorTemperatura + "ºC"
				+ "\nA quantidade de meses em que a temperatura foi inferior à média anual foi de "
				+ contadorTemperaturasInferior + " meses");
		teclado.close();
	}
}
