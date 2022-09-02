package desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = apresentarMenu(teclado);
		while (opcao != 9) {
			switch (opcao) {
				case 1: {
					variaveis();
					break;
				}
				case 2: {
					condicionais();
					break;
				}
				case 3: {
					repeticao();
					break;
				}
				case 4: {
					array();
					break;
				}
				case 5: {
					matrizes();
					break;
				}
				case 6: {
					procedimentos();
					break;
				}
				case 7: {
					funcoes();
					break;
				}
				default: {
					System.out.println("Operação inválida! Informe uma das opções disponíveis!");
					break;
				}
			}
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println();
			opcao = apresentarMenu(teclado);
		}
	}

	static int apresentarMenu(Scanner teclado) {
		System.out.print("Sistema de Ajuda a Sintaxe Java" + "\n1 - Declara��o de Vari�veis" + "\n2 - Condicionais"
				+ "\n3 - Repeti��o" + "\n4 - Array" + "\n5 - Matrizes" + "\n6 - Procedimentos" + "\n7 - Fun��es"
				+ "\n9 - Sair" + "\nOp��o: ");
		int escolha = teclado.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		return escolha;
	}

	static void variaveis() {
		System.out.println("VARI�VEIS");
		System.out.println();
		System.out.println(
				"Uma vari�vel � um espa�o na mem�ria RAM do computador destinado a uma informa��o que � armazenada e alterada durante a execu��o do algoritmo. "
						+ "\nPara funcionar corretamente, as vari�veis precisam ser definidas por nomes e tipos.");
		System.out.println(
				"Qualquer informa��o pode ser eleg�vel � vari�vel, quando fizer sentido ao problema que o algoritmo se prop�e a resolver. "
						+ "\nDurante a execu��o de um algoritmo computacional, cada vari�vel corresponde a uma posi��o de mem�ria do computador, cujo seu conte�do pode variar ao longo do tempo. "
						+ "\nUm exemplo de analogia da mem�ria pode ser com um arm�rio de gavetas, no qual as gavetas seriam os locais f�sicos respons�veis por armazenar objetos. "
						+ "\nOs objetos seriam os dados e as gavetas seriam as vari�veis.");
		System.out.println("� necess�rio utilizar identificadores, para diferenciar as vari�veis na mem�ria. "
				+ "\nCada vari�vel pode guardar apenas um dado de cada vez, sendo sempre o mesmo tipo de dado. "
				+ "\nPortanto � necess�rio definir nomes para determinadas vari�veis especificando os dados que podem ser armazenados. "
				+ "\nAs vari�veis s� podem armazenar valores de um mesmo tipo, sendo num�ricas, l�gicas e literais.");
		System.out.println(
				"A linguagem Java � fortemente tipificada, ou seja, � necess�rio sempre declarar o tipo de vari�vel. "
						+ "\nEx: int idade = 10; | int = tipo da vari�vel; idade = nome da vari�vel; '=' = identificador de atribui��o; 10 = valor que est� sendo atribu�do a vari�vel. ");
		System.out.println();
		System.out.println("- Tipos Num�ricos");
		System.out.println();
		System.out.println(
				"Os n�meros do tipo inteiro s�o formados por todos os n�meros positivos, negativos e zero, desde que n�o possuam casa decimal."
						+ "\nInteiros no Java: byte (8 bits); short (16 bits); int (32 bits); long (64 bits). Por padr�o � utilizado 'int'");
		System.out.println(
				"Os n�meros do tipo ponto flutuante s�o formados por positivos, negativos e zero, desde que possuam casa decimal."
						+ "\nPonto flutuante no Java: float (32 bits); double (64 bits). Por padr�o � utilizado 'double'");
		System.out.println();
		System.out.println("- Operadores Matem�ticos");
		System.out.println();
		System.out.println(
				"+ -> adi��o | - -> subtra��o | * -> multiplica��o | / -> divis�o | % -> resto da divis�o | ++ -> incremento | -- -> decremento");
		System.out.println();
		System.out.println("- Tipo L�gico (boolean)");
		System.out.println();
		System.out.println("Uma vari�vel booleana pode assumir apenas um valor entre true ou false.");
		System.out.println();
		System.out.println("- Operadores Relacionais");
		System.out.println();
		System.out.println(
				"== -> igual | != -> diferente | > -> maior que | >= -> maior ou igual a | < -> menor que | <= -> menor ou igual a ");
		System.out.println();
		System.out.println("- Operadores Relacionais");
		System.out.println();
		System.out.println("&& -> and | || -> or");
		System.out.println("Condi��o 1 | Condi��o 2 | Resultado AND | Resultado OR"
				+ "\nFalso      | Falso      | False         | False"
				+ "\nFalse      | Verdadeiro | False         | True"
				+ "\nVerdadeiro | Falso      | False         | True"
				+ "\nVerdadeiro | Verdadeiro | True          | True");
		System.out.println();
		System.out.println("- Tipo Literal");
		System.out.println();
		System.out.println(
				"O Java possui dois tipos literais: char e String. Uma vari�vel tipo char armazena um �nico caractere, necessitando estar entre aspas simples. Ex: char letra = 'A'"
						+ "\nA vari�vel String armazena uma sequ�ncia de caracteres. Ex: String nome = ''Luis''");
		System.out.println();
		System.out.println("- Regras para Nome de Vari�veis");
		System.out.println();
		System.out.println(
				"O nome de vari�vel no Java pode ser formado por uma sequ�ncia de um ou mais caracteres alfanum�ricos iniciados por: Letra; _ (underscore); $ (cifr�o);"
						+ "\nOs nomes n�o podem conter: S�mbolos gr�ficos; Operadores; Espa�os em branco; Palavras reservadas da linguagem."
						+ "\nO Java � sens�vel aos caracteres mai�sculos e min�sculos, por isso � sempre bom iniciar a vari�vel com letra min�scula e aplicar Camel Case. Ex: exemploCamelCase");
	}

	static void condicionais() {
		System.out.println("CONDICIONAIS");
		System.out.println();
		System.out.println(
				"Uma estrutura condicional vai permitir que o algoritmo tenha mais de uma op��o de fluxo de execu��o, ou seja, "
						+ "\npermite que determinadas instru��es sejam executadas ou n�o, dependendo do resultado de uma condi��o (booleano).");
		System.out.println("No Java temos duas estruturas condicionais: " + "\n- If e Else" + "\n- Switch Case");
		System.out.println();
		System.out.println(
				"A estrutura if e else pode ser composta apenas pelo if (estrutura simples), se a informa��o for verdadeira ela vai entrar no if, "
						+ "\ncaso contr�rio o bloco if � pulado para o pr�ximo.");
		System.out.println(
				"J� na estrutura composta, caso a informa��o for verdadeira, ir� entrar no if, caso contr�rio entrar� no else."
						+ "\nAmbas estruturas (simples ou composta), podem ser aninhadas, ou seja, inserir outro if dentro de um if.");
		System.out.println();
		System.out.println(
				"Se um c�digo utiliza muitas estruturas aninhadas, o Switch Case facilita para a leitura e manuten��o. "
						+ "\nSempre que a estrutura encontrar uma op��o v�lida, ele executa apenas aquela op��o. A palavra case indica as op��es, e a palavra break a finaliza��o do processo."
						+ "\nCaso n�o seja encontrado nenhuma op��o, � executado a op��o default.");
	}

	static void repeticao() {
		System.out.println("REPETI��O");
		System.out.println();
		System.out.println("Estruturas de repeti��o, tamb�m conhecidas como la�os de repeti��o ou loopings, "
				+ "\npossibilitam a a��o de repetir um determinado trecho do programa v�rias vezes."
				+ "\nAs op��es de repeti��o podem ser finitas ou indeterminadas.");
		System.out.println("Estrutura while: verifica a condi��o antes de entrar na estrutura."
				+ "\nA estrutura ir� efetuar o looping at� chegar em uma op��o falsa para encerrar o fluxo de repeti��o."
				+ "\nSe a estrutura iniciar falsa ela n�o ser� efetuada.");
		System.out.println(
				"Estrutura do while: a estrutura vai ser apresentada no m�nimo uma vez, e ser� de tamanho inderterminado, "
						+ "\nat� que chegue na condi��o falsa para encerrar a repeti��o.");
		System.out.println(
				"Estrutura for: essa estrutura � finita, sendo controlado por uma vari�vel de contador, podendo ser crescente ou decrescente.");
	}

	static void array() {
		System.out.println("ARRAY");
		System.out.println();
		System.out.println("Array � uma estrutura de dados que permite organizarmos valores na mem�ria. "
				+ "\nO array seria como uma gaveta com divis�rias, podendo armazenar um conjunto de valores."
				+ "\nO comprimento do Array � estabelecido quando o Array � criado.");
		System.out.println(
				"Para criar um Array � utilizado colchetes na declara��o. O nome das vari�veis normalmente � no plural."
						+ "\nExistem duas etapas na cria��o de um Array:");
		System.out.println("- Declara��o: 'int[] valores' representando um array do tipo int"
				+ "\n- Inicializa��o: 'new int [5]' representando a inicializa��o do array.");
		System.out.println("Valor de inicializa��o padr�o: "
				+ "\n- 0 para n�meros primitivos;"
				+ "\n- false para elementos booleanos;"
				+ "\n- null para refer�ncias.");
		System.out.println(
				"Podemos atribuir valores a um Array no momento de declara��o, informando os valores dentro de chaves."
						+ "Ex: int[] valores = {13, 53, 9, 16, 25};");
		System.out.println("Podemos atribuir valores a um Array acessando seus �ndices diretamente."
				+ "Ex: valores[2] = 9;");
		System.out.println(
				"A forma mais comum de se atribuir e ler um array � utilizando o for, pois utilizamos o seu contador como �ndice do elemento.");
	}

	static void matrizes() {
		System.out.println("MATRIZES");
		System.out.println();
		System.out.println(
				"Matriz � um array que � declarado contendo duas dimens�es e normalmente � utilizado para representar uma tabela."
						+ "\nAs matrizes precisam de dois �ndices para identificar um elemento. Ex: numero[indiceA][indiceB], onde indiceA � a linha e indiceB � a coluna.");
	}

	static void procedimentos() {
		System.out.println("PROCEDIMENTOS");
		System.out.println();
		System.out.println(
				"Procedimentos s�o m�dulos utilizados de forma combinadas para que o programa alcance o seu prop�sito."
						+ "\nOs principais motivos para utilizar procedimentos s�o:"
						+ "\n- Modularidade: dividir o programa em tr�s partes, entrada, processamento e sa�da."
						+ "\n- Reaproveitamento de c�digo: chamar c�digos pr�viamente criados para economizar tempo e facilitar manuten��o."
						+ "\n- Legibilidade: utilizando bom uso de nomes para identificadores, identa��o e uso adequado de coment�rios,"
						+ "\nfacilitam a compreens�o para quem l� o c�digo.");
		System.out.println(
				"A diferen�a de um procedimento para uma fun��o � que o procedimento n�o retorna nada para quem o chamou."
						+ "\nA sintaxe de um procedimento � dada pela palavra void."
						+ "\nPara chamar uma classe � necess�rio utilizar a palavra static antes de void.");
		System.out.println(
				"Todo procedimento deve ser desenvolvido com o prop�sito de resolver apenas um problema, para n�o fugir do objetivo.");
	}

	static void funcoes() {
		System.out.println("FUN��ES");
		System.out.println();
		System.out.println(
				"Fun��es s�o m�dulos utilizados de forma combinadas para que o programa alcance o seu prop�sito."
						+ "\nOs principais motivos para utilizar fun��es s�o:"
						+ "\n- Modularidade: dividir o programa em tr�s partes, entrada, processamento e sa�da."
						+ "\n- Reaproveitamento de c�digo: chamar c�digos pr�viamente criados para economizar tempo e facilitar manuten��o."
						+ "\n- Legibilidade: utilizando bom uso de nomes para identificadores, identa��o e uso adequado de coment�rios,"
						+ "\nfacilitam a compreens�o para quem l� o c�digo.");
		System.out.println(
				"A diferen�a de um procedimento para uma fun��o � que a fun��o retorna algo para quem a chamou."
						+ "\nA sintaxe de uma fun��o � dada pelo tipo de retorno (int, boolean, etc) seguido pelo nome da fun��o e deve ter um 'return' para retornar."
						+ "\nPara chamar uma classe � necess�rio utilizar a palavra static antes do tipo de retorno.");
		System.out.println(
				"Toda fun��o deve ser desenvolvida com o prop�sito de resolver apenas um problema, para n�o fugir do objetivo.");
	}

}
