# Classe

- Classe é o que chamamos de especificação (planta baixa) e o objeto (casa) com detalhes diferentes (valores de atributos).
- Serve para especificar atributos de uma entidade (viva ou inanimada). Existem sem que o programa precise estar executando.
- Pode ter funções/métodos que são as capacidades/habilidade daquela classe/entidade.
- A partir da classe cria vários objetos.
- A classe agrupa variáveis. Ex. char sexo; int idade.
- Cada classe pode ter funções que só faz sentido se associada àquela entidade.
- A criação da classe Pessoa, por exemplo, com especificação como sexo, idade, nome e peso, pode criar vários objetos de pessoa, como por exemplo Pessoa p1, p2...

## Declarando uma classe

- Todo programa java consiste em pelo menos uma classe que deve ser definida. 
- A palavra-chave class introduz a declaração de uma classe e é imediatamente seguida pelo nome da classe. Exemplo: public class Pessoa
- Uma classe public deve ser inserida em um arquivo com o nome na forma NomeDaClasse.java. Exemplo. Pessoa.java
- Por convenção, os nomes de classes  iniciam com uma letra maiúscula e apresentam a letra inicial de cada palavra que eles incluem em maiúscula. Não inicie com dígitos e não contenha espaços.  Exemplo: NomeDaClasse

# Objeto

- O objeto é resultado da instanciação ou criação de entidade que só pode acontecer com o programa em execução. 
- A palavra reservada "new" é o que instancia um objeto. 

# Construtor

- É responsável por inicializar um objeto. Fica após os atributos. Não tem o nome da função apenas o tipo de retorno.
- Toda vez que chamar "new" seguido de um nome está chamando o construtor.
- Pode colocar construtor com argumentos na hora de instanciar o objeto.
- Se não especifica, a JVM automaticamente injeta o construtor default (construtor sem argumentos/vazio).
- "this" é usado para evitar ambiguidade.
- Construtores com argumentos podem ter argumentos com mesmos nomes das variáveis globais, mas para isto precisa usar o "this" para remover a ambiguidade ("this" referencia a variável global).

## Sobrecarga:

- é a possibilidade de ter diversos construtores.
- quando existe um construtor na classe, a JVM não injeta o construtor default.
    
    - Exemplo:
    
    ```java
    
    class Pessoa {  //cria a classe
    
      char sexo;    // cria atributos
      int idade;
      String nome;
      double peso;
      double altura;
      String cpf;
    
      
      Pessoa ( char sexo, int idade, String nome, double peso, double altura, String cpf) {
        this.sexo = sexo;
        this.idade = idade;    //construtor com argumentos
        this.nome = nome;       //global recebe o valor da local
        this.peso = peso;
        this.altura = altura;
        this.cpf = cpf;
        
      void calculaImc () {    //função que "printa" e não retorna nada (void).
        double imc = peso/(altura * altura) {
        if (imc < 16) {
          System.out.println ("Magreza grave");
        } else if (imc < 17) {
          System.out.println ("Magreza leve");
        } else if (imc < 18.5) {
          System.out.println ("Magreza leve");
        } else if (imc < 25) {
          System.out.println ("Saudável");
        } else if (imc < 30) {
          System.out.println ("Sobrepeso");
        } else if 9imc < 35) {
          System.out.println ("Obesidade I");
        } else if (imc < 40) {
          System.out.println ("Obesidade II");
        } else {
          System.out.println ("Obesidade III");
        }
      }
   }
   
   Class MainPessoa {     //objeto
   
    public static void main ( String[] args ) {
    
      char sexo = "masculino";
      int idade = 31;
      String nome = "Eduardo";
      double peso = "100.0;
      double altura = 1.85;
      String cpf = "029.380.278-99";
      
      Pessoa p1 = new Pessoa (sexo, idade, nome, peso, altura, cpf);    //criou o objeto
      
      p1.calculaImc(0;    //chama a função daquele objeto. executa a função.
      
    }
 }

## Como os espaços são alocados na memória?
 
 - Tipos primitivos são alocados diretamente na memória, e apenas um espaço de mémoria é suficiente, pois tipos primitivos têm um tamanho definido (sabemos o menor e o maior valor que um int, por exemplo, pode assumir).
 - Isto vale para todos: boolean, byte, short, int, long, char, double, float.
 - Para objetos, nós reservamos um espaço na memória para a variável de referência (ex.: p1), e outro espaço na memória para o objeto propriamente dito e seus atributos (que podem inclusive conter objetos).
        
   
          
    
    


