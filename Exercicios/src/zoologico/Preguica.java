package zoologico;

public class Preguica extends Animal{
	
	public Preguica(String nome) {
		super(nome);	
	}
	
	@Override
	public void emitirSom() {
		
		System.out.println("ZZzzzzZZZZzzzz");
	}
	
	public void escalarArvore() {
		System.out.println("Nao");
	}

}
