# String

- Não é um tipo primitivo, mas uma sequência de caracteres (texto).
- String é uma classe, com seus métodos.
- Quando criamos uma String estamos instanciando um objeto da classe String.
- Para criar uma String não é necessário utilizar a palavra "new".

## Principais operações:

- charAt(indice)
- indexOf
- contains
- lastIndexOf
- isEmpty
- replace
- substring
- toLowerCase
- toUpperCase

## Objetos, == e equals

- Valores que não são de tipos primitivos, == compara o endereço de memória dos objetos, assim o resultado será true se as duas variáveis se referirem ao mesmo objeto.
- O método equals compara o conteúdo dos objetos.

## String pool

- Se você instanciar uma String sem a palavra reservada new, então o Java tentará economizar memória, verificando se já existe um objeto com aquele mesmo conteúdo criado.
- Se existe o objeto, será reaproveitado e atribuindo seu endereço de memória à variável. 
- Se a String for criada usando a palavra reservada new, mesmo que exista um objeto String com aquele conteúdo criado, a JVM criará um novo objeto.
- Se for comparar o conteúdo, deve ser usado o método equals.

## Imutabilidade de Strings

- Strings são objetos imutáveis, assim toda vez que você altera uma String está criando um novo objeto String
- O anterior ficará ocupando espaço na memória até o Garbage Collector ser executado e removê-lo.

## StringBuilder

- Utilizado para economizar espaço na memória.
- Objetos de StringBuilder são mutáveis, desse modo ao alterar um StringBuilder, nenhum objeto adicional precisa ser criado.
- É recomendado em uma situação em que muitas operações são executadas nas Strings em pouco intervalo de tempo.
