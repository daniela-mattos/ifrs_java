package principal;

import java.util.Date;

public class RegistraLeitura {

	private LivroAdquirido livro;
	private int paginasLidas;
	private String anotacao;
	private Date data;
	
	public RegistraLeitura(LivroAdquirido livro, int paginasLidas, String anotacao, Date data) {
		this.livro = livro;
		this.paginasLidas = paginasLidas;
		this.anotacao = anotacao;
		this.data = data;
	}

	public LivroAdquirido getTitulo() {
		return livro;
	}

	public void setTitulo(LivroAdquirido titulo) {
		this.livro = titulo;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public String toString() {
		return "Registro de Leitura [Livro: " + livro + " Número de Páginas: " + paginasLidas + " Anotação: " + anotacao + "Data: " + data + "] ";
	}
	
}
