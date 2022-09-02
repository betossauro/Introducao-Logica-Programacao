package lista_arrays;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double somaNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Insira a " + (i+1) +"ª nota: ");
			notas[i] = teclado.nextDouble();
			somaNotas += notas[i];
		}
		double media = somaNotas / notas.length;
		int notaAcimaMedia = 0;
		for (int i = 0; i < notas.length; i++) {
			if (media < notas[i]) {
				notaAcimaMedia++;
			}
		}
		System.out.println("A média da turma foi: " + media
				+ "\nA quantidade de alunos que tirou nota acima da média foi: " + notaAcimaMedia);
		teclado.close();
	}
}
