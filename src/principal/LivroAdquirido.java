package principal;

import java.util.Date;

public class LivroAdquirido {

	private Livro livroAdq;
	private String formato;
	private boolean disponivel;
	private Date data;
	private String aquisicao;
	private Estante estante;
	private Idioma idioma;
	private Ficha ficha;
	
	public LivroAdquirido(Livro livroAdq, Estante estante, String formato, String aquisicao, Idioma idioma) {
		this.livroAdq = livroAdq;
		this.estante = estante;
		this.formato = formato;
		this.aquisicao = aquisicao;
		this.idioma = idioma;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	//ver como implementa essa parte
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Livro getLivroAdq() {
		return livroAdq;
	}

	public void setLivroAdq(Livro livroAdq) {
		this.livroAdq = livroAdq;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAquisicao() {
		return aquisicao;
	}

	public void setAquisicao(String aquisicao) {
		this.aquisicao = aquisicao;
	}

	public Estante getEstante() {
		return estante;
	}

	public void setEstante(Estante estante) {
		this.estante = estante;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	
	public String toString() {
		return "Livro Adquirido [" + livroAdq + ", Estante" + estante + ", Formato " + formato + ", " + aquisicao + ", Idioma " + idioma + "] ";
	}
	
}
