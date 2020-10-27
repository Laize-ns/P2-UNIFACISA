package zoologico;

public class Animal {
	
	protected String nome;
	
	
	
	public Animal(String nome) {
		this.nome = nome;
		
	}


	public void emitirSom() {
		System.out.println("Animal emitindo som");
	}
	
	public  String getNome() {
	    return nome;
	}
	
	

}
