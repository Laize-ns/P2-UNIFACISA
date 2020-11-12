package reuso;

public class Motorista extends Pessoa{
	
	public Motorista(String nome, int senhaConta) {
		//toda classe, em seu construtor, tem uma 
		//chamada ao construtor da superclasse
		super(nome, senhaConta);
	}
	
	@Override
	public String toString() {
		String desc = "Motorista\n";
		desc += super.toString();
		return desc;			
	}	


}
