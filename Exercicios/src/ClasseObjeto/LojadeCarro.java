package ClasseObjeto;

public class LojadeCarro {
	
	public static void main(String[] args) {
	
	
	 Carros palio1 = new Carros("Pálio", "Fiat", 35000);
     Carros palio2 = new Carros("Pálio", "Fiat", "Prateado", 2, false, false, false, false, 35000);     
     Carros civic = new Carros("Civic", "Honda", "preta", 2, true, true, true, true, 110000);   
     Carros corolla = new Carros("Corolla", "Toyota", "azul", 2, true, true, false, true, 110000);     
     Carros gol = new Carros();
     
     
     System.out.println(palio1);
     System.out.println(palio2);
     System.out.println(civic);
     System.out.println(corolla);
     System.out.println(gol);
     
	}


}
