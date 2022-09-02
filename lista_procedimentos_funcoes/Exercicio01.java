package lista_procedimentos_funcoes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a idade do nadador: ");
		int idade = teclado.nextInt();
		identificarCategoria(idade);
		teclado.close();
	}

	static void identificarCategoria(int idade) {
		if (idade <= 10) {
			System.out.println("O nadador é da categoria: Mirim");
		} else {
			if (idade >= 11 && idade <= 14) {
				System.out.println("O nadador é da categoria: Infantil");
			} else {
				if (idade >= 15 && idade <= 19) {
					System.out.println("O nadador é da categoria: Juvenil");
				} else {
					System.out.println("O nadador é da categoria: Adulto");
				}
			}
		}
	}
}
