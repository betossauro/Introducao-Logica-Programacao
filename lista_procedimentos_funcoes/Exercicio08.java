package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		int ladoA = teclado.nextInt();
		System.out.print("Informe o segundo valor: ");
		int ladoB = teclado.nextInt();
		System.out.print("Informe o terceiro valor: ");
		int ladoC = teclado.nextInt();
		boolean verificador = verificarTriangulo(ladoA, ladoB, ladoC);
		if (verificador) {
			classificarTriangulo(ladoA, ladoB, ladoC);
		}
		teclado.close();
	}
	
	static boolean verificarTriangulo(int ladoA, int ladoB, int ladoC) {
		boolean triangulo = false;
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			triangulo = true;
		} else {
			System.out.println("N�o � um tri�ngulo!");
		}
		return triangulo;
	}
	
	static void classificarTriangulo(int ladoA, int ladoB, int ladoC) {
		if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("� um tri�ngulo equil�tero!");
		} else {
			if (ladoA == ladoB || ladoA == ladoC) {
				System.out.println("� um tri�ngulo is�sceles!");
			} else {
				System.out.println("� um tri�ngulo escaleno!");
			}
		}
	}
}
