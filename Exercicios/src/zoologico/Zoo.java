package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoo{
		
		private List<Animal> jaulas;
		
		public Zoo() {
			jaulas = new ArrayList<Animal>();
		}
		
		public void addAnimal (Animal a) {
			jaulas.add(a);
		}
		
		public void cutucarAnimais() {
			
			for(Animal animal : jaulas) {
				animal.emitirSom(); // � uma chamada polim�rfica (aponta para anima, cachorro, cavalo ou pregui�a)
				//animal.correr(); n�o � da classe animal
				//assim n�o pode fazer uma chamada polimorfica
				//da� deve usar condi��es para fazer a convers�o (casting):
				if (animal instanceof Cachorro) {
					Cachorro cachorro = (Cachorro) animal;
					cachorro.correr();
				}else if (animal instanceof Cavalo){
					Cavalo cav = (Cavalo) animal;
					cav.correr();
				}else if (animal instanceof Preguica){
					Preguica p = (Preguica) animal;
					p.escalarArvore();
				}
			}
		
		}
		
		public static void main(String[] args) {
			
			Zoo zoo = new Zoo();//animais entrando na jaula(que � uma lista)
			zoo.addAnimal(new Animal("Nero"));
			zoo.addAnimal(new Cachorro("Lola"));
			zoo.addAnimal (new Cavalo("Trov�o"));
			zoo.addAnimal(new Preguica("Dorminhoco"));
			
			
			zoo.cutucarAnimais();//vai executar de forma polimorfica "emitirSom"
		}
		
}
			
		
