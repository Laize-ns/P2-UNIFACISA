# Operadores

## Aritméticos

- Binários + - * / %

- Unários  ++  --

## Lógicos

- Binários  && ||    (and , or)
- Unário !   (not)

boolean v1  = true;
boolean v2 = false;

boolean v3 = v1 && v2; //resultado é falso
boolean v3 = v1 || v2; // resultado é verdadeiro

- Unários : !

## Atribuição

=  +=   -= *=  /=  %=

## Igualdade ou comparação

=  !=

## Relacionais
 
 - Binários
       - numéricos > >= < <=
       - relações entre objetos: instance of
       
## Ternários

  -Exemplo:
     
      boolean acesa = true;
      String infoLampada = "";
      if (acesa == true) {
        infoLampada = "Lampada está acesa!";
       } else {
        infoLampada está apagada!";
       }
       
       
       ou
       
       
       String infoLampada = 9acesa == true ? "Lampada está acesa!" : "Lampada está apagada!");
       
           
## Pós fixados
 
 -int b = a++
 -int b = a--
 
## Pré fixado
 
 -int b = ++a
 -int b = --a
 
# Operadores Avançados

## Relacional
- instance of

## Deslocamento (shift):
- << >> >>>=

## Atribuição de deslocamento
- <<= >>= >>>=

## Bitwise
& | ^ (and, or, xor)

## Unário

~

- Exemplo de short-circuit: 

  - Tenta terminar a execução dessa comparação como mínimo de informação possível.
  
```java

public static void main (String[] args) {

 int a = 10;
 int b = 20;
 if (a<5 && ++b<10) { // a<5 é falso, não avalia o resto da expressão, ++b<10
  System.out.println("entrei no if");
 }
 System.out.println("A: "+a);
 System.out.println("B: "+b); // resultado será A: 10 e B: 20 
 
 ```

 
 - Exemplo de long-circuit:
   - Avalia a expressão completa, independente de ser necessário ou não.
   
```java
   
public static void main (String[] args) {

 int a = 10;
 int b = 20;
 if (a<5 & ++b<10) { // avalia o circuito inteiro
  System.out.println("entrei no if");
 }
 System.out.println("A: "+a);
 System.out.println("B: "+b); // resultado será A: 10 e B: 21
 
 ```





