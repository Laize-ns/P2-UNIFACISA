package varinstanciaeclasse;

public class Carro {
	
	static boolean promocao; //variavel da classe
							//o construtor não vai precisar fazer referência, pois ele
							//ele inicia variaveis de instância(objeto)
	
	String nome, marca,cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	
	final double precoBase; //constante não muda
	
	Carro(String nome, String marca, double precoBase){
		
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

	public void Carro1(){
		this.nome = "Gol";
		this.marca = "Volkswagen";
		this.cor = "BRANCA";
		this.portas = 4;
		this.vidroEletrico = true;
		this.arCondicionado = true;
		this.cambioAutomatico = true;
		this.direcaoEletrica = true;
		
		
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
