package lista_condicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade do produto no estoque: ");
		int quantidadeAtual = teclado.nextInt();
		System.out.println("Informe a quantidade máxima que este produto pode ter em estoque: ");
		int quantidadeMaxima = teclado.nextInt();
		System.out.println("Informe a quantidade mínima que este produto pode ter em estoque: ");
		int quantidadeMinima = teclado.nextInt();
		
		double quantidadeMedia = ((quantidadeMaxima + quantidadeMinima) / 2);
		System.out.println("A quantidade média do produto é de " + quantidadeMedia);
		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não é necessário efetuar a compra deste produto");
		} else {
			System.out.println("Efetuar a compra deste produto");
		}
		teclado.close();
	}

}
