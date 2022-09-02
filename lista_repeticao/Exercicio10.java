package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		int contadorPopulacao = 0;
		int contadorFilhos = 0;
		double acumuladorFilhos = 0;
		double populacaoTotal = 0;
		double salario = 0;
		double maiorSalario = 0;
		double acumuladorSalario = 0;
		int contadorSalarioInferior = 0;
		int opcao = 0;
		do {
			System.out.print("Insira o seu salário: ");
			salario = teclado.nextDouble();
			System.out.print("Informe quantos filhos você tem: ");
			contadorFilhos = teclado.nextInt();
			System.out.println("Deseja inserir as informações para mais um habitante? \n1- Sim | 2- Não");
			opcao = teclado.nextInt();
			contadorPopulacao++;
			if (salario < 1000) {
				contadorSalarioInferior++;
			}
			acumuladorSalario += salario;
			acumuladorFilhos += contadorFilhos;
			populacaoTotal = acumuladorFilhos + contadorPopulacao;
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
		} while (opcao == 1);
		double percentualSalarioInferior = (contadorSalarioInferior * 100) / contadorPopulacao;
		double mediaSalario = acumuladorSalario / contadorPopulacao;
		double mediaFilhos = acumuladorFilhos / populacaoTotal;
		System.out.println("A média de salário da população é de: R$" + formatador.format(mediaSalario)
				+ "\nA média do número de filhos é de: " + formatador.format(mediaFilhos) + "\nO maior salário dos habitantes é de: R$"
				+ formatador.format(maiorSalario) + "\nO percentual de pessoas com salário menor que R$1000,00 é de: "
				+ formatador.format(percentualSalarioInferior) + "%");
		teclado.close();
	}
}
