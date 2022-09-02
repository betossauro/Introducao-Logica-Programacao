package lista_procedimentos_funcoes;

public class Exercicio07 {

	public static void main(String[] args) {
		System.out.println("Números primos");
		for(int i = 2; i <= 100; i++) {
			if (verificarNumeroPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean verificarNumeroPrimo(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}