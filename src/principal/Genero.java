package principal;

public class Genero {

	private String nome;

	public Genero(String nome) {
		this.setNomeGenero(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNomeGenero(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Gênero [Gênero: " + nome + "] ";
	}
	
}
