package desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Partida de Basquete");
		System.out.println("-------------------");
		System.out.print("Informe o primeiro time: ");
		String time1 = teclado.nextLine();
		System.out.print("Informe o segundo time: ");
		String time2 = teclado.nextLine();
		System.out.println("---------------------------------------------------------");

		int tempoTotal = 60 * 10; // 60 segundos * 10 minutos

		boolean posse = gerarPosseInicial();

		iniciarJogo(tempoTotal, posse, time1, time2);
		teclado.close();
	}

	static boolean gerarPosseInicial() {
		Random gerador = new Random();
		boolean posse = true;
		for (int i = 0; i < 1; i++) {
			int numero = gerador.nextInt(10);
			if (numero > 5) {
				posse = false;
			}
		}
		return posse;
	}

	static void iniciarJogo(int tempoTotal, boolean posse, String time1, String time2) {
		int tempoUsado = 0;
		int pontosFeitos = 0;
		int ponto1 = 0;
		int ponto2 = 0;
		Random gerador = new Random();
		while (tempoTotal > 0) {
			for (int i = 0; i < 1; i++) {
				int numero = gerador.nextInt(10);
				if (numero > 3) { // se der mais que 3 (70%), sucesso no ataque
					tempoUsado = 30;
					pontosFeitos = calcularPontos(pontosFeitos);
				} else {
					tempoUsado = 15;
					pontosFeitos = 0;
				}
				tempoTotal -= tempoUsado;

				if ((posse) && (tempoUsado == 30)) { // se não utilizar "&& (tempoUsado == 30)" vai ser contado
														// pontuação de jogadas que não tiveram sucesso
					ponto1 += pontosFeitos;
					informarPontuacao(time1, pontosFeitos);
				} else {
					if ((!posse) && (tempoUsado == 30)) {
						ponto2 += pontosFeitos;
						informarPontuacao(time2, pontosFeitos);
					}
				}
				posse = !posse;

				if ((tempoTotal <= 0) && (ponto1 == ponto2)) {
					tempoTotal = 30;
				}
			}
		}
		informarVencedor(time1, ponto1, ponto2, time2);
	}

	static int calcularPontos(int pontos) {
		int pontosFeitos = 0;
		Random gerador = new Random();
		for (int i = 0; i < 1; i++) {
			int numero = gerador.nextInt(10);
			if (numero > 2) { // se der mais de 2 (80%), ganha 2 pontos, caso contrario, ganha 3
				pontosFeitos = 2;
			} else {
				pontosFeitos = 3;
			}
		}
		return pontosFeitos;
	}

	static void informarPontuacao(String timeNome, int qtdPontos) {
		if (qtdPontos == 2) {
			System.out.println("A equipe " + timeNome + " fez uma cesta de 2 pontos.");
		} else {
			System.out.println("A equipe " + timeNome + " fez uma cesta de 3 pontos.");
		}
		System.out.println("---------------------------------------------------------");
	}

	static void informarVencedor(String time1, int ponto1, int ponto2, String time2) {
		System.out.println("Placar Final");
		System.out.println(time1 + " " + ponto1 + " X " + ponto2 + " " + time2);
		if (ponto1 > ponto2) {
			System.out.println(time1 + " é o vencedor!");
		} else {
			System.out.println(time2 + " é o time vencedor!");
		}
	}

}
