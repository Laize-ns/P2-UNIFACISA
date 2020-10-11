# Reuso

- O código duplicado deve ser evitado pois se houver alguma mudança em um determinado algoritmo, as ocorrências daquele algoritmo deverão ser procuradas e mudadas em seu programa.
- Formas de reúso de código: composição e herança.

## Composição

- Se uma classe Umtiver uma variável de referência cujo tipo é de uma outra classe Dois, dizemos que Um tem Dois. 
- Quando Um tem Dois, a classe Dois tem acesso a todas as variáveis e funções públicas de Dois. Assim, Um reusa o código de Dois. 
- A composição permite um relacionamento 1 para N (1 classe pode reutilizar múltiplas outras classes).

## Herança

- Em Java, podemos usar herança simples entre classes comm o extends.
- A nomenclatura usada é de classe mãe (parent class) e classe filha (child class), ou superclasse e subclasse.
- A herança entre classe permite que um código seja reaproveitado, de maneira que a clase filha reutilize o código da classe mãe.
- A classe filha especializa a mais genérica, é uma especialização da superclasse.
- Não é possível herdar de duas classes explicitamente, na composição isso é possível.
- Poderá ser entre classes reaproveitando membros, ou herança de umam interface que aproveita interfaces de métodos.
- Se uma determinada classe não declara explicitamente que herda de outra classe, então aquela classe herda da classe Object.

Exemplo de herança em três classes:

```java

class Um{
}
class Dois extends Um{
}
class Três extends Dois{
}
```

## Sobrescrita

- Na herança, uma classe herda atributos e métodos de outra classe (a depender da visibilidade) epoderão ser utilizados pelas sub-classes.
- Sempre que houver herança, e métodos de uma superclasse ficarem disponíveis para sub-classes, é possível haver sobrescrita. 
- A sobrescrita (ou reescrita) acontece quando uma sub-classe especializa um método herdado. 
- Especializar : é prover um funcionamento específico para aquele método (na sub-classe).

## @Override

- é opcional, mas recomendada, pois indica ao compilador que o programador tem a intenção de sobrescrever aquele método. 
- protected permite que as sub-classes consigam acessar alguns atributos. 
- Se os atributos forem privados, pode ser criado métodos acessadores getters públicos.

## super

- É usado para se referir à uma variável/método da superclasse. 

