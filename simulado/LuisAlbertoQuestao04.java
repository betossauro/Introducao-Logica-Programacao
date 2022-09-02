package simulado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double maiorPreco = 0;
		double menorPreco = 0;
		int componentes = 0;
		double totalValor = 0;
		int escolha = 0;
		do {
			System.out.print("Informe o valor do componente de fabrica��o do Cura tudo: R$");
			double valorComponente = teclado.nextDouble();
			totalValor += valorComponente;
			if (maiorPreco < valorComponente) {
				maiorPreco = valorComponente;
			}
			if (menorPreco > valorComponente || componentes == 0) {
				menorPreco = valorComponente;
			}
			componentes++;
			System.out.println("Deseja informar mais um componente? \n1 - SIM \n2 - N�O");
			escolha = teclado.nextInt();
		} while (escolha == 1);
		double media = totalValor / componentes;
		System.out.println("Foram informados " + componentes + " componentes "
				+ "\nA m�dia em reais dos componentes informados foi de: R$" + formatador.format(media)
				+ "\nO componente mais caro custou: R$" + formatador.format(maiorPreco) 
				+ "\nO componente mais barato custou: R$" + formatador.format(menorPreco));
		teclado.close();
	}
}
