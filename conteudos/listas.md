# Listas

- É uma lista armazena elementos de um mesmo tipo, e conseguem mudar o tamanho em tempo de execução para acomodar elementos adicionais caso haja necessidade.
- Neste caso, o ArrayList aumentará pela metade, e não ocorrerá a exceção.
- É rápida no método get, pois permite acesso aleatório em tempo constante.
- Para utilizar deve importar a ArrayList: import java.utilArrayList
- Não armazenam tipos primitivos, apenas guardam objetos. 
- Os tipos primitivos básicos podem ser instanciados na forma de objeto  ao utilizar wrappers (empacotadores).

## Boxing
- a utilização de construtores para criar os wrappers não é recomendada pois é considerada obsoleta. 
- Um solução é o boxing que significa encaixotar, ou envolver. 
- Desse modo, é utilizado um tipo primitivo que é envolvido dentro de um wrapper, podendo ser de modo automático (autoboxing).
- Autoboxing pode ser usado nas seguintes condições:

    - Quando um valor primitivo é passado como um parâmetro para um método que espera um objeto. 
    - Quando um valor primitivo é atribuído a um wrapper. 

- unboxing:  usa um objeto wrapper e atribuia uma variável de tipo primitivo.

## ArrayList x LinkedList:

- O ArrayList é implementado com arrays para armazenar os objetos, assim são criados blocos contíguos de memória, o que aumenta a eiciência no acesso e alteração de valores dos elementos. Um lado negativo, é que caso não sejam utilizados, apenas ocupam espaço (desperdício de memória). 
- O LinkedList usa uma lista ligada, que nada mais são que objetos apontando para outros objetos, diferente dos blocos contínuos existentes nos arrays. Porém para chegar a um elemento, é necessário percorrer toda lista, dirente do array, que ocorre de maneira instantânea.

Para criar uma LinkedList:
```java
List<Integer> pares = new LinkedList<Integer>();
```
Para criar uma ArrayList:
```java
ArrayList<String> names = new ArrayList<String>();
```

## Exemplos de Métodos:

```java
names.add("aluno");   //adicionar itens

names.contains("aluno");   //verificar a existência na lista

names.remove("aluno");  //remove da lista

names.size(); //verifica o tamanho da ArrayList

names.addAll(names);   //adiciona uma coleção inteira

names.get(0); //devolve o elemento na posição desejada

names.indexOf; //retorna a primeira posição de elemento desejado

names.lastIndexOf; //retorna a última posição do elemento desejado

names.clear;  // remove todos os elementos do ArrayList

```



