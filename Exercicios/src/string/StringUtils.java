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
	
	StringBuilder nomeCompleto = new StringBuilder("Maria");
	nomeCompleto.append(" Cecília");
	nomeCompleto.append(" Santos");
	nomeCompleto.append(" Silva");

	System.out.println(nomeCompleto);*/
	
	public static void main(String[] args) {
		System.out.println(StringUtils.formataMetodoGet("quantidade de questoes"));
		System.out.println(StringUtils.formataAtributo("quantidade de questoes"));
		
		//StringVsStringBuilder
		
		String nome = "Maria";
		System.out.println(System.identityHashCode(nome));
<<<<<<< HEAD
		nome += " Cecilia";
=======
		nome += " Cecília";
>>>>>>> f9ce9b2ce21031493fbbd77749b25c0e219e6a96
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
