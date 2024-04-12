package principal;

import java.util.ArrayList;
import java.util.List;

public class Estante {
	
	private String estante;
	private String local;
	private int capacidade;
	private List<LivroAdquirido> livrosEstante = new ArrayList<LivroAdquirido>();
	
	public Estante(String estante, String local) {
		this.estante = estante;
		this.local = local;
	}
	
	public String getNomeEstante() {
		return estante;
	}

	public void setNomeEstante(String estante) {
		this.estante = estante;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade (int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void adicionaLivroEstante(LivroAdquirido livroAdq) {
		this.livrosEstante.add(livroAdq);
	}
	
	public void removeLivro(LivroAdquirido livroAdq) {
		this.livrosEstante.remove(livroAdq);
	}
		
	public List<LivroAdquirido> getLivrosEstante() {
		return livrosEstante;
	}
	
	public String toString() {
		return "Estante [" + estante + ", Local: " + local + "] ";
	}
	
}
