package exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Passagem_Parametros_Array {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] num = preencherValores();
		imprimirValores(num);
		System.out.println("\n------------");
		int soma = somar(num);
		System.out.println("Soma: " + soma);
		System.out.println("------------");
		imprimirValores(num);
		teclado.close();
	}

	static int[] preencherValores() {
		int[] numeros = new int[4];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número inteiro: ");
			numeros[i] = new Scanner(System.in).nextInt();
		}
		return numeros;
	}
	
	static int somar(int[] valores) {
		int total = 0;
		for(int i = 0; i < valores.length; i++) {
			total += valores[i];
		}
		Arrays.sort(valores);
		return total;
	}
	
	static void imprimirValores(int[] listaNumeros) {
		for(int i = 0; i < listaNumeros.length; i++) {
			System.out.print(listaNumeros[i] + " ");
		}
	}
}