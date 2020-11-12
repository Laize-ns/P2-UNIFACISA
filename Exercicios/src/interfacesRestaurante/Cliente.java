package interfacesRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int mesa;
	private List<Item> pedidos;
	
	public Cliente(int mesa) {
		this.mesa = mesa;
		this.pedidos = new ArrayList<Item>();
	}
	
	public double getConta() {
		double total = 0;
		for(Item item : pedidos) {
			//item pode apontar para uma instância de Refeição
				//nesse caso, a JVM executaria o getPreco de Refeição
			//item pode apontar para uma instância de Bebida
				//nesse caso, a JVM executaria o getPreco de Bebida
			total += item.getPreco();	//portanto, essa é uma chamada de função polimórfica
		}
		return total;
	}	
	
	public void adicionarPedido(Item item) {
		pedidos.add(item);
	}
	
	public void removerPedido(Item item) {
		pedidos.remove(item);
	}
	
	public int getMesa() {
		return mesa;
	}
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}


}
