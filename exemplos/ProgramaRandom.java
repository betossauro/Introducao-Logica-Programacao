package exemplos;

import java.util.Random;

public class ProgramaRandom {

	public static void main(String[] args) {
		Random gerador = new Random();
		for (int i = 0; i < 10; i++) {
			int numero = gerador.nextInt(10) + 1; // 10 -> nº de combinações (0, 1, 2..., 9)
			if (numero > 2) { // 2 em 10 = 20% 
				System.out.println("Sexta de dois pontos!!! - Sorteado:" + numero);
			} else {
				System.out.println("Sexta de três pontos!!! - Sorteado:" + numero);
			}
		}
	}

}
