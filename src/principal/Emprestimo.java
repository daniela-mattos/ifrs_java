package principal;

import java.util.Date;

public class Emprestimo {
	
	private Date data;
	private Amigue amigue;
	private LivroAdquirido tituloEmp;
	
	
	public Emprestimo(Amigue amigue, LivroAdquirido tituloEmp, Date data) {
		this.amigue = amigue;
		this.tituloEmp = tituloEmp;
		this.data = data;
	}


	public Date getData() {
		return data;
	}


	public void setDataEmp(Date data) {
		this.data = data;
	}


	public Amigue getNome() {
		return amigue;
	}


	public void setNome(Amigue nome) {
		this.amigue = nome;
	}


	public LivroAdquirido getTituloEmp() {
		return tituloEmp;
	}


	public void setTituloEmp(LivroAdquirido tituloEmp) {
		this.tituloEmp = tituloEmp;
	}
	
	public String toString() {
		return "Emprestimo [Para quem: " + amigue.getNome() + " Qual livro: " + tituloEmp.getLivroAdq().getTitulo() + " Data Empréstimo: " + data + "] ";
	}
		
	
}
