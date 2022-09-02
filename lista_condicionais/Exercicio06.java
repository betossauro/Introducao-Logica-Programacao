package lista_condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o time 1: ");
		String time1 = teclado.nextLine();
		System.out.println("Informe quantos gols o time 1 marcou: ");
		int golsTime1 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Informe o time 2: ");
		String time2 = teclado.nextLine();
		System.out.println("Informe quantos gols o time 2 marcou: ");
		int golsTime2 = teclado.nextInt();
		if (golsTime1 > golsTime2) {
			System.out.println("O time " + time1 + " ganhou a partida!");
		} else {
			if (golsTime1 < golsTime2) {
				System.out.println("O time " + time2 + " ganhou a partida!");
			} else {
				System.out.println("O jogo terminou em empate!");
			}
		}
		teclado.close();
	}

}
