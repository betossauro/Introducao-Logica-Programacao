package lista_variaveis;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número total de eleitores: ");
		double numeroEleitores = teclado.nextDouble();
		System.out.print("\n Informe o número total de votos em " +  
		"branco: ");
		double votosBrancos = teclado.nextDouble();
		System.out.print("\n Informe o número total de votos " + 
		"nulos: ");
		double votosNulos = teclado.nextDouble();
		System.out.print("\n Informe o número total de votos " +
		"válidos: ");
		double votosValidos = teclado.nextDouble();
		double percentagemVotosBrancos = (votosBrancos / numeroEleitores) * 100;
		double percentagemVotosNulos = (votosNulos / numeroEleitores) * 100;
		double percentagemVotosValidos = (votosValidos / numeroEleitores) * 100;
		System.out.print("\nO percentual de votos em branco é de: "
		+ percentagemVotosBrancos + "% \n" + "O percentual de " +
		"votos nulos é de: " + percentagemVotosNulos + "% \n" + 
		"O percentual de votos válidos é de " + 
		percentagemVotosValidos + "%");

		teclado.close();
	}

}
