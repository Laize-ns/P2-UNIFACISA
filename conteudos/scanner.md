# Como inserir ou ler algo digitado pelo usuário no teclado (Scanner):

- “import java.util.Scanner” é uma declaração import que ajuda o compilador a localizar uma classe utilizada nesse programa. Isso indica que o programa usa a classe Scanner predefinida do pacote chamado java.util.
Todas as declarações import devem aparecer antes da primeira declaração da classe no arquivo.

- “Scanner entrada = new Scanner(System.in)” é uma instrução de declaração de variável que especifica o nome (entrada) e o tipo (Scanner) de uma variável utilizada nesse programa. Um Scanner permite a um programa ler os dados para utilização nele e pode ser proveniente de várias origens, como os digitados pelo usuário ou um arquivo de disco. Antes de utilizar deve ser especificada da origem. 

- A expressão “new” cria um objeto Scanner que lê caracteres digitados pelo usuário no teclado. 

- O objeto de entrada padrão “System.in” permite que aplicativos leiam bytes de informações digitadas pelo usuário, o “Scanner” traduz esses bytes em tipos que podem ser utilizados pelo programa.

- “number1 = entrada.nextInt();” utiliza o método nextInt do valor de input do objeto Scanner para obter um inteiro digitado pelo usuário, o número será submetido ao pressionar a tecla enter.

```java

import java.util.Scanner; //vai utilizar a classe Scanner

public class Adicao {

	public static void main (String[] args){ 
 //método main inicia a execução do aplicativo Java

		Scanner entrada = new Scanner(System.in);
		//criou um scanner para obter a entrada a partir da janela de comando
		int number1; //primeiro numero a somar
		int number2; //segundo numero a somar
		int sum; //soma de number1 e number2

		System.out.println(“Digite o primeiro numero: “);
		number1 = entrada.nextInt(); //lê o primeiro numero fornecido pelo usuário

		System.out.println(“Digite o segundo numero: “);
		number2 = entrada.nextInt(); //lê o segundo numero fornecido pelo usuário

		sum = number1 + number2;
		System.out.println(“A soma é: “ + sum);
	}
}
```




