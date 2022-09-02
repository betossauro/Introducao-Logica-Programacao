package simulado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuisAlbertoQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Informe o custo de fabrica��o do rem�dio: R$");
		double custoFabricacao = teclado.nextDouble();
		double custoTotalImpostos = custoFabricacao + (custoFabricacao * 0.1) + (custoFabricacao * 0.2) + (custoFabricacao * 0.2); 
																	// 0.1 = IPI ; 0.2 = ICMS ; 0.2 = PIS/COFINS
		System.out.println("Para obter o lucro de 50% com a venda do Milagreiro, o rem�dio deve ser comercializado por: R$" 
						+ formatador.format(custoTotalImpostos * 1.5));
		teclado.close();
	}
}
