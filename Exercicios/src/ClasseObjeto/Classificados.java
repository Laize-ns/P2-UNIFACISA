package ClasseObjeto;

public class Classificados {
	
	public static void main(String[] args) {
		Imovel casa1 = new Imovel ("casa","Falcão", 3, 1, 2, 120, true, false);
		System.out.println(casa1.toString());
		
		Imovel apartamento1 = new Imovel ("Apartamento", "Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		System.out.println(apartamento1.toString());
		
		Imovel casa2 = new Imovel ("casa", "Altaman", 4, 2, 3, 240, true, true);
		System.out.println(casa2.toString());
		
		Imovel casa3 = new Imovel ("casa", "Leblon", 6, 3, 5, 540, true, true);
		System.out.println(casa3.toString());
		
		Imovel apartamento2 = new Imovel("Apartamento", "Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		System.out.println(apartamento2.toString());
	}
	

}
