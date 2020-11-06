# Interface

- É utilizada para definir e padronizar como coisas, pessoas e sistemas podem interagir entre si.
- Será utilizada para especificar quais as "operações"  podem ser permitidas para serem utilizadas, mas não especifica como serão realizadas.
- Assim, é possível descrever um conjunto de métodos que pode ser chamado em um objeto para instruí-lo para realizar alguma tarefa ou retornar informações.
- Uma declaração de interface é inicializada com a palavra-chave "interface" e contém apenas constantes e métodos abstract.
- Todos os membros de interface devem ser: public e não deve existir detalhes de especificação da implementação (declarações de métodos concretas, variáveis de instância...).
- Desse modo:
    - Métodos declarados na interface serão implicitamente métodos public abstract. 
    - Todos os campos são implicitamente public, static e final (variáveis constantes).
    
## Utilizando uma interface

- A classe concreta deverá especificar que ela implementa a interface e declarar cada método.
- Deverá ser utilizada a palavra-chave implements e o nome da interface ao final na primeira linha da declaração de classe.
- Se implementa todos os métodos é uma classe abstrata e deve ser utilizada o abstract.
- Quando implementa em uma classe concreta é necessário implementar todos os métodos.
- Ao herdar uma classe abstrata, a classe concreta deve implementar todos os métodos que não foram implementados ainda.
- Uma classe pode implementar diversas interfaces.
- Exemplo

```java
interface Veiculo{

  public abstract getVelocidade();
}

Class Carro implements Veiculo{

  public int getVelocidade();
    return 0;
  }
}

```


