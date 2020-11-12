package interfacesRestaurante;

public class Bebida implements Item{
	
	private SaborBebida sabor;
	private Tamanho tam;
	
	public Bebida(SaborBebida sabor, Tamanho tam) {
		this.sabor = sabor;
		this.tam = tam;
	}

	@Override
	public double getPreco() {
		return sabor.getValor() + tam.getValor();
	}

	@Override
	public String getDescricao() {
		return sabor.name()+" - "+tam.name();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Bebida) {
				Bebida beb = (Bebida) obj;
				if(beb.sabor.equals(this.sabor) &&
					beb.tam.equals(this.tam)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public SaborBebida getSabor() {
		return sabor;
	}
	
	public Tamanho getTam() {
		return tam;
	}
	



}
