package exemplos;

import java.util.Scanner;

public class Procedimentos_Funcoes_FolhaPagamento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcao = 0;
		do {
			System.out.print("Informe o Sal�rio Bruto: R$");
			double salarioBruto = teclado.nextDouble();
			double descontoINSS = calcularDescontoINSS(salarioBruto);
			double descontoIRRF = calcularDescontoIRRF(salarioBruto - descontoINSS);
			System.out.println("Sal�rio Bruto: R$" + salarioBruto 
					+ "\nSal�rio L�quido: R$" + (salarioBruto - (descontoINSS + descontoIRRF)));
			System.out.print("Deseja calcular mais um sal�rio l�quido?\n1 - SIM | 2 - N�O   : ");
			opcao = teclado.nextInt();
		} while (opcao != 2);
		teclado.close();
	}
	
	static double calcularDescontoINSS(double salarioBruto) {
		double desconto = 0;
		if(salarioBruto < 1500) {
			desconto = salarioBruto * 0.05;
		} else {
			if(salarioBruto > 3000) {
				desconto = salarioBruto * 0.15;
			} else {
				desconto = salarioBruto * 0.10;
			}
		}
		return desconto;
	}
		
	static double calcularDescontoIRRF(double salarioBruto) {
		double desconto = 0;
		if(salarioBruto < 2000) {
			desconto = 0;
		} else
			if(salarioBruto > 5000) {
				desconto = salarioBruto * 0.25;
			} else {
				desconto = salarioBruto * 0.15;
			}
		return desconto;
	}
}

