package lista_condicionais;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Informe as horas trabalhadas em um mês: ");
		double horasTrabalhadas = teclado.nextDouble();
		System.out.println("Informe o salário por hora: ");
		double salarioHora = teclado.nextDouble();
		if (horasTrabalhadas <= 160) { 
			double salarioTotal = (horasTrabalhadas * salarioHora );
			System.out.println("O salário total é de R$" + formatador.format(salarioTotal));
		} else { 
				double salarioHoraExtra = ((salarioHora * 1.5) * (horasTrabalhadas - 160 )) + (160 * salarioHora);
				System.out.println("O salário total com hora extra foi de R$" + formatador.format(salarioHoraExtra));
		}
		teclado.close();
	}

}
