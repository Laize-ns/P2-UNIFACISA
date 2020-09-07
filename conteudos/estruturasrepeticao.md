# Estruturas de repetição

O Java fornece três instruções de repetição (também chamadas de iteração ou instruções de loop) que permitem que programas executem instruções repetidamente, conquanto que uma condição (chamada de condição de continuação do loop) permaneça verdadeira.
As instruções de repetição são while, do...while, for e instruções for aprimoradas.
As instruções while e for realizam a ação (ou grupo de ações) no seu corpo zero ou mais vezes, se a condição de continuação de loop for inicialmente falsa, a ação (ou grupo de ações) não será executada.
A instrução do...while realiza a ação (ou grupo de ações) no seu corpo uma ou mais vezes.

## Repetição controlada por contador

Utiliza uma variável chamada contador (ou variável de controle) para controlar o npumero de vezes que um conjunto de instruções é executado. Costuma ser chamada de repetição definida, porque o número de repetições é conhecida antes de o loop começar a executar.

## While

Permite especificar que um programa deve repetir uma ação enquanto alguma condição permanecer verdadeira

-Exemplo:

```java
public basics

import java.util.Scanner;

public class ParesPositivos {

  public static void main (String [] args) {
  
    Scanner entrada = new Scanner(System.in);
  
    int = i = 1;
  
    while (i <= 25) {
  
      System.out.println("Digite um número: ");
      int num = entrada.nextInt(0;
      if (num % 2 == 2 && num > 0 )
        contParesPositivos++;
      i++;
    }
  }
}
```
  
## For 

Especifica os detalhes da repetição controlada por contador em uma  única linha de código. Haverá um cabeçalho de instrução for que contém: variável de controle com um valor inicial de controle, ponto e vírgula como separador, em seguida a condição de continuação do loop, ponto e vírgula e o incremento da variável de controle. 

- Exemplo:

```java
For (int contador = 1; contador <= 10; contador ++)

```
- Exemplo 2:

```java
public basics

import java.util.Scanner;

public class ParesPositivos {

  public static void main (String [] args) {
  
    Scanner entrada = new Scanner(System.in);
  
    int contParesPositivos = 0;  //contador iniciando em zero
  
    for (int i = 1; i < 25; i++) {
  
      System.out.println("Digite um número: ");
      int num = entrada.nextInt(0;
      if (num % 2 == 2 && num > 0 )
        contParesPositivos++;
 
    }
    
    System.out.println("Quantidade de números pares positivos: " +contParesPositivos);
  }
}

```
## Do...While

A instrução do...while testa a condição de continuação do loop depois de executar o corpo do loop; portanto o corpo sempre executa pelo menos uma vez. Quando uma instrução do...while termina, a execução continua com a próxima instrução na sequência.

- Exemplo:

```java

public calss DoWhileTest {

  public static void main (String[] args) {
      
        int contador = 1;
        
        do {
          System.out.println ( contador);
          ++ contador;
        } while (contador <= 10);
        
        System.out.println();
        
   }
 }
 
 ```

## Break

quando executado ocasiona saída imediata da instrução de repetição. É vista como preguiça de raciocínio no while e for


