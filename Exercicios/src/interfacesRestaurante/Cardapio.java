package interfacesRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	private List<Bebida> bebidas;
	private List<Refeicao> refeicoes;
	
	//aprimorado com o uso de for e uma lista
	
	public Cardapio() {
		this.bebidas = new ArrayList<Bebida>();		
		SaborBebida[] sabores = SaborBebida.values();
		Tamanho[] tamanhos = Tamanho.values();		
		for(SaborBebida sabor : sabores) {
			for(Tamanho tamanho : tamanhos) {
				this.bebidas.add(new Bebida(sabor, tamanho));
			}
		}
		
		this.refeicoes = new ArrayList<Refeicao>();
		Proteina[] proteinas = Proteina.values();
		Carboidrato[] carboidratos = Carboidrato.values();
		for(Proteina proteina : proteinas) {
			for(Carboidrato carboidrato : carboidratos) {
				this.refeicoes.add(new Refeicao(proteina, carboidrato));
			}
		}
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public List<Item> getCardapio(){
		List<Item> cardapio = new ArrayList<Item>();
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		return cardapio;
	}

}
	
	/*private List<Bebida> bebidas;
	private List<Refeicao> refeicoes;
	
	public Cardapio() {
		this.bebidas = new ArrayList<Bebida>();
		//FIXME dá para reduzir a qtdade de linhas usando 2 for's
		this.bebidas.add(new Bebida(SaborBebida.REFRIGERANTE, Tamanho.PEQUENO));
		this.bebidas.add(new Bebida(SaborBebida.REFRIGERANTE, Tamanho.MEDIO));
		this.bebidas.add(new Bebida(SaborBebida.REFRIGERANTE, Tamanho.GRANDE));
		this.bebidas.add(new Bebida(SaborBebida.SUCO, Tamanho.PEQUENO));
		this.bebidas.add(new Bebida(SaborBebida.SUCO, Tamanho.MEDIO));
		this.bebidas.add(new Bebida(SaborBebida.SUCO, Tamanho.GRANDE));
		this.bebidas.add(new Bebida(SaborBebida.WHISKY, Tamanho.PEQUENO));
		//...
		
		this.refeicoes = new ArrayList<Refeicao>();
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.PURE));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.PURE));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO));
		//...
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public List<Item> getCardapio(){
		List<Item> cardapio = new ArrayList<Item>();
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		return cardapio;
	}

	public class Cardapio {

}/*/
