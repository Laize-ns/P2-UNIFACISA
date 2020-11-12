package interfacesRestaurante;

public enum SaborBebida {
	
	WHISKY(10.0), REFRIGERANTE(5.0), SUCO(6.5), CAFE(2.2);
	
	private double valor;
	
	SaborBebida(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
