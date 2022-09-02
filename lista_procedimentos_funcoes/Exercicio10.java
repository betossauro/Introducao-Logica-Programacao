package lista_procedimentos_funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Usu�rio definindo o tamanho do Array
		System.out.print("Informe quantos n�meros deseja armazenar em um array: ");
		int tamanho = teclado.nextInt();
		int[] array = new int [tamanho];
		
		// Preenchendo o Array 
		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i+1) + " � n�mero que deseja armazenar: ");
			array[i] = teclado.nextInt();
		}
		double media = calcularMedia(array);
		System.out.println("A m�dia dos elementos �: " + media);
		identificarMenor(array);
		identificarMaior(array);
		teclado.close();
	}
	
	static void identificarMenor (int[] array) {
		Arrays.sort(array);
		System.out.println("O menor elemento � o: " + array[0]);
	}
	
	static void identificarMaior (int[] array) {
		System.out.println("O maior elemento � o: " + array[array.length - 1]);
	}
	
	static double calcularMedia (int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		double media = total / array.length;
		return media;
	}
}
