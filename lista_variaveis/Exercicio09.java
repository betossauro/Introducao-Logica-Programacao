package lista_variaveis;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o modelo do carro: ");
		String modeloInserido = teclado.nextLine();
		System.out.print("\n Insira o custo de fábrica: ");
		double custoFabrica = teclado.nextDouble();
		String modeloCarro = modeloInserido;
		double custoFinal = custoFabrica + (custoFabrica * 0.28) + 
		(custoFabrica * 0.45);
		System.out.print("\n O modelo " + modeloCarro + " custa o valor de R$" 
		+ custoFinal);

		teclado.close();

	}

}
