# Arrays

- Arrays são objetos, e assim possuem: variáveis, métodos e se compararmos dois arrays com ==, os endereços de memória dos arrays são comparados, e não seu conteúdo.
- Arrays (ou arranjos/matrizes, em português) servem para armazenar um conjunto de valores. 
- Esses valores podem ser de tipos primitivos (int, long, float, double, boolean) bem como de tipos não-primitivos, que são as classes.
- Podemos criar os arrays sem conteúdo, mas definindo o tamanho do array. E também podemos criá-los com conteúdo.
- Para percorrer um array poderemos fazer isso com um for indexado, ou com um for-each.

## Arrays Multi-Dimensionais

- É possível criar arrays de arrays. É possivel criar arrays bidimensionais que podem ser representados por uma matriz.
- Também é possível criar arrays tridimensionais, e arrays n-dimensionais.
Para acessar um elemento desse array bidimensional, é preciso fornecer o índice da linha e o índice da coluna desejadas.

## Variáveis Arrays:
- length : determina o seu comprimento
- clone:permite criar uma cópia do array com conteúdo idêntido.
- toString: retorna identificador da classe + representação do endereço de memória, 
- equals: compara com ==.

## A Classe Arrays e alguns de seus métodos Estáticos

- Arrays.equals(Object o1, Object o2): compara os conteúdos dos arrays
- Arrays.sort(variável): ordena o array
- Arrays.toString(variável): retorna uma representação textual do array

## Exceções

- ArrayIndexOutOfBoundsException: ao acessar um elemento do array em um índice inexistente (ex: índice negativo, ou índice que extrapola o limite do array)
- NullPointerException: ao fazer qualquer operação em um objeto (array) mas o objeto não foi instanciado
