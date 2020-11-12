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
			//item pode apontar para uma inst�ncia de Refei��o
				//nesse caso, a JVM executaria o getPreco de Refei��o
			//item pode apontar para uma inst�ncia de Bebida
				//nesse caso, a JVM executaria o getPreco de Bebida
			total += item.getPreco();	//portanto, essa � uma chamada de fun��o polim�rfica
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
