# Polimorfismo

- O polimorfismo permite "programar no geral" em vez de "programar no específico".
- Assim, é permitido escrever programas que processam objetos que compartilham a mesma superclasse, direta ou indiretamente, como se todos fossem objetos da superclasse.
- Permite que referências de tipos de classes mais abstratas representem o comportamento das classes concretas que referenciam. 
- Desse modo, é possível tratar vários tipos de maneira homogênea.
- As funções/métodos podem ser executados de formas diferentes.
- Os conceitos chaves para que o polimorfismo ocorra é a herança e a sobrescrita.
- Vale ressaltar que objetos nascem e morrem sendo do mesmo tipo.
- O polimorfismo usa a sobrescrita/reescrita, que é a maneira como uma subclasse pode redefinir o comportamento de um método que foi herdado de uma das suas superclasses (direta ou indiretamente).

    - Exemplo:
    
 ```java
 class Veiculo{
  public void turnon(){
    System.ot.println("Veiculo funcionando!");
  }
}
 
 class Carrro extends Veiculo{
  public void turnon(){
    System.out.println("Carro funcionando!");
  }
}

public class Test{
  public static void main(String [] args){
    Carro c = new Carro();
    c.turnon();
    
    Veiculo v = new Carror();
    v.turnon();
  }
}
 
```
 ## Casting
 
 - é utilizado para atribuições perigosas.
 - No exemplo a seguir não haverá erro de exceção.
 
 ```java
  Veiculo v = new Van("Gol","azul" , 2016);
  if (v instanceof Carro)
    Carro c = (carro) v;
  ```
 
