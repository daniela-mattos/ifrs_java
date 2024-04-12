package principal;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
	
	private String nome;
	private String tema;
	private List<LivroAdquirido> livrosColecao = new ArrayList<LivroAdquirido>();
	
	
	public Colecao(String nome) {
		this.nome = nome;
	}
	
	public Colecao(String nome, String tema) {
		this.nome = nome;
		this.tema = tema;
	}
	
	public Colecao(String nome, String tema, LivroAdquirido livroColecao) {
		this.nome = nome;
		this.tema = tema;
		this.adicionaLivroColecao(livroColecao);
	}

	public String getNomeColecao() {
		return nome;
	}

	public void setNomeColecao(String nome) {
		this.nome = nome;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void adicionaLivroColecao(LivroAdquirido livroColecao) {
		this.livrosColecao.add(livroColecao);
	}
	
	public void removeLivro(LivroAdquirido livro) {
		this.livrosColecao.remove(livro);
	}
	
	public List<LivroAdquirido> getLivrosColecao() {
		return livrosColecao;
	}
	
	
	public String toString() {
	    return "Coleção [Nome: " + nome + ", tema: " + tema + "]";
	  }
	
}
