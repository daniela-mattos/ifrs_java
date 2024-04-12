package principal;

public class Autor {

	private String nome;
	private String cor;
	private String genero;
	private Pais pais;
	
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
	public Autor(String nome, String cor, String genero) {
		this.nome = nome;
		this.cor = cor;
		this.genero = genero;
	}

	public String getNomeAutor() {
		return nome;
	}

	public void setNomeAutor(String nome) {
		this.nome = nome;
	}

	public String getCorAutor() {
		return cor;
	}

	public void setCorAutor(String cor) {
		this.cor = cor;
	}

	public String getGeneroAutor() {
		return genero;
	}

	public void setGeneroAutor(String genero) {
		this.genero = genero;
	}

	public Pais getPaisAutor() {
		return pais;
	}

	public void setPaisAutor(Pais pais) {
		this.pais = pais;
	}
	
	public String toString() {
		return "Autor [Nome do Autor: " + nome + ", Cor do autor: " + cor + ", Gênero do autor: " 
	+ genero + ", País do Autor: " + pais + "]";
	}

	
}
