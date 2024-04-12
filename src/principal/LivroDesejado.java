package principal;

public class LivroDesejado {
	
	private Livro livro;
	private String indicadoPor;
	private String sinopse;
	private String interesse;
	
	public LivroDesejado(Livro livro, String indicadoPor, String sinopse, String interesse) {
		this.livro = livro;
		this.indicadoPor = indicadoPor;
		this.sinopse = sinopse;
		this.interesse = interesse;
	} 
	
	 
	public LivroDesejado(Livro livro, String indicadoPor) {
		this.livro = livro;
		this.indicadoPor = indicadoPor;
	} 
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getIndicadoPor() {
		return indicadoPor;
	}

	public void setIndicadoPor(String indicadoPor) {
		this.indicadoPor = indicadoPor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getInteresse() {
		return interesse;
	}

	public void setInteresse(String interesse) {
		this.interesse = interesse;
	} 
	
	public String toString() {
		return "Livro Desejado [Título: " + livro.getTitulo() + " Indicação: " + indicadoPor + " Sinopse: " + sinopse + " Interesse: " + interesse + "] ";
	}

}
