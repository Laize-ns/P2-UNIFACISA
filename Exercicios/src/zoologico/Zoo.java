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
				animal.emitirSom(); // é uma chamada polimórfica (aponta para anima, cachorro, cavalo ou preguiça)
				//animal.correr(); não é da classe animal
				//assim não pode fazer uma chamada polimorfica
				//daí deve usar condições para fazer a conversão (casting):
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
			
			Zoo zoo = new Zoo();//animais entrando na jaula(que é uma lista)
			zoo.addAnimal(new Animal("Nero"));
			zoo.addAnimal(new Cachorro("Lola"));
			zoo.addAnimal (new Cavalo("Trovão"));
			zoo.addAnimal(new Preguica("Dorminhoco"));
			
			
			zoo.cutucarAnimais();//vai executar de forma polimorfica "emitirSom"
		}
		
}
			
		
