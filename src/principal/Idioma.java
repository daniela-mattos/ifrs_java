package principal;

public class Idioma {

	private String idioma;
	
	public Idioma(String idioma) {
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String toString() {
		return "Idioma [Idioma: " + idioma + "] ";
	}
}
