package resposta;

public class Produto {
	
	private static double precoKm;
	
	private double preco;
	private String nome, vendedor;
	private Data dataVenda;
	private double kmEntrega;
	
	
	public Produto() {
		
	}
	
	
	public Produto(double preco, String nome, String vendedor, 
			Data dataVenda, double kmEntrega) {
		
		this.preco = preco;
		this.nome = nome;
		this.vendedor = vendedor;
		this.dataVenda = dataVenda;
		this.kmEntrega = kmEntrega;
			
	}
	
	public double getCustoTotal() {
		return this.preco  = preco +(precoKm *kmEntrega);
	}	
		
	
	public double getPreco() {
        return preco;
    }
	
	public String getNome() {
        return nome;
    }
	
	public String getVendedor() {
        return vendedor;
    }
	public Data getDataVenda() {
        return dataVenda;
    }
	
	public  double getKmEntrega() {
        return kmEntrega;
    }
	
	public static double getPrecoKm() {
        return precoKm;
    }
	
	@Override
	public String toString() {
		return "Produto";
	}

}


