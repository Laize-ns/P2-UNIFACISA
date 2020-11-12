package reuso;

import java.util.ArrayList;
import java.util.List;

public class Uber {
	
public static void main(String[] args) {
		
		Passageiro p1 = new Passageiro("Lara", 123456);
		Passageiro p2 = new Passageiro("João", 123456);
		Passageiro p3 = new Passageiro("Carlos", 123456);
//		Motorista m = new Motorista("Pedro", 7891011);
		
		Data inicio = new Data(8,10,2020,11,23,0);
		Data fim = new Data(8,10,2020,11,30,0);
		List<Passageiro> passageiros = new ArrayList<Passageiro>();
		passageiros.add(p1);
		passageiros.add(p2);
		passageiros.add(p3);
		
		Corrida c1 = new CorridaPool(inicio,fim,5,passageiros);
		
		System.out.println(c1);
		
	}

}
