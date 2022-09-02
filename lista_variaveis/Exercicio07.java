package lista_variaveis;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero total de eleitores: ");
		double numeroEleitores = teclado.nextDouble();
		System.out.print("\n Informe o n�mero total de votos em " +  
		"branco: ");
		double votosBrancos = teclado.nextDouble();
		System.out.print("\n Informe o n�mero total de votos " + 
		"nulos: ");
		double votosNulos = teclado.nextDouble();
		System.out.print("\n Informe o n�mero total de votos " +
		"v�lidos: ");
		double votosValidos = teclado.nextDouble();
		double percentagemVotosBrancos = (votosBrancos / numeroEleitores) * 100;
		double percentagemVotosNulos = (votosNulos / numeroEleitores) * 100;
		double percentagemVotosValidos = (votosValidos / numeroEleitores) * 100;
		System.out.print("\nO percentual de votos em branco � de: "
		+ percentagemVotosBrancos + "% \n" + "O percentual de " +
		"votos nulos � de: " + percentagemVotosNulos + "% \n" + 
		"O percentual de votos v�lidos � de " + 
		percentagemVotosValidos + "%");

		teclado.close();
	}

}
