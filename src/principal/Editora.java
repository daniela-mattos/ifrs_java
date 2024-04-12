package principal;

public class Editora {

	private String nome;

	public Editora(String editora) {
		this.setNome(editora);
	}

	public String getNomeEditora() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Editora [Nome da Editora: " + nome + "] ";
	}
}
