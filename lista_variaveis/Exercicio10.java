package lista_variaveis;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o sal�rio fixo: ");
		double salarioFixo = teclado.nextDouble();
		System.out.print("\n Informe a comiss�o fixa: ");
		double comissaoFixa = teclado.nextDouble();
		System.out.print("\n N�mero de carros vendidos: ");
		int carrosVendidos = teclado.nextInt();
		System.out.print("\n Informe o valor total em vendas: ");
		double totalVendas = teclado.nextDouble();
		double salarioVendedor = salarioFixo + (comissaoFixa * carrosVendidos) 
		+ (totalVendas * 0.05);
		System.out.print("\n O sal�rio final � de R$" + 
	    salarioVendedor);

		teclado.close();
	}

}
