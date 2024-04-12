package principal;

public class Livro {

	private int isbn;
	private String titulo;
	private int ano;
	private int numPaginas;
	private String tituloOriginal;
	private Autor autorLivro;
	private Genero generoLivro;
	private Editora editoraLivro;
	
	
	public Livro(int isbn, String titulo, Autor autor, Editora editora, Genero generoLivro) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutorLivro(autor);
		this.setEditoraLivro(editora);
		this.setGeneroLivro(generoLivro);
	}
	
	public Livro(int isbn, String titulo, Autor autor, Editora editora, Genero generoLivro, int numPaginas, String tituloOriginal, int ano) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutorLivro(autor);
		this.setEditoraLivro(editora);
		this.setGeneroLivro(generoLivro);
		this.numPaginas = numPaginas;
		this.tituloOriginal = tituloOriginal;
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public Autor getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(Autor autorLivro) {
		this.autorLivro = autorLivro;
	}

	public Genero getGeneroLivro() {
		return generoLivro;
	}

	public void setGeneroLivro(Genero generoLivro) {
		this.generoLivro = generoLivro;
	}

	public Editora getEditoraLivro() {
		return editoraLivro;
	}

	public void setEditoraLivro(Editora editoraLivro) {
		this.editoraLivro = editoraLivro;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String toString() {
		    return "Livro [ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autorLivro
		        + ", Editora: " + editoraLivro + ", Genero: " + generoLivro + "] ";
		  }
	
}
