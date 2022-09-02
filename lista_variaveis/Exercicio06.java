package lista_variaveis;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite sua idade expressada em anos, "
		+ "meses e dias (Ex: 22 anos 7 meses e 23 dias) \n" +
		"Informe os anos: ");
		int idadeAno = teclado.nextInt();
		System.out.print("\n Informe os meses: ");
		int idadeMes = teclado.nextInt();
		System.out.print("\n Informe os dias: ");
		int idadeDia = teclado.nextInt();
		int idadeEmDias = (idadeAno * 365) + (idadeMes * 30) + idadeDia;
		System.out.print("\n A sua idade em dias é: " + idadeEmDias 
	     + " dias");

		teclado.close();
	}

}
