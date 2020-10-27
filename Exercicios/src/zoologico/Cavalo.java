package zoologico;

public class Cavalo extends Animal {
	
	public Cavalo(String nome) {
		super(nome);	
	}
	
	@Override
	public void emitirSom() {

		System.out.println("Innnririririri");
	}
	
	public void correr() {
		System.out.println("Cavalo trotando");
		
	}
	

}
