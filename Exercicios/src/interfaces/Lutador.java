package interfaces;

public class Lutador {
	
	protected String nome;
	protected int vida;
	
	public Lutador (String nome) {
		this.vida = 100;
		this.nome = nome;
	}

	public void socar(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 7;
		}
	}
	
	public void chutar(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 5;
		}
	}
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	@Override
	public String toString() {
		return this.nome+" - Life: "+vida;
	}

}
