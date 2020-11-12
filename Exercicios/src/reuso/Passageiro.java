package reuso;


public class Passageiro extends Pessoa{
	
	//reuso de atributos e funções de Passageiro via herança
	
		
	public Passageiro(String nome, int senhaConta) {
			//toda classe, em seu construtor, tem uma 
			//chamada ao construtor da superclasse
		super(nome, senhaConta);
	}
		
	@Override
	public String toString() {
		String desc = "Passageiro\n";
		desc += super.toString();
		return desc;			
	}
}
