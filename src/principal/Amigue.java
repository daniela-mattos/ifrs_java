package principal;

public class Amigue {

	private String nome;
	private int telefone;
	private String email;
	
	public Amigue(String nome) {
		this.nome = nome;
	}
	
	public Amigue(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Amigue [Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email + "] ";
	}
	
}
