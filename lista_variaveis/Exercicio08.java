package lista_variaveis;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu salário: ");
		double salario = teclado.nextDouble();
		System.out.print("\n Informe o percentual da data base: ");
		double database = teclado.nextDouble();
		double salarioReajustado = salario + (salario * (database / 100));
		System.out.println("\n O seu salário atual é de R$" + salario);
		System.out.println("\n O  salário ajustado é de R$" + salarioReajustado);

		teclado.close();
	}

}
