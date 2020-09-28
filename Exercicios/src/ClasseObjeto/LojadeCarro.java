package ClasseObjeto;

public class LojadeCarro {
	
	
	 Carros palio1 = new Carros("Pálio", "Fiat", 35000);
    
     
     Carros palio2 = new Carros("Pálio", "Fiat", "Prateado", 2, false, false, false, false, 35000);
    
     
     Carros civic = new Carros("Civic", "Honda", "preta", 2, true, true, true, true, 110000);
     
     
     Carros corolla = new Carros("Corolla", "Toyota", "azul", 2, true, true, false, true, 110000);
     
     
     Carros gol = new Carros();
     
     
     System.out.println(palio1.toString());
     System.out.println(palio2.toString());
     System.out.println(civic.toString());
     System.out.println(corolla.toString());
     System.out.println(gol.toString());


}
