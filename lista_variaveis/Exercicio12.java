package lista_variaveis;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de ração em quilos: ");
		double racaoQuilos = teclado.nextDouble();
		System.out.print("\n Informe a quantidade de ração do Caramelo em gramas: ");
		double racaoCaramelo = teclado.nextDouble();
		System.out.print("\n Informe a quantidade de ração do Frajola em gramas: ");
		double racaoFrajola = teclado.nextDouble();
		double racaoTotalGramas = racaoQuilos * 1000;
		double racaoDiaria = racaoCaramelo + racaoFrajola;
		double racaoRestante = racaoTotalGramas - (racaoDiaria * 5);
		System.out.print("\n Restará " + (racaoRestante / 1000) + 
		" quilos de ração após 5 dias");

		teclado.close();
	}
}
