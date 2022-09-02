package simulado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double maiorPreco = 0;
		double menorPreco = 0;
		int i = 0;
		do {
			System.out.print("Informe o valor do componente de fabrica��o do Cura tudo: R$");
			double valorComponente = teclado.nextDouble();
			if (maiorPreco < valorComponente) {
				maiorPreco = valorComponente;
			}
			if (menorPreco > valorComponente || i == 0) {
				menorPreco = valorComponente;
			}
			i++;
		} while (i < 10);
		System.out.println("O componente mais caro custou: R$" + formatador.format(maiorPreco) 
				+ "\nO componente mais barato custou: R$" + formatador.format(menorPreco));
		teclado.close();
	}
}
