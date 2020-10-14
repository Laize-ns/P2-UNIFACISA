package ClasseObjeto;

public class Imovel {
	
	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	public Imovel(String tipo, String imobiliaria, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean piscina, boolean quadra) {
		
		this.tipo = "casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros  = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	public Imovel(String tipo, String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, 
			int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		this.tipo = "apartamento";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	double calculaPreco() {
		double preco = metrosQuadrados * 5000;
		
		if (pavimento >= 5) {
			preco += 2000;			
		}
		if (elevador == true) {
			preco += 2500;
		}
		if (piscina == true) {
			preco += 2500;
		}
		if (quadra == true) {
			preco +=2500;
		}
		return preco;
	}
	
	public String toString() {
		
		String descrImovel = "";
		descrImovel += "Tipo: " + this.tipo + "\n";
		descrImovel += "Imobiliaria: " + this.imobiliaria + "\n";
		descrImovel += "Número de pavimentos: " + this.pavimentos + "\n";
		descrImovel += "Andar: " + this.pavimento + "\n";
		descrImovel += "Número de quartos: " + this.quartos + "\n";
		descrImovel += "Suítes: " + this.suites + "\n";
		descrImovel += "Banheiros: " + this.banheiros + "\n";
		descrImovel += "Metros Quadrados: " + this.metrosQuadrados + "\n";
		descrImovel += "Imobiliaria: " + this.imobiliaria + "\n";
		descrImovel += "Piscina: " + this.piscina + "\n";
		descrImovel += "Elevador: " + this.elevador+ "\n";
		descrImovel += "Quadra: " + this.quadra + "\n";
		descrImovel += "Valor total do imóvel: " + this.calculaPreco() + "\n";
		return descrImovel;
		
	}

}
