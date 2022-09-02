package lista_procedimentos_funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Usuário definindo o tamanho do Array
		System.out.print("Informe quantos números deseja armazenar em um array: ");
		int tamanho = teclado.nextInt();
		int[] array = new int [tamanho];
		
		// Preenchendo o Array 
		for (int i = 0; i < array.length; i++) {
			System.out.print("Informe o " + (i+1) + " º número que deseja armazenar: ");
			array[i] = teclado.nextInt();
		}
		double media = calcularMedia(array);
		System.out.println("A média dos elementos é: " + media);
		identificarMenor(array);
		identificarMaior(array);
		teclado.close();
	}
	
	static void identificarMenor (int[] array) {
		Arrays.sort(array);
		System.out.println("O menor elemento é o: " + array[0]);
	}
	
	static void identificarMaior (int[] array) {
		System.out.println("O maior elemento é o: " + array[array.length - 1]);
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
