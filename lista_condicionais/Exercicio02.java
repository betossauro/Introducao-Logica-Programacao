package lista_condicionais;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Insira a primeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Insira a segunda nota: ");
		double nota2 = teclado.nextDouble();
		double mediaAritmetica = ((nota1 + nota2)/2);
		if (mediaAritmetica >= 7) {
			System.out.println("O aluno foi aprovado com a média: " 
						+ formatador.format(mediaAritmetica));
		} else {
			System.out.println("O aluno foi reprovado com a média: "
						+ formatador.format(mediaAritmetica));
		}
		teclado.close();
	}

}
