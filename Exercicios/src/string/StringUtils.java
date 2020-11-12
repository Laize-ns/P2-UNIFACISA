package string;

public class StringUtils {
	
	String palavra, atributo, metodo;
	String classe, palavra1, palavra2;
	String frase, subpalavra, binario, texto;
	
	public static String formataAtributo(String atributo) {
		
		//atributos iniciam com letra minúscula e devem estar no formato camelCase; 
		//Ex: "quantidade de questoes" ==> "quantidadeDeQuestoes"
		
		String [] palavras = atributo.split(" ");
		//["quantidade", "de", "questões"]
		
		String atributoFormatado = palavras[0];
		for(int i = 1; i < palavras.length; i++) {
			// palavras[i] ==> "de", "questões"
			char ini = palavras[i].toUpperCase().charAt(0);
			String aux = String.valueOf(ini);
			//aux ==> "D", "Q"
			aux += palavras[i].substring(1);
			//aux ==> "De", "Questões"
			atributoFormatado += aux;
		}
		
		return atributoFormatado;
		
		
	}
	
	public static String formataMetodoGet(String metodo) {
		
		//métodos get iniciam com get + identificador da variável no formato camelCase; 
				//Ex: "quantidade de questoes" ==> "getQuantidadeDeQuestoes"
		
	
		String aux = StringUtils.formataAtributo(metodo);
			
			//transformando inicial da String para maiúsculo
		char ini = aux.toUpperCase().charAt(0);	
			//"Q" + "uantidadeDeQuestoes"
		String out = ini+aux.substring(1);
			
			//"get" + "QuantidadeDeQuestoes"
		out = "get"+out; 
		return out;
		
		
	}
		
	/*public static String formataClasse(String classe) {
		
	}
		
	//classes iniciam com letras maiúsculas devem estar no formato camelCase; 
	//Ex: "formatador de identificadores" ==> "FormatadorDeIdentificadores"

	public static String ordenaStrings(String palavra1, String palavra2) {
		
	}
	
	//retorna uma única String, com as 2 palavras separadas por espaço mas em ordem lexicográfica;
    //Ex: "chevrolet fiat" ==> "chevrolet e fiat"; "volkswagen ford" ==> "ford volkswagen"; "honda honda" ==> "honda honda"

	public static String ehPalindromo(String palavra) {
		//retorna verdadeiro se a palavre é um palíndromo; Ex: "arara" ==> true.
	}

	public static String transformaParaCaixaAlta(String palavra) {
		palavra = palavra.toUpperCase();
		System.out.println(palavra);
		// retornar palavra com letras maiúsculas; Ex: "PhUlaNo dEtHal" ==> "PHULANO DETHAL"
	}

	public static int contaVogais(String frase) {
		
	}
// informa a quantidade de vogais na frase; Ex: "In God We Trust" ==> 4

	public static String removeEspacosSuperfluos(String frase) {
		// retornar uma versão da frase digitada sem espaços supérfluos; 
		//Ex: " Hay que endurecerse, pero sin perder la ternura jamás " ==> "Hay que endurecerse, pero sin perder la ternura jamás"
	}

	public static int[] ocorrencias(String frase, String subPalavra) {
		//retorna todas as ocorrência (índices) da subpalavra dentro da frase; 
		//Ex: "O doce perguntou para o doce, qual o doce mais doce?" ==> [2, 24, 37, 47]
	}

	public static int binarioPraDecimal(String binario) {
		
	}
	// transforma a String binario para sua representação em decimal;
	//Ex: "101110010" ==> 370; "1100110011" ==> 819

	public static int getQtdadePalavras(String frase) {
		// retorna a quantidade de palavras separadas por espaço na frase; 
		//Ex: "programar é muito fácil" ==> 4
	}

	public static int[] histogramaLetras(String texto) {
		//retorna um array com um histograma de letras (sem diferenciar maiúsculas de minúsculas) de um texto. 
		//Ex: "the quick brown fox jumps over the lazy dog" ==> [1, 1, 1, 1, 3, 1, 1, 2, 1, 1, 1, 1, 1, 1, 4, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1] (perceba que o índice 0 representa A, 1 representa B, e daí por diante)
	}

	/*Explique qual a diferença entre criar uma String das seguintes formas:
	String nome = "Eduardo";  ----> aqui foi injetado o código do construtor pela JVM. É omitida a chamada ao construtor (new).
	String nome = new String("Eduardo");
	Explique como funciona o String pool.

	O que acontece toda vez que uma String é modificada? Considere o exemplo a seguir para embasar sua resposta.

	String nome = "Eduardo";
	nome += "de Lucena";
	nome += "Falcao";
	Como a classe StringBuilder pode ajudar a tornar o código anterior mais eficiente?
	//R.Existe uma economia no espaço de memória pois nenhum objeto adicional precisa ser criado.
	
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
