package lista_condicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do funcionário: ");
		String funcionario = teclado.nextLine();
		System.out.println("Informe o ano de nascimento: ");
		int anoNasc = teclado.nextInt();
		System.out.println("Informe o ano que ingressou na empresa: ");
		int anoIngresso = teclado.nextInt();
		if ((2022 - anoNasc) >= 65) {
			System.out.print("O " + funcionario + " tem " + (2022 - anoNasc) + " anos e pode requerer aposentadoria.");
		} else {
			if ((2022 - anoIngresso) >= 30) {
				System.out.print("O " + funcionario + " está trabalhando há " + (2022 - anoIngresso)
							+ " anos e pode requerer aposentadoria.");
			} else {
				if ((2022 - anoNasc) >= 60 && (2022 - anoIngresso) >= 25) {
					System.out.print("O " + funcionario + " tem " + (2022 - anoNasc) 
							+ " anos e está trabalhando há " + (2022 - anoIngresso) + " e pode requerer aposentadoria.");
				} else {
					System.out.print("O " + funcionario + " não pode requerer aposentadoria pois tem " 
								+ (2022 - anoNasc) + " anos e está trabalhando na empresa há " + (2022 - anoIngresso) 
								+ " anos.");
				}
			}

		}

		teclado.close();
	}

}
