package lista_condicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do funcion�rio: ");
		String funcionario = teclado.nextLine();
		System.out.println("Informe o ano de nascimento: ");
		int anoNasc = teclado.nextInt();
		System.out.println("Informe o ano que ingressou na empresa: ");
		int anoIngresso = teclado.nextInt();
		if ((2022 - anoNasc) >= 65) {
			System.out.print("O " + funcionario + " tem " + (2022 - anoNasc) + " anos e pode requerer aposentadoria.");
		} else {
			if ((2022 - anoIngresso) >= 30) {
				System.out.print("O " + funcionario + " est� trabalhando h� " + (2022 - anoIngresso)
							+ " anos e pode requerer aposentadoria.");
			} else {
				if ((2022 - anoNasc) >= 60 && (2022 - anoIngresso) >= 25) {
					System.out.print("O " + funcionario + " tem " + (2022 - anoNasc) 
							+ " anos e est� trabalhando h� " + (2022 - anoIngresso) + " e pode requerer aposentadoria.");
				} else {
					System.out.print("O " + funcionario + " n�o pode requerer aposentadoria pois tem " 
								+ (2022 - anoNasc) + " anos e est� trabalhando na empresa h� " + (2022 - anoIngresso) 
								+ " anos.");
				}
			}

		}

		teclado.close();
	}

}
