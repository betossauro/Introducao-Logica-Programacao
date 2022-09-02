package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularMedias_Do_While {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		int contador = 0;
		do {
			System.out.print("Informe o nome do aluno: ");
			String nome = teclado.nextLine();
			System.out.print("Informe a primeira nota: ");
			double nota1 = teclado.nextDouble();
			System.out.print("Informe a segunda nota: ");
			double nota2 = teclado.nextDouble();
			double media = (nota1 + nota2)/2;
			System.out.println("Aluno: " + nome + ", teve média: " + formatador.format(media));
			contador++;
			teclado.nextLine();
			System.out.println();
			} while (contador < 2);
		teclado.close();
	}
}
