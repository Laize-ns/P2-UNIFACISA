#Instruçóes de seleção em Java

## if
é uma instrução de seleção única porque seleciona ou ignora uma única ação. Realiza uma ação se uma condição for verdadeira

```java
package basics;

public class ComparacaoNum;

public static void main (String [] args) {
  int a = 10;
  int b = 20 
  if (a < 5 &  ++b<10) {
    System.out.println("Entrei no if");
  }
  System.out.println("A: "+a);
  System.out.println("B: "+b);
```

## if...else
é uma instrução de seleção dupla pois realiza uma ação se uma condição for verdadeira e uma ação diferente se a condição for falsa.
Dá maior liberdade para criar comparações mais complexas.

```java
package basics;

public class DataTexto;

public static String converteMesNumPraTexto(byte mes) {
  if (mes == 1) {
    return "Janeiro";
  } else if (mes == 2) {
    return "Fevereiro";
  } else if (mes == 3) {
    return "Março";
  } else if (mes == 4) {
    return "Abril";
  } else if (mes == 5) {
    return "Maio";
  } else if (mes == 6) {
    return "Junho";
  } else if (mes == 7) {
    return "Julho";
  } else if (mes == 8) {
    return "Agosto";
  } else if (mes == 9) {
    return "Setembro";
  } else if (mes == 10) {
    return "Outubro";
  } else if (mes == 11) {
    return "Novembro";
  } else if (mes == 12) {
    return "Dezembro";
}
``` 

## switch-case
é uma instrução de seleção múltipla pois realiza uma de muitas ações diferentes, dependendo do valor de uma expressão.
a variável de comapração é restrita à uma variável.
Existe restrições dos tipos possíveis (double e float não podem ser usados).
A comparação é simples e direta.
O código é limpo e objetivo.
É possível expandir o bloco:

```java
package basics;

public class DataTexto;

public static void main (String [] args) {
  short dia = 5, mes 12, ano = 2020;
  String mesTexto = converteMesNumPraTexto (mes);
  System.out.println(dia+"de "+mesTexto+"de "+ano);
  

public static String converteMesNumPraTexto(short mes) {
  switch(mes) {
    case 1: {
      System.out.println("Janeiro");
      return("Janeiro");
    case: 2: 
      System.out.println("Fevereiro");
    case 3:
      System.out.println("Março");
    case 4:
      System.out.println("Abril");
    case 5: 
      System.out.println("Maio");
    case 6:
      System.out.println("Junho");
    case 7:
      System.out.println("Julho");
    case 8: 
      System.out.println("Agosto");
    case 9:
      System.out.println("Setembro");
    case 10:
      System.out.println("Outubro");
    case 11:
      System.out.println("Novembro");
    case 12:
      System.out.println("Dezembro");
    default: return "mês inexistente";
    }
  }
}
``` 
