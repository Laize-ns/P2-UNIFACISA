package ClasseObjeto;

public class Carros {
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	static boolean promocao;
	
	public Carros (String nome, String marca, int precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
		this.portas = 2;
		this.cor = "branca";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		
	}
	
	public Carros (String nome, String marca, String cor, int portas, 
			boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	public Carros() {
		// TODO Auto-generated constructor stub
	}

	public void Carro(){
		this.nome = "Gol";
		this.marca = "Volkswagen";
		this.cor = "BRANCA";
		this.portas = 4;
		this.vidroEletrico = true;
		this.arCondicionado = true;
		this.cambioAutomatico = true;
		this.direcaoEletrica = true;
		this.precoBase = 55000;
		
	}
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
		
			case "branca" :
			case "azul":
			case "vermelha" :
			case "preta" : break;
			default: preco += 1000;
			
		}
		
		if (vidroEletrico == true) {
			preco += 1250;
		}
		if (arCondicionado == true) {
			preco += 1250;
		}
		if (cambioAutomatico == true) {
			preco += 1250;
		}
		if (direcaoEletrica == true) {
			preco += 1250;
		}
		if (promocao == true) {
			preco *= 0.90;
		}
		
		return preco;
	}


//função toString, que nos dê todos os detalhes do carro, inclusive o preço total, 
//através da função calculaPreco.
	public  String toString() {
		String detalhe = " ";
		detalhe += "Nome: "+this.nome+"\n";
		detalhe += "Marca: "+this.marca+"\n";
		detalhe += "Cor: "+this.cor+"\n";
		detalhe += "Quantidade de Portas: "+this.portas+"\n";
		detalhe += "Vidro Elétrico: "+this.vidroEletrico+"\n";
		detalhe += "Ar Condicionado: "+this.arCondicionado+"\n";
		detalhe += "Cambio Automático: "+this.cambioAutomatico+"\n";
		detalhe += "Direção Elétrica: "+this.direcaoEletrica+"\n";
		detalhe += "Preço: "+calculaPreco()+"\n";
	
		return detalhe;
	}
}