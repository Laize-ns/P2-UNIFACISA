package reuso;


public class Passageiro extends Pessoa{
	
	//reuso de atributos e fun��es de Passageiro via heran�a
	
		
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
