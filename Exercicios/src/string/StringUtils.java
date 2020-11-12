package string;

public class StringUtils {
	
	String palavra, atributo, metodo;
	String classe, palavra1, palavra2;
	String frase, subpalavra, binario, texto;
	
	public static String formataAtributo(String atributo) {
		
		//atributos iniciam com letra min�scula e devem estar no formato camelCase; 
		//Ex: "quantidade de questoes" ==> "quantidadeDeQuestoes"
		
		String [] palavras = atributo.split(" ");
		//["quantidade", "de", "quest�es"]
		
		String atributoFormatado = palavras[0];
		for(int i = 1; i < palavras.length; i++) {
			// palavras[i] ==> "de", "quest�es"
			char ini = palavras[i].toUpperCase().charAt(0);
			String aux = String.valueOf(ini);
			//aux ==> "D", "Q"
			aux += palavras[i].substring(1);
			//aux ==> "De", "Quest�es"
			atributoFormatado += aux;
		}
		
		return atributoFormatado;
		
		
	}
	
	public static String formataMetodoGet(String metodo) {
		
		//m�todos get iniciam com get + identificador da vari�vel no formato camelCase; 
				//Ex: "quantidade de questoes" ==> "getQuantidadeDeQuestoes"
		
	
		String aux = StringUtils.formataAtributo(metodo);
			
			//transformando inicial da String para mai�sculo
		char ini = aux.toUpperCase().charAt(0);	
			//"Q" + "uantidadeDeQuestoes"
		String out = ini+aux.substring(1);
			
			//"get" + "QuantidadeDeQuestoes"
		out = "get"+out; 
		return out;
		
		
	}
		
	/*public static String formataClasse(String classe) {
		
	}
		
	//classes iniciam com letras mai�sculas devem estar no formato camelCase; 
	//Ex: "formatador de identificadores" ==> "FormatadorDeIdentificadores"

	public static String ordenaStrings(String palavra1, String palavra2) {
		
	}
	
	//retorna uma �nica String, com as 2 palavras separadas por espa�o mas em ordem lexicogr�fica;
    //Ex: "chevrolet fiat" ==> "chevrolet e fiat"; "volkswagen ford" ==> "ford volkswagen"; "honda honda" ==> "honda honda"

	public static String ehPalindromo(String palavra) {
		//retorna verdadeiro se a palavre � um pal�ndromo; Ex: "arara" ==> true.
	}

	public static String transformaParaCaixaAlta(String palavra) {
		palavra = palavra.toUpperCase();
		System.out.println(palavra);
		// retornar palavra com letras mai�sculas; Ex: "PhUlaNo dEtHal" ==> "PHULANO DETHAL"
	}

	public static int contaVogais(String frase) {
		
	}
// informa a quantidade de vogais na frase; Ex: "In God We Trust" ==> 4

	public static String removeEspacosSuperfluos(String frase) {
		// retornar uma vers�o da frase digitada sem espa�os sup�rfluos; 
		//Ex: " Hay que endurecerse, pero sin perder la ternura jam�s " ==> "Hay que endurecerse, pero sin perder la ternura jam�s"
	}

	public static int[] ocorrencias(String frase, String subPalavra) {
		//retorna todas as ocorr�ncia (�ndices) da subpalavra dentro da frase; 
		//Ex: "O doce perguntou para o doce, qual o doce mais doce?" ==> [2, 24, 37, 47]
	}

	public static int binarioPraDecimal(String binario) {
		
	}
	// transforma a String binario para sua representa��o em decimal;
	//Ex: "101110010" ==> 370; "1100110011" ==> 819

	public static int getQtdadePalavras(String frase) {
		// retorna a quantidade de palavras separadas por espa�o na frase; 
		//Ex: "programar � muito f�cil" ==> 4
	}

	public static int[] histogramaLetras(String texto) {
		//retorna um array com um histograma de letras (sem diferenciar mai�sculas de min�sculas) de um texto. 
		//Ex: "the quick brown fox jumps over the lazy dog" ==> [1, 1, 1, 1, 3, 1, 1, 2, 1, 1, 1, 1, 1, 1, 4, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1] (perceba que o �ndice 0 representa A, 1 representa B, e da� por diante)
	}

	/*Explique qual a diferen�a entre criar uma String das seguintes formas:
	String nome = "Eduardo";  ----> aqui foi injetado o c�digo do construtor pela JVM. � omitida a chamada ao construtor (new).
	String nome = new String("Eduardo");
	Explique como funciona o String pool.

	O que acontece toda vez que uma String � modificada? Considere o exemplo a seguir para embasar sua resposta.

	String nome = "Eduardo";
	nome += "de Lucena";
	nome += "Falcao";
	Como a classe StringBuilder pode ajudar a tornar o c�digo anterior mais eficiente?
	//R.Existe uma economia no espa�o de mem�ria pois nenhum objeto adicional precisa ser criado.
	
	StringBuilder nomeCompleto = new StringBuilder("Eduardo");
	nomeCompleto.append(" de");
	nomeCompleto.append(" Lucena");
	nomeCompleto.append(" Falcao");

	System.out.println(nomeCompleto);*/
	
	public static void main(String[] args) {
		System.out.println(StringUtils.formataMetodoGet("quantidade de questoes"));
		System.out.println(StringUtils.formataAtributo("quantidade de questoes"));
		
		//StringVsStringBuilder
		
		String nome = "Maria";
		System.out.println(System.identityHashCode(nome));
		nome += " Cecilia";
		System.out.println(System.identityHashCode(nome));
		nome += " Santos";
		System.out.println(System.identityHashCode(nome));
		nome += " Silva";
		System.out.println(System.identityHashCode(nome));
		
		System.out.println("##################");
		
		StringBuilder nomeCompleto = new StringBuilder("Maria");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" Cecilia");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" Santos");
		System.out.println(System.identityHashCode(nomeCompleto));
		nomeCompleto.append(" Silva");
		System.out.println(System.identityHashCode(nomeCompleto));
		
	}


}
