# Classes Abstratas
- As classes abstratas não podem ser utilizadas para instanciar objetos pois são "incompletas". 
- As subclasses deverão declarar as partes "ausentes" para que se tornem classes concretas, daí será possível instanciar objetos. Elas fornecem implementação de cada código que elas declaram.
- Caso contrário, as subclasses também serão classes abstratas.
- O objetivo da classe abstrata é fornecer uma superclasse na qual as subclasses podem herdar e compartilhar um design comum.
- Classes e métodos poderão ser abstratos.
- Uma classe abstrata pode não ter nenhum método abstrato.
- Um método abstrato é um método sem corpo, somente com a definição.

## Criação da classe abstrata

- Será utilizada a palavra chave "abstract"
- Em geral uma classe abstrata apresenta um ou mais métodos abstratos (método de instância com a palavra-chave "abstract").
- Exemplo:

```java
public abstract void desenho();
```

- Vale lembrar que também é possível implementar interfaces em classes abstratas.
