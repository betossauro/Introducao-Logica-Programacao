package exemplos;

import java.text.DecimalFormat;

public class FormatandoNumeros {

	public static void main(String[] args) {

		//Classe do Java que auxilia na formata��o de n�meros.
		//A String entre parenteses indica a quantidade de casas decimais.
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double numeroA = 13;
		double numeroB = 7;
		System.out.println("Resultado sem formata��o: " + (numeroA/numeroB));
		System.out.println("Resultado com formata��o: " 
					+ formatador.format(numeroA/numeroB));

	}

}
