package lista_condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o hor�rio de in�cio da partida de Xadrez: ");
		int horaInicio = teclado.nextInt();
		System.out.println("Insira o hor�rio final da partida de Xadrez: ");
		int horaFinal = teclado.nextInt();
		if (horaInicio > horaFinal) {
			int duracaoPartida = ((24 - horaInicio) + horaFinal);
			System.out.println("A dura��o da partida foi de " + duracaoPartida + " horas");
		} else {
				int duracaoPartida = ((horaInicio - horaFinal) * -1);
				System.out.println("A dura��o da partida foi de " + duracaoPartida + " horas");
		}
		teclado.close();
	}
}
