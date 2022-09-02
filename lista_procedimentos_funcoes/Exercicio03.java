package lista_procedimentos_funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[3];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe as notas do aluno: ");
			notas[i] = teclado.nextDouble();
		}
		System.out.print("\nInforme que tipo de calculo deseja realizar: "
				+ "\n1 - Média Aritmética | 2 - Média Ponderada   : ");
		int tipo = teclado.nextInt();
		calcularMedia(notas, tipo);
		teclado.close();
	}

	static void calcularMedia(double[] notas, int tipo) {
		DecimalFormat formatador = new DecimalFormat("0.0");
		double somaNotas = 0;
		if (tipo == 1) {
			for (int i = 0; i < notas.length; i++) {
				somaNotas += notas[i];
			}
			double mediaAritmetica = somaNotas / notas.length;
			System.out.print("\nA média Aritmética do aluno foi: " + formatador.format(mediaAritmetica));
		} else {
			double mediaPonderada = ((notas[0]*5) + (notas[1]*3) + (notas[2]*2)) / (5 + 3 + 2);
			System.out.print("\nA média Ponderada do aluno foi: " + formatador.format(mediaPonderada));
		}
	}
}
