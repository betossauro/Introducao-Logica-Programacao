package lista_variaveis;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de ra��o em quilos: ");
		double racaoQuilos = teclado.nextDouble();
		System.out.print("\n Informe a quantidade de ra��o do Caramelo em gramas: ");
		double racaoCaramelo = teclado.nextDouble();
		System.out.print("\n Informe a quantidade de ra��o do Frajola em gramas: ");
		double racaoFrajola = teclado.nextDouble();
		double racaoTotalGramas = racaoQuilos * 1000;
		double racaoDiaria = racaoCaramelo + racaoFrajola;
		double racaoRestante = racaoTotalGramas - (racaoDiaria * 5);
		System.out.print("\n Restar� " + (racaoRestante / 1000) + 
		" quilos de ra��o ap�s 5 dias");

		teclado.close();
	}
}
