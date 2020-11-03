package Encapsulamento;

public class Musica1 {
	
	private String nome, artista, letra;
	private Genero genero;
	private int anoLancamento;
	private double duracao;
	private int numeroVezesReproducao;
	
	
	public Musica1(String nome, String artista, String letra, Genero genero,
			int anoLancamento, double duracao, int numeroVezesReproducao) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.numeroVezesReproducao = numeroVezesReproducao;
		
	}
	
	public void Musica(String nome2, String artista2, String letra2, Genero samba, int anoLancamento2, double duracao2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome(){
		return nome;	
	}
	
	
	public String getArtista() {
		return artista;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public Genero getGenero() {
		return genero;
	}


	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public int getNumeroVezesReproducao() {
		return numeroVezesReproducao;
	}
	
	public void tocarMusica() {
		this.numeroVezesReproducao++;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += "Nome: "+nome+"\n";
		out += "Artista: "+artista+" / "+"Letra: "+letra+" / "+"Genero: "+genero+"\n";
		out += "Ano de lançamento: "+anoLancamento+" / "+"Numero de reproduções: "+numeroVezesReproducao+" / "+"Duração: "+duracao+"\n";
		return out;
	}

}
