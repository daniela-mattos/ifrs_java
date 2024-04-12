package principal;

public class Ficha {

	private LivroAdquirido livroFinalizado;
	private String resenha;
	private int nota;
	
	public Ficha(LivroAdquirido livroFinalizado, String resenha, int nota) {
		this.livroFinalizado = livroFinalizado;
		this.resenha = resenha;
		this.nota = nota;
	}

	public LivroAdquirido getLivroFinalizado() {
		return livroFinalizado;
	}

	public void setLivroFinalizado(LivroAdquirido livroFinalizado) {
		this.livroFinalizado = livroFinalizado;
	}

	public String getResenha() {
		return resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	public String toString() {
		return "Ficha [Livro: " + livroFinalizado + " Resenha: " + resenha + " Nota: " + nota + "] ";
	}
	
}
