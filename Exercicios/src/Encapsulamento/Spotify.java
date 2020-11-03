package Encapsulamento;

public class Spotify {
	
	private Musica[] musicas;
	private int qtdMusicas;
	
	//construtor sem argumentos
	public Spotify() {
		this(10);
	}
	
	//construtor com argumentos
	public Spotify(int tamanhoArray) {
		this.musicas = new Musica[tamanhoArray];
		this.qtdMusicas = 0;
	}
	

	
	public void adicionarMusica(Musica m) {
		if(qtdMusicas >= musicas.length) {
			Musica[] aux = new Musica[2*musicas.length];
			for(int i = 0; i < musicas.length; i++) {
				aux[i] = musicas [i];
			}
			this.musicas = aux;
		}
		musicas[qtdMusicas] = m;
		qtdMusicas++;
	}
	
	public int getQtdMusicas() {
		return qtdMusicas;
	}
	
	public void removerMusicaPorNome(String nome) {
		boolean deslocarAEsquerda = false;
		for(int i = 0; i < this.qtdMusicas; i++) {
			if(musicas[i].getNome().equals(nome)) {
				deslocarAEsquerda = true;
				}
			if(deslocarAEsquerda) {
				this.musicas[i] = this.musicas[i+1];
			}
		}
	}
	
	public Musica[] listarMusicas(String artista) {
		int cont = 0;
		for(Musica m : musicas) {
			if(m != null && m.getArtista().equals(artista)) {
				cont++;
			}
		}
		if(cont > 0) {
			Musica[] musicasDoArtista = new Musica[cont];
			int i = 0;
			for(Musica m : musicas) {
				if(m != null && m.getArtista().equals(artista)) {
					musicasDoArtista[i] = m;
					i++;
				}
			}
			return musicasDoArtista;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Spotify spt = new Spotify(5);
		spt.adicionarMusica(new Musica("musica1", "artista1", "letra1", Genero.SAMBA, 2000, 3.75, 2));
		spt.adicionarMusica(new Musica("musica2", "artista2", "letra2", Genero.FORRO, 2000, 3.6, 2));
		spt.adicionarMusica(new Musica("musica3", "artista3", "letra3", Genero.BLUES, 2000, 3.5, 2));
		spt.adicionarMusica(new Musica("musica4", "artista4", "letra4", Genero.JAZZ, 2000, 3.2, 2));
		spt.adicionarMusica(new Musica("musica5", "artista5", "letra5", Genero.SAMBA, 2000, 3.3, 2));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		spt.adicionarMusica(new Musica("musica6", "artista6", "abc", Genero.BLUES, 2013, 3.1, 2));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		spt.removerMusicaPorNome("musica2");
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		Musica[] musicasArtista3 = spt.listarMusicas("artista3");
		
		for(Musica m : musicasArtista3) {
			System.out.println(m);
		}
		
	}
}