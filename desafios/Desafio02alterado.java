package desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio02alterado {

	static Random gerador = new Random();
	static int ponto1 = 0;
	static int ponto2 = 0;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Partida de Basquete");
		System.out.println("-------------------");
		System.out.print("Informe o primeiro time: ");
		String time1 = teclado.nextLine();
		System.out.print("Informe o segundo time: ");
		String time2 = teclado.nextLine();
		
		boolean posse1 = true; // a bola está para o time 1 ou 2, começa para o time 1
		if (gerador.nextInt(10) > 5) {
			posse1 = false; // porém, tem 50% de chance de começar para o time 2
		}
		
		int tempoPartida = 60 * 10; // 60 segundos * 10 minutos
		
		iniciarJogo(tempoPartida, posse1, time1, time2);
		teclado.close();
	}
	
	static void iniciarJogo(int tempoTotal, boolean posse1, String time1, String time2) {
		int tempoUsado = 0;
		int pontosGanhos = 0;
		
		while (tempoTotal > 0) {
			if (gerador.nextInt(10) > 3) { // se der mais que 3 (70%), sucesso no ataque
				tempoUsado = 30;
				if (gerador.nextInt(10) > 2) { // se der mais de 2 (80%), ganha 2 pontos, caso contrario, ganha 3
					pontosGanhos = 2;
				} else {
					pontosGanhos = 3;
				}
			} else {
				tempoUsado = 15;
				pontosGanhos = 0;
			}
			if ((posse1) && (tempoUsado == 30)){
				ponto1 += pontosGanhos;
				pontuacaoCesta(time1, pontosGanhos);
			} else if ((!posse1) && (tempoUsado == 30)){ 
				ponto2 += pontosGanhos;
				pontuacaoCesta(time2, pontosGanhos);
			}
			
			tempoTotal -= tempoUsado;
			posse1 = !posse1;
			
			if ((tempoTotal <= 0) && (ponto1 == ponto2)) {
				tempoTotal = 30;
			}
		}
		placarFinal(time1,ponto1,ponto2,time2);
	}

	static void pontuacaoCesta(String timeNome, int qtdPontos) {
		if (qtdPontos == 2) {
			System.out.println("A equipe " + timeNome + " fez uma cesta de 2 pontos.");
		} else {
			System.out.println("A equipe " + timeNome + " fez uma cesta de 3 pontos.");
		}
		System.out.println("----------------------------");
	}
	
	static void placarFinal(String time1, int ponto1, int ponto2, String time2) {
		System.out.println("Placar Final");
		System.out.println(time1 + " " + ponto1 + " X " + ponto2 + " " + time2);
		if (ponto1 > ponto2) {
			System.out.println(time1 + " é o vencedor!");
		} else {
			System.out.println(time2 + " é o time vencedor!");
		}
	}

}
