package lista_condicionais;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o c�digo de acesso: ");
		int acesso = teclado.nextInt();
		if (acesso != 12345) {
			System.out.print("Usu�rio inv�lido!");
		} else {
			System.out.println("Insira a senha de acesso: ");
			int senha = teclado.nextInt();
			if (senha != 54321) {
				System.out.print("Senha inv�lida!");
			} else {
				System.out.print("Acesso permitido!");
			}
		}
		teclado.close();
	}

}
