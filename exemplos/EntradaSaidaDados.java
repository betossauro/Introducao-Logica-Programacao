package exemplos;

import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma mensagem: ");
		String mensagens = teclado.nextLine();
		System.out.println("\n" + mensagens);

		teclado.close();
	}

}
