# Listas

- É uma lista armazena elementos de um mesmo tipo, e conseguem mudar o tamanho em tempo de execução para acomodar elementos adicionais caso haja necessidade.
- É rápida no método get, pois permite acesso aleatório em tempo constante.
- Para utilizar deve importar a ArrayList: import java.utilArrayList

Para criar uma ArrayList:

```java
ArrayList<String> names = new ArrayList<String>();
```

## Método

```java
names.add("aluno");   //adicionar itens

names.contains("aluno");   //verificar a existência na lista

names.remove("aluno");  //remove da lista

names.size(); //verifica o tamanho da ArrayList

names.addAll(names);   //adiciona uma coleção inteira

names.get(0); //devolve o elemento na posição desejada

names.indexOf; retorna a primeira posição de elemento desejado

names.lastIndexOf;  retorna a última posição do elemento desejado

names.clear;  // remove todos os elementos do ArrayList

```


